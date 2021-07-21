package com.example.emirim_project10_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Activity Life Cycle:", "Call OnCreate()");

 //       Button btncall = findViewById(Bundle savedInstanceState) {
 //           super.onCreate(savedInstanceState);
  //          setContentView(R.layout.activity_main);

            Button btnCall = findViewById(R.id.btn_call);
            Button btnFinish = findViewById(R.id.btn_done);

            btnCall.setOnClickListener(btnListener);
            btnFinish.setOnClickListener(btnListener);
        }

        View.OnClickListener btnListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.btn_call:
                        Uri uri = Uri.parse("tel:01047954731");
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        startActivity(intent);
                                break;
                    case R.id.btn_done:
                        finish();
                        break;
                }
            }
        };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity Life Cycle:", "Call OnDestory()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity Life Cycle:", "Call OnRestart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity Life Cycle:", "Call OnResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity Life Cycle:", "Call OnPause()");

    }
}