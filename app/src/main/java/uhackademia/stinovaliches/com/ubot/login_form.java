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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        //anylinktext = findViewById(R.id.anylinktext);

        //String anylink = anylinktext.getText().toString();

        String redirecturi = "https://api-uat.unionbankph.com/partners/sb//convergent/v1/oauth2/authorize?client_id=6bdc184f-3004-4188-94c2-3785a1317fca&redirect_uri=https%3A%2F%2F61509fda.ngrok.io%2Fapi%2Fauth%2Foauth&response_type=code&type=linking&partnerId=5dff2cdf-ef15-48fb-a87b-375ebff415bb&scope=account_info";

            WebView browser = findViewById(R.id.webview);
            browser.setWebViewClient(new WebViewClient());
            browser.loadUrl(redirecturi);


    }
}
