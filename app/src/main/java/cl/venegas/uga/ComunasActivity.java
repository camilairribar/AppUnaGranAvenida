package cl.venegas.uga;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ComunasActivity extends AppCompatActivity {
    private ListView comunaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunas);

        comunaList = findViewById(R.id.comunaList);
        String[] comunas = {"Providencia", "Las Condes", "Ñuñoa", "Santiago Centro"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, comunas);
        comunaList.setAdapter(adapter);
    }
}
