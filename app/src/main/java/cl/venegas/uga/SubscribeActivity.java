package cl.venegas.uga;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SubscribeActivity extends AppCompatActivity {
    private EditText businessName, description, services, contact;
    private Button submitSubscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);

        businessName = findViewById(R.id.businessName);
        description = findViewById(R.id.description);
        services = findViewById(R.id.services);
        contact = findViewById(R.id.contact);
        submitSubscription = findViewById(R.id.submitSubscription);

        submitSubscription.setOnClickListener(v -> {
            String name = businessName.getText().toString();
            String desc = description.getText().toString();
            String serv = services.getText().toString();
            String cont = contact.getText().toString();

            if (name.isEmpty() || desc.isEmpty() || serv.isEmpty() || cont.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Suscripción completada", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
