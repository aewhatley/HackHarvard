package com.baneofsociety.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class abusivebehavior3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abusivebehavior3);
    }

    protected boolean clicked1(View view){
        return true;
    }

    protected boolean clicked2(View view){
        return true;
    }

    protected boolean clicked3(View view){
        return true;
    }

    protected boolean clicked4(View view){
        return true;
    }

    protected void transition(View view){
        if(clicked1(view) || clicked2(view) || clicked3(view) || clicked4(view)){
            Intent intent = new Intent(this, yeschecked3.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, nonechecked3.class);
            startActivity(intent);
        }

    }

}
