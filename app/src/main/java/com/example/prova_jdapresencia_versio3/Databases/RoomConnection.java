package com.example.prova_jdapresencia_versio3.Databases;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.prova_jdapresencia_versio3.Dao.AsiDao;
import com.example.prova_jdapresencia_versio3.Models.Llista;

@Database(entities = {Llista.class} ,version = 1)
public abstract class RoomConnection extends RoomDatabase {

    private static RoomConnection INSTANCE;
    public abstract AsiDao asiDao();

    public static RoomConnection getRoomConnection(Context c){

        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(c,RoomConnection.class,"examen.db").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

    public static void destroyRoomConnection() {
        INSTANCE = null;
    }
}

