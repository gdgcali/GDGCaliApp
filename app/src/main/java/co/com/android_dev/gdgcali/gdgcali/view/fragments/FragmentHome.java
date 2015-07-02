package co.com.android_dev.gdgcali.gdgcali.view.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import co.com.android_dev.gdgcali.gdgcali.R;
import co.com.android_dev.gdgcali.gdgcali.api.Server;
import co.com.android_dev.gdgcali.gdgcali.model.RecentPostAnswer;
import co.com.android_dev.gdgcali.gdgcali.util.EnvironmentFields;
import co.com.android_dev.gdgcali.gdgcali.view.adapters.RecentPostAdapter;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by user on 25/06/2015.
 */
public class FragmentHome extends Fragment implements SwipeRefreshLayout.OnRefreshListener {
    Context context;

    SwipeRefreshLayout swipeRefreshLayout;
    View screen;
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        screen = inflater.inflate(R.layout.fragment_home, container, false);
        listView = (ListView) screen.findViewById(R.id.id_list_home);
        context = getActivity().getApplicationContext();


        swipeRefreshLayout = (SwipeRefreshLayout) screen.findViewById(R.id.lySwipeRefreshHome);
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_orange_dark,
                android.R.color.holo_green_dark, android.R.color.holo_orange_dark,
                android.R.color.holo_green_dark);
        swipeRefreshLayout.setSize(SwipeRefreshLayout.LARGE);
        swipeRefreshLayout.setProgressBackgroundColor(android.R.color.transparent);
        swipeRefreshLayout.setProgressViewEndTarget(false, 800);


        loadRecentPost();
        return screen;

    }

    public void loadRecentPost() {

        Server.getSingleton().GetHome(EnvironmentFields.URL_GET_RECENT, new Callback<ArrayList<RecentPostAnswer>>() {
            @Override
            public void success(ArrayList<RecentPostAnswer> recentPostAnswers, Response response) {
                RecentPostAdapter adapter = new RecentPostAdapter(context, recentPostAnswers, R.layout.item_fragment_home);
                listView.setAdapter(adapter);

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    @Override
    public void onRefresh() {
        (new android.os.Handler()).postDelayed(new Runnable() {
            @Override
            public void run() {
                loadRecentPost();
                swipeRefreshLayout.setRefreshing(false);

            }
        }, 3000);
    }
}
