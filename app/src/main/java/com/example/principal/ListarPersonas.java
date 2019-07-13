package com.example.principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarPersonas extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Persona> personas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);
        tabla = findViewById(R.id.tabla);
        personas = Datos.obtener();
        for(int i =0; i<personas.size(); i++){
           //Creo el objeto Fila
            TableRow fila = new TableRow(this);
            //Creo los objetos Columnas
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            //La primera columna la lleno con un autoincremental
            c1.setText(""+(i+1));
            //La segunda columna la lleno con la cedula de la persona
            c2.setText(personas.get(i).getCedula());
            //La tercera columna la lleno con el nombre de la persona
            c3.setText(personas.get(i).getNombre());
            //La cuarta columna la lleno con el apellido de la persona
            c4.setText(personas.get(i).getApellido());

            // Le paso las columnas a la fila
            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            //Le paso la fila a la tabla
            tabla.addView(fila);
        }
    }
}
