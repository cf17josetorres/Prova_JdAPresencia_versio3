package com.example.prova_jdapresencia_versio3.ui.Llistaesdeveniment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.example.prova_jdapresencia_versio3.Models.esdevenciment;

import java.util.ArrayList;

public class LlistesdevenimentFragment extends Fragment {
    private LlistadevenimentViewModel llistadevenimentViewModel;
    private ArrayList<esdevenciment> esdevenciments = new ArrayList<>();
    private final MutableLiveData<ArrayList<esdevenciment>> result = new MutableLiveData<>();

    public MutableLiveData<ArrayList<esdevenciment>> getResult() {
        return result;
    }
}
