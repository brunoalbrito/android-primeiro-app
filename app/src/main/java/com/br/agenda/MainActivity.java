package com.br.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_alunos);
        List alunos = Arrays.asList("Bruno", "Carlos", "Ana", "Gabriela", "Nicole");
        listaDeAlunos.setAdapter(simpleListView(alunos));
        super.onCreate(savedInstanceState);
    }

    private ArrayAdapter simpleListView(List alunos) {
        return new ArrayAdapter(this, android.R.layout.simple_list_item_1, alunos);
    }
}
