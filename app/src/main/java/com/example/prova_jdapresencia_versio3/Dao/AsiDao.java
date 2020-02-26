package com.example.prova_jdapresencia_versio3.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.prova_jdapresencia_versio3.Models.Llista;

import java.util.List;

@Dao
public interface AsiDao {

    @Insert
    void insertLlista(Llista b);

    @Query("SELECT * FROM  Llista where llistadesdeveniments = :title")
    Llista checkLlistaExists(String title);

    @Query("SELECT * FROM Llista")
    List<Llista> getBooks();

    @Query("SELECT * FROM Llista where llistadesdeveniments = :title")
    Llista getLlista(String title);

    @Delete
    void deleteLlista(Llista b);
}
