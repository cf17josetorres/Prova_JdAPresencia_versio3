package com.example.prova_jdapresencia_versio3.Repository;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Repository.get(this);
    }
}
