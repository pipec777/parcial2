package com.example.aplicacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
public class MainActivity extends AppCompatActivity {

    public static final String ENVIAR_NOMBRE ="nombre";
    public static final String ENVIAR_APELLIDO = "apellido";
    public static final String ENVIAR_CEDULA = "cedula";
    public static final String ENVIAR_EMAIL = "e-mail";
    public static final String ENVIAR_CREDITOS = "creditos";
    private ImageView imagen;
    private Button siguiente;
    private EditText nombre;
    private EditText apellido;
    private EditText cedula;
    private EditText email;
    private EditText creditos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen=findViewById(R.id.imagen);
        siguiente=findViewById(R.id.siguiente1);
        nombre=findViewById(R.id.editTextTextPersonName);
        apellido=findViewById(R.id.editTextTextPersonName2);
        cedula=findViewById(R.id.editTextTextPersonName3);
        email=findViewById(R.id.editTextTextPersonName4);
        creditos=findViewById(R.id.editTextTextPersonName5);
        String url="https://colombiaestudia.com/wp-content/uploads/2021/07/logo_uniagustiniana.jpg";
        Uri urlparse = Uri.parse(url);
        Glide.with(getApplicationContext()).load(urlparse).into(imagen);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i = new Intent(MainActivity.this,segundo.class);

             String mensaje1 = nombre.getText().toString();
                String mensaje2 = apellido.getText().toString();
                String mensaje3 = cedula.getText().toString();
                String mensaje4 = email.getText().toString();
                String mensaje5 = creditos.getText().toString();

                i.putExtra(ENVIAR_NOMBRE, mensaje1);
                i.putExtra(ENVIAR_APELLIDO, mensaje2);
                i.putExtra(ENVIAR_CEDULA, mensaje3);
                i.putExtra(ENVIAR_EMAIL, mensaje4);
                i.putExtra(ENVIAR_CREDITOS, mensaje5);
                startActivity(i);


            }
        });
    }
      }
