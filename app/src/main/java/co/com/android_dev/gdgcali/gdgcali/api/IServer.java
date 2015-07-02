package co.com.android_dev.gdgcali.gdgcali.api;

import java.util.ArrayList;

import co.com.android_dev.gdgcali.gdgcali.model.RecentPostAnswer;
import co.com.android_dev.gdgcali.gdgcali.util.EnvironmentFields;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by user on 25/06/2015.
 */
public interface IServer {
    @GET("/")
    void GetHome(@Query("json") String json, Callback<ArrayList<RecentPostAnswer>> resp);

    @GET(EnvironmentFields.URL_EVENTOS)
    void GetEventos(@Query("json") String json, Callback<ArrayList<RecentPostAnswer>> resp);

    @GET(EnvironmentFields.URL_SOMOS)
    void GetSomos(@Query("json") String json, Callback<ArrayList<RecentPostAnswer>> resp);

    @GET(EnvironmentFields.URL_LIDERES)
    void GetLideres(@Query("json") String json, Callback<ArrayList<RecentPostAnswer>> resp);

    @GET(EnvironmentFields.URL_CONTACTO)
    void GetContactenos(@Query("json") String json, Callback<ArrayList<RecentPostAnswer>> resp);
}
