package uhackademia.stinovaliches.com.ubot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class login_form extends AppCompatActivity {

    EditText anylinktext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        //anylinktext = findViewById(R.id.anylinktext);

        //String anylink = anylinktext.getText().toString();
        WebView browser = findViewById(R.id.webview);
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl("http://www.unionbankph.com/");
        //Intent intent = new Intent(this,chat_activity.class);
        //startActivity(intent);
    }
}
