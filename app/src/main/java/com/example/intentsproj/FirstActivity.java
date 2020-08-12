package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button buttonOk;
    EditText num1,num2;
    String n1,n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        num1 = findViewById(R.id.editTextNumber1);
        num2 = findViewById(R.id.editTextNumber2);

        buttonOk = findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                n1 = num1.getText().toString();
                intent.putExtra("Value1",n1);
                n2 = num2.getText().toString();
                intent.putExtra("Value2",n2);
                startActivity(intent);
                finish();

                Toast toast = Toast.makeText(getApplicationContext(), "You just clicked the Ok button", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}