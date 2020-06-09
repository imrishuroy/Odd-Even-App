package com.sixteenbrains.oddeven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  class Number{
        int number ;
        public boolean typeOf(){
            if(number % 2 == 0){
                return true;
            }else{
                return  false;
            }
        }

    }


    public void clicked (View view) {
        Log.i("Info", "Button Pressed");
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        String message;
        if (editText.getText().toString().isEmpty()) {
            message = "Please Enter A Number";
        } else {
            Number obj = new Number();
            obj.number = Integer.parseInt(editText.getText().toString());
            message = editText.getText().toString();
            if (obj.typeOf()) {
                message += " Even Number";
            } else {
                message += " Odd Number";
            }
        }
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}