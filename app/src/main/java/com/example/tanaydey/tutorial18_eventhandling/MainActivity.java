
package com.example.tanaydey.tutorial18_eventhandling;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/*Objective: This program creates button and implements single click and long click events*/


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // implementation of button click

        Button tanaysButton = (Button) findViewById(R.id.tanaysButton);

        tanaysButton.setOnClickListener(

              new Button.OnClickListener(){
                  public void onClick(View v){

                    TextView tanaysText = (TextView) findViewById(R.id.tanaysText);
                    tanaysText.setText("Good Job Boss!");
                  }

              }



        );

        // implementation of long lick

          tanaysButton.setOnLongClickListener(

                  new Button.OnLongClickListener(){

                      @Override
                      public boolean onLongClick(View v) {

                          TextView tanaysText = (TextView) findViewById(R.id.tanaysText);
                          tanaysText.setText("That's a long click");

                          return false;
                      }
                  }

          );


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
