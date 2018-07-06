package com.codepath.apps.restclienttemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ComposeActivity extends AppCompatActivity {

    Button bTweet;
    EditText et_simple;
    TwitterClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);


        String username = getIntent().getStringExtra("username");
        String inReplyTo = getIntent().getStringExtra("in_reply_to");
        int code = getIntent().getIntExtra("code", 0);

        EditText simpleEditText = findViewById(R.id.et_simple);
    }



    // ActivityTwo.java
    public void onSubmit(View v) {
        // closes the activity and returns to first screen
        et_simple = findViewById(R.id.et_simple);
        client =
        // Prepare data intent
        Intent i = new Intent();
        // Pass relevant data back as a result
        // Activity finished ok, return the data
        setResult(RESULT_OK, data); // set result code and bundle data for response
        finish(); // closes the activity, pass data to parent
    }

}
