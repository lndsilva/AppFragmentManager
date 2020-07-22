package br.com.local.appfragmentmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnConversa, btnContato;
    ConversasFragment conversasFragment;
    ContatosFragment contatosFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        btnContato = findViewById(R.id.btnContatos);
        btnConversa = findViewById(R.id.btnConversas);

        //criando o objeto fragment
        conversasFragment = new ConversasFragment();
        contatosFragment = new ContatosFragment();
/*
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.id_frame_conteiner, conversasFragment);
        transaction.commit();*/
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.id_frame_conteiner, conversasFragment);
        transaction.commit();

        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.id_frame_conteiner, contatoFragment);
                transaction.commit();*/
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.id_frame_conteiner, contatosFragment);
                transaction.commit();
            }
        });
        btnConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.id_frame_conteiner,conversasFragment);
                transaction.commit();
            }
        });


    }
}