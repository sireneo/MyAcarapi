package com.rac.org;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtCodigo,edtNombre,edtDireccion,edtTelefono;
    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtCodigo=(EditText)findViewById(R.id.edtCodigo);
        edtNombre=(EditText)findViewById(R.id.edtNombre);
        edtDireccion=(EditText)findViewById(R.id.edtDireccion);
        edtTelefono=(EditText)findViewById(R.id.edtTelefono);
        btnAgregar=(Button) findViewById(R.id.btnAgregar);

        final ConexionSQLiteHerper conexionSQLiteHerper=new ConexionSQLiteHerper(getApplicationContext());


    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                