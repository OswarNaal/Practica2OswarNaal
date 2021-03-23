package com.example.practica2oswarnaal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nameUser, tel, mail, twit;
    Button btSig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle Valores = getIntent().getExtras();
        String nom = Valores.getString("nombre");
        String phone = Valores.getString("telefono");
        String email = Valores.getString("email");
        String twitt = Valores.getString("twitter");

        nameUser = findViewById(R.id.tvnombre);
        nameUser.setText(nom);

        tel = findViewById(R.id.tvtelefono);
        tel.setText(phone);

        mail = findViewById(R.id.tvemail);
        mail.setText(email);

        twit = findViewById(R.id.tvtwitter);
        twit.setText(twitt);

        btSig= findViewById(R.id.bt_regresar);
        btSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent( MainActivity2.this, MainActivity.class);
                regresar.putExtra("name", nameUser.getText().toString());
                regresar.putExtra("telex", tel.getText().toString());
                regresar.putExtra("email", mail.getText().toString());
                regresar.putExtra("twitter", twit.getText().toString());
                startActivity(regresar);
            }
        });
    }
}