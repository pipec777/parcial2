package com.example.aplicacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class segundo extends AppCompatActivity {
    private TextView textoPantalla1;
    private TextView textoPantalla2;
    private TextView textoPantalla3;
    private TextView textoPantalla4;
    private TextView textoPantalla5;
    private TextView textoPantalla6;
    private TextView textoPantalla7;
    private TextView textoPantalla8;
    private TextView textoPantalla9;
    private TextView textoPantalla10;
    private TextView textoPantalla11;
    private TextView textoPantalla12;
    private Button regreso;
    private ImageView imagendos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        regreso = findViewById(R.id.Regresar1);
        imagendos=findViewById(R.id.imagendos);
        textoPantalla1 = findViewById(R.id.texto1);
        textoPantalla2 = findViewById(R.id.texto2);
        textoPantalla3 = findViewById(R.id.texto3);
        textoPantalla4 = findViewById(R.id.texto4);
        textoPantalla5 = findViewById(R.id.texto5);
        textoPantalla6 = findViewById(R.id.textView3);

        textoPantalla6 = findViewById(R.id.textView2);
        textoPantalla7 = findViewById(R.id.textView4);
        textoPantalla8 = findViewById(R.id.textView5);
        textoPantalla9 = findViewById(R.id.textView6);
        textoPantalla10 = findViewById(R.id.textView7);
        String url = "https://i.ytimg.com/vi/xZbLVHpIBKg/maxresdefault.jpg";
        Uri urlparse = Uri.parse(url);
        Glide.with(getApplicationContext()).load(urlparse).into(imagendos);
        regreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(segundo.this, MainActivity.class);
                startActivity(i);

                Intent intent = getIntent();
                String mensaje1 = intent.getStringExtra(MainActivity.ENVIAR_NOMBRE);
                String mensaje2 = intent.getStringExtra(MainActivity.ENVIAR_APELLIDO);
                String mensaje3 = intent.getStringExtra(MainActivity.ENVIAR_CEDULA);
                String mensaje4 = intent.getStringExtra(MainActivity.ENVIAR_EMAIL);
                String mensaje5 = intent.getStringExtra(MainActivity.ENVIAR_CREDITOS);
            }
        });
    }

}
