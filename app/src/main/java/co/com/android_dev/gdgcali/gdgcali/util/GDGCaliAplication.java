package co.com.android_dev.gdgcali.gdgcali.util;

import android.app.Application;

import co.com.android_dev.gdgcali.gdgcali.api.Server;

/**
 * Created by user on 25/06/2015.
 */
public class GDGCaliAplication extends Application {
    @Override
    public void onCreate(){
        Server.getInstance().init(EnvironmentFields.URL_SERVER, this);
    }
}
