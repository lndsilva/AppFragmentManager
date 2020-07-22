package br.com.local.appfragmentmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnConversa, btnContato, btnConfiguracoes;
    ConversasFragment conversasFragment;
    ContatosFragment contatosFragment;
    ConfiguracoesFragment configuracoesFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tirando a linha de elevação do appBar
        getSupportActionBar().setElevation(0);

        btnContato = findViewById(R.id.btnContatos);
        btnConversa = findViewById(R.id.btnConversas);
        btnConfiguracoes = findViewById(R.id.btnConfiguracoes);

        //criando o objeto fragment
        conversasFragment = new ConversasFragment();
        contatosFragment = new ContatosFragment();
        configuracoesFragment = new ConfiguracoesFragment();
/*
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.id_frame_container, conversasFragment);
        transaction.commit();*/
        //Janela que será carregada primeiro
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.id_frame_container, conversasFragment);
        transaction.commit();

        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.id_frame_conteiner, contatoFragment);
                transaction.commit();*/
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.id_frame_container, contatosFragment);
                transaction.commit();
            }
        });
        btnConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.id_frame_container,conversasFragment);
                transaction.commit();
            }
        });

        btnConfiguracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.id_frame_container,configuracoesFragment);
                transaction.commit();
            }
        });


    }
}