package cl.venegas.uga;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class SubscribeActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);

        // Inicializar el WebView
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); // Para abrir enlaces en el WebView

        // Configurar el WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Habilitar JavaScript si es necesario

        // Cargar la URL en el WebView
        webView.loadUrl("https://unagranavenida.cl/");
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack(); // Navegar hacia atrás en el historial del WebView
        } else {
            super.onBackPressed(); // Si no hay historial, salir de la actividad
        }
    }
}
