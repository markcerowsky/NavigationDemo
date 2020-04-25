package com.ebookfrenzy.navigationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ebookfrenzy.navigationdemo.ui.main.MainFragment;
import android.net.Uri;

public class MainActivity extends AppCompatActivity implements secondFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
       /* if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }*/

    }

    @Override
    public void onFragmentInteraction (Uri uri){

    }
}
