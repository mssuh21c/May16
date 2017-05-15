package com.example.sensational.may16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SumUp(100);

        Button butt1 = (Button)findViewById ( R.id.button1);

        butt1.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int target;

                        TextView textv1 = (TextView)findViewById ( R.id.textview2);


                        EditText edit2 = (EditText)findViewById(R.id.editText2);

                        target = Integer.getInteger( String.valueOf( (edit2.getText() )) );

                        textv1.setText( String.valueOf(SumUp(target)) );

                    }
                }
        );


    }


    private int SumUp ( int end ) {
        int sum=0;

        for ( int i =1 ; i<= end ; i++){
            sum = sum + i;
        }
        return sum;
    }
}
