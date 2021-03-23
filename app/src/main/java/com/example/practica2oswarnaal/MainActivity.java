package com.example.practica2oswarnaal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edNombre, edTelefono, edEmail, edTwitter;
    Button miBoton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miBoton = findViewById(R.id.bt_login);
        miBoton.setOnClickListener(click);

        // Recibiendo Intents con extras
        Bundle bundle = getIntent().getExtras();
        edNombre = findViewById(R.id.et_nombre);
        edTelefono = findViewById(R.id.et_telefono);
        edEmail = findViewById(R.id.et_email);
        edTwitter = findViewById(R.id.et_twitter);
        if (bundle != null) {
            edNombre.setText(bundle.getString("name"));
            edTelefono.setText(bundle.getString("telex"));
            edEmail.setText(bundle.getString("email"));
            edTwitter.setText(bundle.getString("twitter"));
        }
    }

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            edNombre = findViewById(R.id.et_nombre);
            edTelefono = findViewById(R.id.et_telefono);
            edEmail = findViewById(R.id.et_email);
            edTwitter = findViewById(R.id.et_twitter);

            Intent values = new Intent(MainActivity.this, MainActivity2.class);
            values.putExtra("nombre", edNombre.getText().toString());
            values.putExtra("telefono", edTelefono.getText().toString());
            values.putExtra("email", edEmail.getText().toString());
            values.putExtra("twitter", edTwitter.getText().toString());
            startActivity(values);


        }
    };
}