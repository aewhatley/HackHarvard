package com.baneofsociety.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class abusivebehavior2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abusivebehavior2);
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

    protected boolean clicked5(View view){
        return true;
    }

    protected boolean clicked6(View view){
        return true;
    }

    protected boolean clicked7(View view){
        return true;
    }

    protected void transition(View view){
        if(clicked1(view) || clicked2(view) || clicked3(view) || clicked4(view) || clicked5(view) || clicked6(view) || clicked7(view)){
            Intent intent = new Intent(this, yeschecked2.class);
            startActivity(intent);
        }

        else{
            Intent intent = new Intent(this, nonechecked2.class);
            startActivity(intent);
        }
    }

}
