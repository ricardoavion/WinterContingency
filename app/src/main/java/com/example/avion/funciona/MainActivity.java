package com.example.avion.funciona;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.avion.funciona.Fragments.MenuFragment;

public class MainActivity extends AppCompatActivity implements MenuFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }




    public void StockPortClick(View view){
        Intent stock_intent = new Intent(this, Stock.class);
        startActivity(stock_intent);
    }


}
