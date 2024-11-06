package com.example.agecalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

  EditText edt1, edt2, edt3, edt4;
  TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
  Button Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edt1=findViewById(R.id.tv1);
        edt2=findViewById(R.id.tv2);
        edt3=findViewById(R.id.tv3);
        edt4=findViewById(R.id.tv4);
        tv1=findViewById(R.id.edt1);
        tv2=findViewById(R.id.edt2);
        tv3=findViewById(R.id.edt3);
        tv4=findViewById(R.id.edt4);
        tv5=findViewById(R.id.edt5);
        tv6=findViewById(R.id.edt6);
        tv7=findViewById(R.id.edt7);
        Result=findViewById(R.id.Result);

        Result.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int value1 = Integer.parseInt( edt1.getText().toString());
                int value2 = Integer.parseInt( edt2.getText().toString());
                int value3 = Integer.parseInt( edt3.getText().toString());
                int value4 = Integer.parseInt( edt4.getText().toString());
                int years=value2-value1;
                int R_months=12-value3+value4;
                int months=years*12+R_months;
                int days=years*365;
                int Hours=days*24;
                int minutes=Hours*60;
                int seconds=minutes*60;


                tv1.setText(years + " your age in years");
                tv2.setText(months + " your age in months");
                tv3.setText(days + " your age days" );
                tv4.setText(Hours + " your age hours");
                tv5.setText(minutes + " your age minutes");
                tv6.setText(seconds+ " your age seconds");
                if (years <30)
                {
                    tv7.setText("You are young");
                }
                else if (years>30)
                {
                    tv7.setText("You are Old");
                }
                else
                {
                    tv7.setText("You are baby");
                }


            }

        });






    }
}