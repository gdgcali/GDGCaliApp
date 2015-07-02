package co.com.android_dev.gdgcali.gdgcali.view.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

import co.com.android_dev.gdgcali.gdgcali.R;

/**
 * Created by user on 25/06/2015.
 */
public class SplashActivity extends Activity {
    private Thread mSplash;
    private SharedPreferences sharedPreferences;

    //SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;
    ImageView splashImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        final SplashActivity sSplash = this;
        // splashImageView = (ImageView) findViewById(R.id.SplashImageView);


        mSplash = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized (this) {
                        // Wait given period of time or exit on touch
                        wait(5000);
                    }
                } catch (InterruptedException ex) {
                }
                // splashImageView.setVisibility(View.INVISIBLE);
                finish();


                Intent intent = new Intent();
                intent.setClass(sSplash, MainActivity.class);
                startActivity(intent);

                mSplash.interrupt();
            }
        };
        mSplash.start();
    }


    /**
     * Processes splash screen touch events
     */
    @Override
    public boolean onTouchEvent(MotionEvent evt) {
        if (evt.getAction() == MotionEvent.ACTION_DOWN) {
            synchronized (mSplash) {
                mSplash.notifyAll();
            }
        }
        return true;
    }
}