package com.baneofsociety.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class Example8 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example8);
    }

    protected void transition(View view){
        Intent intent = new Intent(this, abusivebehavior3.class);
        startActivity(intent);
    }

}
