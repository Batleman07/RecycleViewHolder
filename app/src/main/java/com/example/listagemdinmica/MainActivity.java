package com.example.listagemdinmica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        // listagem de filmes
        this.criarFilmes();
        // 2º configurar o adapter
        Adapter adapter = new Adapter(listaFilmes);

        // 1º configurações de layout
        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

    }
    public void criarFilmes()
    {
        Filme filme= new Filme("Homem aranha","aventura","2015");
        listaFilmes.add(filme);
         filme= new Filme("John Wick","Ação","2020");
        listaFilmes.add(filme);
         filme= new Filme("Vingadores","aventura","2021");
        listaFilmes.add(filme);
         filme= new Filme("007","Suspense","2015");
        listaFilmes.add(filme);
         filme= new Filme("Didi","aventura","2015");
        listaFilmes.add(filme);

    }
}