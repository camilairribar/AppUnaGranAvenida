package cl.venegas.uga;

import android.content.Intent;
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
        setContentView(R.layout.activity_main);

        buttonContactos = findViewById(R.id.button_contactos);
        buttonNegocios = findViewById(R.id.button_negocios);
        buttonNoticias = findViewById(R.id.button_noticias);
        buttonSubscribe = findViewById(R.id.button_subscribe);

        buttonContactos.setOnClickListener(v -> openCategories());
        buttonNegocios.setOnClickListener(v -> openComunas());

        buttonSubscribe.setOnClickListener(v -> openSubscribe());
    }

    private void openCategories() {
        startActivity(new Intent(this, CategoriesActivity.class));
    }

    private void openComunas() {
        startActivity(new Intent(this, ComunasActivity.class));
    }



    private void openSubscribe() {
        startActivity(new Intent(this, SubscribeActivity.class));
    }
}
