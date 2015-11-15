package com.baneofsociety.helloworld;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class abusivebehavior extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abusivebehavior);
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
        int ctr = 0;
        if(clicked1(view)){ctr += 1;}
        if(clicked2(view)){ctr += 1;}
        if(clicked3(view)){ctr += 1;}
        if(clicked4(view)){ctr += 1;}

        if(ctr == 0){
            Intent intent = new Intent(this, nonechecked.class);
            startActivity(intent);
        }

        else{
            Intent intent = new Intent(this, yeschecked.class);
            startActivity(intent);
        }

    }

}
