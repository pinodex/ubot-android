package uhackademia.stinovaliches.com.ubot;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class login_form extends AppCompatActivity {

    EditText anylinktext;
    FloatingActionButton floatbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        //anylinktext = findViewById(R.id.anylinktext);

        //String anylink = anylinktext.getText().toString();

            WebView browser = findViewById(R.id.webview);
            browser.setWebViewClient(new WebViewClient());
            browser.loadUrl("http://www.unionbankph.com/");

            floatbutton = findViewById(R.id.floatingActionButton);
            floatbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),chat_activity.class);
                    startActivity(intent);
                }
            });

    }
}
