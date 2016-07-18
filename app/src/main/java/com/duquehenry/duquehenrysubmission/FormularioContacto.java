package com.duquehenry.duquehenrysubmission;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class FormularioContacto extends AppCompatActivity {

    DatosPersonales datosPersonales;
    TextInputLayout textInputLayoutNombre = (TextInputLayout) findViewById(R.id.textInputLayoutNombre);
    TextInputLayout textInputLayoutTelefono = (TextInputLayout) findViewById(R.id.textInputLayoutTelefono);
    TextInputLayout textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
    TextInputLayout textinputLayoutDescripcion = (TextInputLayout) findViewById(R.id.textinputLayoutDescripcion);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_contacto);
        datosPersonales = new DatosPersonales(
                textInputLayoutNombre.getEditText().getText().toString(),
                "",
                textInputLayoutTelefono.getEditText().getText().toString(),
                textInputLayoutEmail.getEditText().getText().toString(),
                textinputLayoutDescripcion.getEditText().getText().toString());

        Button botonSiguiente = (Button)findViewById(R.id.buttomSiguiente);
        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormularioContacto.this, ConfirmacionDatos.class);
                intent.putExtra(getResources()
                        .getString(R.string.confirmar_datos_nombre), datosPersonales.getNombre());
                intent.putExtra(getResources()
                        .getString(R.string.confirmar_datos_telefono_detalle),datosPersonales.getTelefono());
                intent.putExtra(getResources()
                        .getString(R.string.confirmar_datos_email_detalle),datosPersonales.getEmail() );
                intent.putExtra(getResources()
                        .getString(R.string.confirmar_datos_descripcion_detalle), datosPersonales.getDescripcion());

                startActivity(intent);
            }
        });
    }
}

