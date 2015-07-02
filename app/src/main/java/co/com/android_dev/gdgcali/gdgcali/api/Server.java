package co.com.android_dev.gdgcali.gdgcali.api;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by user on 25/06/2015.
 */
public class Server {private static Server instance;
    private IServer facade;

    protected Server() {
    }

    public static Server getInstance() {
        if (instance == null) {
            instance = new Server();
        }
        return instance;
    }

    public void init(String url, final Context context) {

        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new ItemTypeAdapterFactory()) // This is the important line ;)
                .create();


        RestAdapter AdapterWithHeaders = new RestAdapter.Builder()
                .setEndpoint(url)
                .setConverter(new GsonConverter(gson))
                .build();
        facade = AdapterWithHeaders.create(IServer.class);
    }

    public static IServer getSingleton() {
        return getInstance().facade;
    }
}
