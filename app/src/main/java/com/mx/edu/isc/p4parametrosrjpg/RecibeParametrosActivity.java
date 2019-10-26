package com.mx.edu.isc.p4parametrosrjpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecibeParametrosActivity extends AppCompatActivity {
TextView vnombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe_parametros);
        Bundle parametros=getIntent().getExtras();
        vnombre=(TextView) findViewById((R.id.lblparametros));
        vnombre.setText("Bienvenido "+parametros.getString("pnombre"));
    }
}
