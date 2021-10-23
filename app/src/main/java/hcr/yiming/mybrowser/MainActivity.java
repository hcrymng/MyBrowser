package hcr.yiming.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button goBtn;
EditText txtaddress;
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goBtn = findViewById(R.id.goBtn);
        txtaddress = findViewById(R.id.txtAddress);
        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
    if((getIntent()!= null) && (getIntent().getData()!= null)){
        txtaddress.setText(getIntent().getData().toString());
        webView.loadUrl(getIntent().getData().toString());
    }
        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.loadUrl("http://"+txtaddress.getText());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu ,menu);
        return super.onCreateOptionsMenu(menu);
    }
}