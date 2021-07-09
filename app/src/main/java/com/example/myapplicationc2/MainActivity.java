package com.example.myapplicationc2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText txt_in1;
    private TextInputEditText txt_in2;
    private TextView txt_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_in1 = (TextInputEditText) findViewById(R.id.txt_in1);
        txt_in2 = (TextInputEditText) findViewById(R.id.txt_in2);
        txt_view = (TextView) findViewById(R.id.txt_view);
    }


    public void btnadd(View view) {
        int n1 = Integer.parseInt(txt_in1.getText().toString());
        int n2 = Integer.parseInt(txt_in2.getText().toString());
        int sum = n1+n2;
        txt_view.setText(String.valueOf(sum));

    }

    public void btnmin(View view) {
        int n1 = Integer.parseInt(txt_in1.getText().toString());
        int n2 = Integer.parseInt(txt_in2.getText().toString());
        int min = n1-n2;
        txt_view.setText(String.valueOf(min));
    }

    public void btnmul(View view) {
        int n1 = Integer.parseInt(txt_in1.getText().toString());
        int n2 = Integer.parseInt(txt_in2.getText().toString());
        int mul = n1*n2;
        txt_view.setText(String.valueOf(mul));
    }

    public void btndiv(View view) {
        int n1 = Integer.parseInt(txt_in1.getText().toString());
        int n2 = Integer.parseInt(txt_in2.getText().toString());
        int div = n1/n2;
        txt_view.setText(String.valueOf(div));
    }
}
