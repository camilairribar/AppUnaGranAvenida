package cl.venegas.uga;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageButton buttonContactos, buttonNegocios, buttonNoticias;
    private Button buttonSubscribe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Muestra el layout principal de la aplicación

        buttonContactos = findViewById(R.id.button_contactos);
        buttonNegocios = findViewById(R.id.button_negocios);
        buttonNoticias = findViewById(R.id.button_noticias);
        buttonSubscribe = findViewById(R.id.button_subscribe);

        buttonContactos.setOnClickListener(v -> openContactos());
        buttonNegocios.setOnClickListener(v -> openNegocios());
        buttonNoticias.setOnClickListener(v -> openNoticias());
        buttonSubscribe.setOnClickListener(v -> openSubscribe());
    }

    private void openContactos() {
        startActivity(new Intent(this, Contacto_uga.class));
    }

    private void openNegocios() {
        // URI de Google Maps para la ubicación exacta
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Región+Metropolitana+8320000+Metropolitana+CL");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps"); // Asegura que se abra en Google Maps
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

    private void openNoticias() {
        startActivity(new Intent(this, CategoriesActivity.class));
    }

    private void openSubscribe() {
        startActivity(new Intent(this, SubscribeActivity.class));
    }
}
