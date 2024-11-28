package cl.venegas.uga;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Contacto_uga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto_uga); // Asegúrate de usar el layout correcto

        ImageView imageCall = findViewById(R.id.botonLlamar);
        ImageView imageEmail = findViewById(R.id.botonEmail); // Agregar referencia al ícono de correo

        // Implementar la funcionalidad de llamada
        imageCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "tel:+56 9 2691 4140"; // Reemplaza con el número de teléfono real
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(phoneNumber));
                startActivity(callIntent);
            }
        });

        // Implementar la funcionalidad de envío de correo
        imageEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:mgomezvalverde@gmail.com")); // Reemplaza con el correo real
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Asunto del correo");
                startActivity(Intent.createChooser(emailIntent, "Enviar correo"));
            }
        });
    }
}
