package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Pair;
import android.widget.Toast;

import com.andalus.mylibrary.JokeDisplayActivity;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

public  class EndpointsAsyncTask extends AsyncTask<Context, Void, String> {
    private static MyApi myApiService = null;
    private Context context;



    @Override
    protected String doInBackground(Context... params) {





        if(myApiService == null) {  // Only do this once

            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            myApiService = builder.build();
        }

        context = params[0];



        try {
            return myApiService.getJoke().execute().getData();
        } catch (IOException e) {
            showIndicatorInMainActivity(false);
            return null;
        }
    }

    @Override
    protected void onPostExecute(String result) {
        showIndicatorInMainActivity(false);





        if (result !=null){
            startViewActivity(result) ;
        }else {
            MainActivity.activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    String s = context.getResources().getString(R.string.error);
                    Toast.makeText(context, s, Toast.LENGTH_LONG).show();
                }
            });
        }

    }

    private void startViewActivity(String jokeText) {


        Intent intent = new Intent (context , JokeDisplayActivity.class) ;
        intent.putExtra(JokeDisplayActivity.EXTRA_JOKE , jokeText) ;
        context.startActivity(intent);



    }

    private void showIndicatorInMainActivity(final boolean b){
        MainActivity.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                MainActivity.showIndicator(b);

            }
        });
    }
}