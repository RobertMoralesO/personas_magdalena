package com.example.principal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private ListView lista;
    private String[] opciones;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.lstOpciones);
        opciones = getResources().getStringArray(R.array.opciones_lista);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,opciones);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        i = new Intent(Principal.this, CrearPersonas.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Principal.this, ListarPersonas.class);
                        startActivity(i);
                        break;
                }
            }
        });




    }
}
