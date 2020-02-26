package com.example.prova_jdapresencia_versio3.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Llista {

    @PrimaryKey(autoGenerate = true)
    private int LlistaId;

    @NonNull
    private String llistadesdeveniments;

    @NonNull
    private String nouesdeveniment;

    public Llista() {
    }

    public int getLlistaId() {
        return LlistaId;
    }

    public void setLlistaId(int llistaId) {
        LlistaId = llistaId;
    }

    @NonNull
    public String getLlistadesdeveniments() {
        return llistadesdeveniments;
    }

    public void setLlistadesdeveniments(@NonNull String llistadesdeveniments) {
        this.llistadesdeveniments = llistadesdeveniments;
    }

    @NonNull
    public String getNouesdeveniment() {
        return nouesdeveniment;
    }

    public void setNouesdeveniment(@NonNull String nouesdeveniment) {
        this.nouesdeveniment = nouesdeveniment;
    }
}
