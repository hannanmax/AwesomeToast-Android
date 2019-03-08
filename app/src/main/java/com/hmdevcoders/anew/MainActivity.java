package com.hmdevcoders.anew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.hmdevcoders.awesometoast.*;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
    }

    public void showSuccessToast(View view) {
        AwesomeToast.makeText(getApplicationContext(), "Download Successful !", AwesomeToast.LENGTH_LONG, AwesomeToast.SUCCESS);
    }

    public void showWarningToast(View view) {
        AwesomeToast.makeText(getApplicationContext(), "Are you sure ?", AwesomeToast.LENGTH_LONG, AwesomeToast.WARNING);
    }

    public void showErrorToast(View view) {
        AwesomeToast.makeText(getApplicationContext(), "Downloading failed ! Try again later ", AwesomeToast.LENGTH_LONG, AwesomeToast.ERROR);
    }
    public void showInfoToast(View view) {
        AwesomeToast.makeText(getApplicationContext(), "Searching for username : 'Hannan Max' ", AwesomeToast.LENGTH_LONG, AwesomeToast.INFO);
    }

    public void showDefaultToast(View view) {
        AwesomeToast.makeText(getApplicationContext(), "This is Default Toast", AwesomeToast.LENGTH_LONG, AwesomeToast.DEFAULT);
    }


    public void showConfusingToast(View view) {
        AwesomeToast.makeText(getApplicationContext(), "I don't Know !", AwesomeToast.LENGTH_LONG, AwesomeToast.CONFUSING);
    }
}
