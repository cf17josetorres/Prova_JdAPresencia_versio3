package com.example.prova_jdapresencia_versio3.Databases;

public class DBDesign {
    private DBDesign(){}

    public static final String DROP_TABLE = "DROP TABLE IF EXISTS "+EventDetail.USER_TABLE;

    public static final String EventDetail_CREATE_TABLE = "CREATE TABLE "+EventDetail.USER_TABLE+"("+
            EventDetail.Title+" VARCHAR(100) PRIMARY KEY AUTOINCREMENT NOT NULL,"+
            EventDetail.Place+" VARCHAR(50) UNIQUE NOT NULL,"+
            EventDetail.Room+" VARCHAR(50) NOT NULL,"+
            EventDetail.People+" INT NOT NULL"+
            EventDetail.EvDate+ "date)";


    public static class EventDetail {

        public static final String USER_TABLE = "Users";
        //Columns
        public static final String Title = "UserID"; // PK
        public static final String Place = "Username"; // 20
        public static final String Room = "Password"; // 20
        public static final String People = "EmailAddress"; // 40
        public static final String EvDate = "EmailAddress"; // 40

    }

}
