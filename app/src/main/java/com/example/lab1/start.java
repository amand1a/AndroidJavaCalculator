package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class start extends AppCompatActivity implements View.OnClickListener{

    long times;


    @Override
    public void onBackPressed() {

        if(times+ 2000 > System.currentTimeMillis()){
            super.onBackPressed();

        }
        else{
            Toast.makeText(getBaseContext(),"нажмите еще раз чтобы выйти", Toast.LENGTH_SHORT).show();
        }

        times = System.currentTimeMillis();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button open;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        open = (Button) findViewById(R.id.button10);

        open.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button10){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}