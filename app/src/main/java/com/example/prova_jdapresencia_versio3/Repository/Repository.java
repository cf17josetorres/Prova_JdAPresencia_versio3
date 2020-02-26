package com.example.prova_jdapresencia_versio3.Repository;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.prova_jdapresencia_versio3.Databases.RoomConnection;
import com.example.prova_jdapresencia_versio3.Models.Llista;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Repository {

    private static Context c;
    private static Repository srepository;
    private static FirebaseDatabase firebaseDatabase;

    // *** PostgreSQL Constants ***
    private static String driverLocation = "org.postgresql.Driver";
    private static String postgresConnection = "jdbc:postgresql://192.168.0.22:5432/esdeveniments";
    private static String postgresUsername = "hedy";
    private static String postgresPassword = "lamarr";
    // *** End of PostgreSQL String ***


    private Repository(Context c){
        this.c = c;
        firebaseDatabase = FirebaseDatabase.getInstance();
    }

    public static Repository get(Context context) {
        if (srepository == null) {
            srepository = new Repository(context);
        }
        return srepository;
    }

    private static Connection connection = null;

    public static Connection openPostgresConnection(){
        try {
            Class.forName(driverLocation);

            connection = DriverManager.getConnection(postgresConnection,postgresUsername,
                    postgresPassword);

            if (connection != null){
                Log.d("PostgreSQL","Connected to the postgres server successfully");
            } else {
                Log.d("PostgreSQL","Failed to connect");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
