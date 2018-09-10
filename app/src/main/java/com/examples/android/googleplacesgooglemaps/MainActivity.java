package com.examples.android.googleplacesgooglemaps;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int ERROR_DIALOG_REQUEST= 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        if(IsServiceOk ()){
            init ();
        }
    }

        private void init(){

            Button butMap = (Button) findViewById (R.id.buttonMap);
            butMap.setOnClickListener (new View.OnClickListener ( ) {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent (MainActivity.this,MapActivity.class);
                    startActivity (intent);
                }
            });

        }

        public boolean IsServiceOk(){
            Log.d (TAG,"IsServiceOk: checking google service version");
            int availability = GoogleApiAvailability.getInstance ().isGooglePlayServicesAvailable ( MainActivity.this);
            if(availability ==ConnectionResult.SUCCESS){
               Log.d (TAG,"IsServiceOK: Google play service is working");
               return true;
            }
            else if(GoogleApiAvailability.getInstance ().isUserResolvableError (availability)){
                Log.d (TAG,"IsServiceOk: an error occured but we can fix it");
                Dialog dialog = GoogleApiAvailability.getInstance ().getErrorDialog (MainActivity.this,availability,ERROR_DIALOG_REQUEST);
                dialog.show ();
            }
            else
            {
                Toast.makeText (getApplicationContext (),"You can't make an app request",Toast.LENGTH_SHORT).show ();
            }
            return true;
        }
}
