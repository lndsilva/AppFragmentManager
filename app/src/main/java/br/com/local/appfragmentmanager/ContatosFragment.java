package br.com.local.appfragmentmanager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContatosFragment extends Fragment {

    TextView txtContatos;

    public ContatosFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_contatos, container, false);

        txtContatos = view.findViewById(R.id.txtContatos);

        txtContatos.setText("Contato alterado");

        return view;
    }
}
