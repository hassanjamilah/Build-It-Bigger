package com.andalus.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {


    public static final String EXTRA_JOKE = "extrajoke" ;
    private TextView jokeTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        jokeTextView = findViewById(R.id.JokeDisplayActivity_Joke_TextView)  ;

        if (getIntent() !=null){
            Bundle bundle = getIntent().getExtras()  ;
            String jokeText = bundle.getString(EXTRA_JOKE)  ;
            jokeTextView.setText(jokeText);
        }

    }
}
