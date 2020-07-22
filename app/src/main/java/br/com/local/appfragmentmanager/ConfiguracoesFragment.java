package br.com.local.appfragmentmanager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ConfiguracoesFragment extends Fragment {

    TextView txtConfiguracoes;
    ImageView imgConfiguracoes;


    public ConfiguracoesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_configuracoes, container, false);

        txtConfiguracoes = view.findViewById(R.id.txtConfiguracoes);

        txtConfiguracoes.setText("Configurações do sistema");




        return view;
    }
}