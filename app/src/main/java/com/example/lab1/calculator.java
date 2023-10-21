package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.ValueIterator;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity implements View.OnClickListener {




    EditText firstNumber ;
    EditText secondNumber;

    TextView result;

    Button clear;

    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;

    Button minus;
    Button plus;
    Button multiple;
    Button division;

    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate);



        firstNumber = (EditText) findViewById(R.id.editTextNumberDecimal);

        firstNumber.setShowSoftInputOnFocus(false);

        secondNumber = (EditText) findViewById(R.id.editTextNumberDecimal2);

        secondNumber.setShowSoftInputOnFocus(false);

        clear =(Button) findViewById(R.id.button_clear);
        num1 = (Button) findViewById(R.id.button1);
        num2 = (Button) findViewById(R.id.button2);
        num3 = (Button) findViewById(R.id.button3);
        num4 = (Button) findViewById(R.id.button4);
        num5 = (Button) findViewById(R.id.button5);
        num6 = (Button) findViewById(R.id.button6);
        num7 = (Button) findViewById(R.id.button7);
        num8 = (Button) findViewById(R.id.button8);
        num9 = (Button) findViewById(R.id.button9);

        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);

        division = (Button) findViewById(R.id.button5_division);
        multiple = (Button) findViewById(R.id.button4_multiply);
        minus = (Button) findViewById(R.id.button_minus);
        plus = (Button) findViewById(R.id.button3_plus);

        division.setOnClickListener(this);
        multiple.setOnClickListener(this);
        minus.setOnClickListener(this);
        plus.setOnClickListener(this);


        result = (TextView) findViewById(R.id.textView2);
        result.setText("rer");

        clear = (Button) findViewById(R.id.button_clear);
        clear.setOnClickListener(this);

        exit = (Button) findViewById(R.id.button_exit);

        exit.setOnClickListener(this);


    }




    public boolean onCreateOptionMenu(Menu menu){

        menu.add(0,1,1,"out");

       return  super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == 1){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if(id == R.id.button3_plus){
            try {
                int a = Integer.parseInt(firstNumber.getText().toString());
                int b = Integer.parseInt(secondNumber.getText().toString());

                result.setText(String.valueOf(a+b));
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
                result.startAnimation(animation);
            }catch (Exception e){
                result.setText("Error");
            }
        }
        if(id == R.id.button_minus){
            try {
                int a = Integer.parseInt(firstNumber.getText().toString());
                int b = Integer.parseInt(secondNumber.getText().toString());

                result.setText(String.valueOf(a-b));
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
                result.startAnimation(animation);
            }catch (Exception e){
                result.setText(e.getMessage());
            }
        }
        if(id == R.id.button4_multiply){
            try {
                int a = Integer.parseInt(firstNumber.getText().toString());
                int b = Integer.parseInt(secondNumber.getText().toString());

                result.setText(String.valueOf(a*b));
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);
                result.startAnimation(animation);
            }catch (Exception e){
                result.setText("Error");
            }
        }
        if(id == R.id.button5_division){
            try {
                int a = Integer.parseInt(firstNumber.getText().toString());
                int b = Integer.parseInt(secondNumber.getText().toString());

                result.setText(String.valueOf(a/b));
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);
                result.startAnimation(animation);
            }catch (Exception e){
                result.setText("Error");
            }
        }

        if(id == R.id.button1){
            setText("1");
        }
        if(id == R.id.button2){
            setText("2");
        }
        if(id == R.id.button3){
            setText("3");
        }
        if(id == R.id.button4){
            setText("4");
        }
        if(id == R.id.button5){
            setText("5");
        }
        if(id == R.id.button6){
            setText("6");
        }
        if(id == R.id.button7){
            setText("7");
        }if(id == R.id.button8){
            setText("8");
        }
        if(id == R.id.button9){
            setText("9");
        }

        if(id == R.id.button_clear){
            if(firstNumber.hasFocus()){
                firstNumber.setText("");
            }
            if(secondNumber.hasFocus()){
                secondNumber.setText("");
            }
        }

        if(id == R.id.button_exit){
            this.finish();
        }

    }

    public void setText (String s){
        if(firstNumber.hasFocus()){
            firstNumber.setText(firstNumber.getText()+s);


        }
        if(secondNumber.hasFocus()){
            secondNumber.setText(secondNumber.getText()+s);

        }
    }



}