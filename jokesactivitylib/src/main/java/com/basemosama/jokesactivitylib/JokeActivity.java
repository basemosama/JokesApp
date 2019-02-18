package com.basemosama.jokesactivitylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.basemosama.jokesactivitylib.R;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeTv=findViewById(R.id.joke_tv);
      String joke = getIntent().getStringExtra(getString(R.string.joke_key));

      if( joke.isEmpty() || joke.equals(getString(R.string.default_error_message))) {
          Toast.makeText(this,R.string.error_message,Toast.LENGTH_SHORT).show();
      }else {
          jokeTv.setText(joke);
      }



    }
}
