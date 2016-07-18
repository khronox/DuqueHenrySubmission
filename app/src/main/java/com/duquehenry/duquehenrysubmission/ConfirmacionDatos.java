package com.duquehenry.duquehenrysubmission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ConfirmacionDatos extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextTelefono;
    private EditText editTextEmail;
    private EditText editTextDescripcionContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString("nombre");
        String telefono = parametros.getString("telefono");
        String email = parametros.getString("email");
        String descripcion = parametros.getString("descripcion");

        editTextNombre = (EditText) findViewById(R.id.editTextNombre);
        editTextTelefono = (EditText) findViewById(R.id.editTextTelefono);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextDescripcionContacto = (EditText) findViewById(R.id.editTextDescripcionContacto);

        editTextNombre.setText(nombre);
        editTextTelefono.setText(telefono);
        editTextEmail.setText(email);
        editTextDescripcionContacto.setText(descripcion);
    }
}
