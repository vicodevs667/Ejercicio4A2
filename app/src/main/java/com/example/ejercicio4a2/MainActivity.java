package com.example.ejercicio4a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//Una pantalla
public class MainActivity extends AppCompatActivity {
    //Atributos
    private EditText etPalabra;
    private Button btnProcesar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mi_propia_pantalla);

        inicializarVistas();
        /*
        Cuando ustedes pasan parametros a una funcion o metodo
            - Tipos de datos Primitivos : String, int, float, boolean, ....
            - Tipos de datos -> Clases u objetos: Persona, Doctor,....
            - Como parametros -> otras funciones.... como funciones anonimas
            - El metodo recibe la funcion o metodo y lo ejecuta en su procedimiento

         */

        //Que el onClick solo existe para ese boton en particular
        //Estan pasando como parametro la implementacion de una interfaz anonima
        //Pasando a una funcion, otra funcion que se debe ejecutar....
        /*
        btnProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarMensaje();
            }
        });
        */
        //Funciones Lambda, funciones de flecha, Arrow functions
        btnProcesar.setOnClickListener(view -> {
            mostrarMensaje();
            //PRocedmientos
            //Procedimiento
        });
        char letra = 'a';
    }

    private void inicializarVistas() {
        etPalabra = findViewById(R.id.etPalabra);
        btnProcesar = findViewById(R.id.btnProcesar);
    }

    private void mostrarMensaje() {
        /*
        Ventana emergente en pantalla, pequeña y casual
        se muestra durante unos instantes, y  es para
        mostrar algo particular al usuario.....
        el componente se llama Toast, para configurarlo necesitas
        aplicar un método llamado .makeText() que tiene una serie de parametros:
            - Ambito o contexto de la pantalla donde se va a dibujar.
            - Cadena de texto que deseas que se muestre al usuario.
            - Duración de la ventana, esta configurada sobre 2 constantes ya establecidas
         Finalmente para mostrar esa ventana tienen que usar un método
         llamado .show()
         */
        String mensaje = "Bendito contexto!";
        //Metodos y atributos estáticos
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
}





























