package uhackademia.stinovaliches.com.ubot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ubot_splashscreen extends AppCompatActivity {
    private ImageView splashimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubot_splashscreen);

        splashimage = findViewById(R.id.splashimage);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        splashimage.startAnimation(myanim);
        final Intent i = new Intent(this,chat_activity.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(5000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
