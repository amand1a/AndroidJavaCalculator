package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    
    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_GREEN = 2;
    final int MENU_COLOR_BLUE = 3;

    final int MENU_SIZE_22 = 4;
    final int MENU_SIZE_26 = 5;
    final int MENU_SIZE_30 = 6;

    TextView textView;
    Button btnCancel;

    RadioGroup rgGravity;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;
    Button btn16;
    Button btn17;
    Button btn18;

    Button btn19;
    Button btn20;

    LinearLayout free_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.textView);

        registerForContextMenu(textView);


        free_layout = (LinearLayout) findViewById(R.id.free_layout);


        btnCancel = (Button) findViewById(R.id.exit_button);
        btn1 = (Button) findViewById(R.id.button_1);
        btn2 = (Button) findViewById(R.id.button_2);
        btn3 = (Button) findViewById(R.id.button_3);
        btn4 = (Button) findViewById(R.id.button_4);
        btn5 = (Button) findViewById(R.id.button_5);
        btn6 = (Button) findViewById(R.id.button_6);
        btn7 = (Button) findViewById(R.id.button_7);
        btn8 = (Button) findViewById(R.id.button_8);
        btn9 = (Button) findViewById(R.id.button_9);
        btn10 = (Button) findViewById(R.id.button_10);
        btn11 = (Button) findViewById(R.id.button_11);
        btn12 = (Button) findViewById(R.id.button_12);
        btn13 = (Button) findViewById(R.id.button_13);
        btn14 = (Button) findViewById(R.id.button_14);
        btn15 = (Button) findViewById(R.id.button_15);
        btn16 = (Button) findViewById(R.id.button_16);
        btn17 = (Button) findViewById(R.id.button_17);
        btn18 = (Button) findViewById(R.id.button_18);
        btn19 = (Button) findViewById(R.id.button_19);
        btn20 = (Button) findViewById(R.id.button_20);



        btn1.setOnClickListener(this::onClick);
        btn2.setOnClickListener(this::onClick);
        btn3.setOnClickListener(this::onClick);
        btn4.setOnClickListener(this::onClick);
        btn5.setOnClickListener(this::onClick);
        btn6.setOnClickListener(this::onClick);
        btn7.setOnClickListener(this::onClick);
        btn8.setOnClickListener(this::onClick);
        btn9.setOnClickListener(this::onClick);
        btn10.setOnClickListener(this::onClick);
        btn11.setOnClickListener(this::onClick);
        btn12.setOnClickListener(this::onClick);
        btn13.setOnClickListener(this::onClick);
        btn14.setOnClickListener(this::onClick);
        btn15.setOnClickListener(this::onClick);
        btn16.setOnClickListener(this::onClick);
        btn17.setOnClickListener(this::onClick);
        btn18.setOnClickListener(this::onClick);
        btn19.setOnClickListener(this::onClick);
        btn20.setOnClickListener(this::onClick);



    }

    public void clickBtnCancel (View view){
        Log.d(TAG,"button cancel");
        textView.setText("cancel");
    }

    @Override
    public void onClick(View v) {
        int view = v.getId();

        if(view == R.id.button_1){
            textView.setText("1");
            Log.d(TAG,"button 1");
        }
        if(view == R.id.button_2){
            textView.setText("2");
            Log.d(TAG,"button 2");
        }
        if(view == R.id.button_3){
            textView.setText("3");
            Log.d(TAG,"button 3");
        }
        if(view == R.id.button_4){
            textView.setText("4");
            Log.d(TAG,"button 4");
        }
        if(view == R.id.button_5){
            textView.setText("5");
            Log.d(TAG,"button 5");
        }
        if(view == R.id.button_6){
            textView.setText("6");
            Log.d(TAG,"button 6");
        }
        if(view == R.id.button_7){
            textView.setText("7");
        }
        if(view == R.id.button_8){
            textView.setText("8");
        }
        if(view == R.id.button_9){
            textView.setText("9");
        }
        if(view == R.id.button_10){
            textView.setText("10");
        }
        if(view == R.id.button_11){
            textView.setText("11");
        }
        if(view == R.id.button_12){
            textView.setText("12");
        }
        if(view == R.id.button_13){
            textView.setText("13");
        }
        if(view == R.id.button_14){
            textView.setText("14");
        }
        if(view == R.id.button_15){
            textView.setText("15");
        }
        if(view == R.id.button_16){
            textView.setText("16");
        }

        if(view == R.id.button_17){
            textView.setText("17");
        }
        if(view == R.id.button_18){
            textView.setText("18");
        }
        if(view == R.id.button_19){
            textView.setText("19");
        }

        if(view == R.id.button_20){
            textView.setText("20");
        }

    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,4,4,"calculator");
        menu.add(0,1,3,"add Button");
        menu.add(0,2,2,"clear layout");
        menu.add(0,3,1,"out");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

        int id = item.getItemId();

        if(id == 1){
            LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            Button btnNew = new Button(this);

            btnNew.setText(textView.getText());
            free_layout.addView(btnNew, lParams);
        }

        if(id == 2){
            free_layout.removeAllViews();
        }

        if(id == 3){
            this.finish();
        }

        if(id == 4){
            Intent intent = new Intent(this, calculator.class);
            startActivity(intent);
        }
        return  super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
        int vId = view.getId();

        if(vId == R.id.textView){
            menu.add(0,MENU_COLOR_RED,0,"Red");
            menu.add(0,MENU_COLOR_GREEN,0,"Green");
            menu.add(0,MENU_COLOR_BLUE,0,"Blue");
            menu.add(0,MENU_SIZE_22,0,"22");
            menu.add(0,MENU_SIZE_26,0,"26");
            menu.add(0,MENU_SIZE_30,0,"30");
        }
    }


    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case MENU_COLOR_RED:
                textView.setTextColor(Color.RED);
                break;
            case MENU_COLOR_GREEN:
                textView.setTextColor(Color.GREEN);
                break;
            case MENU_COLOR_BLUE:
                textView.setTextColor(Color.BLUE);
                break;
            case MENU_SIZE_22:
                textView.setTextSize(22);
                break;
            case MENU_SIZE_26:
                textView.setTextSize(26);
                break;
            case MENU_SIZE_30:
                textView.setTextSize(30);
                break;
        }

        return  super.onContextItemSelected(item);
    }


    private static final String TAG = "testLogs";
}