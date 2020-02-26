package com.example.prova_jdapresencia_versio3.ui.Llistaesdeveniment;

import android.os.AsyncTask;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.prova_jdapresencia_versio3.Models.esdevenciment;
import com.example.prova_jdapresencia_versio3.Repository.Repository;

import java.sql.Connection;
import java.util.ArrayList;

public class LlistadevenimentViewModel extends ViewModel {

    public static class llistaresdevenim extends AsyncTask<Void, Void, ArrayList<esdevenciment>> {

        ArrayList<esdevenciment> llistadeesdeveniment = new ArrayList<>();

        private final MutableLiveData<ArrayList<esdevenciment>> result = new MutableLiveData<>();

        public MutableLiveData<ArrayList<esdevenciment>> getResult() {
            return result;
        }

        @Override
        protected ArrayList<esdevenciment> doInBackground(Void... voids) {
            Connection c = Repository.openPostgresConnection();

            if (c != null) {
                String seleccionaevent = "SELECT * FROM EventDetail";
            }

            return null;
        }
    }
}
