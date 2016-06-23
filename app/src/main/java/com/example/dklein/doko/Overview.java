package com.example.dklein.doko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Overview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        Button button3 = (Button) findViewById(R.id.deike);

        assert button3 != null;
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //was passiert hier?
            }
        });

        Button button4 = (Button) findViewById(R.id.sarah);

        assert button4 != null;
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //was passiert hier?
            }
        });

        Button button5 = (Button) findViewById(R.id.writePoints);

        assert button5 != null;
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Overview.this, ReservationAct.class);
                Overview.this.startActivity(myIntent);
                //setContentView(R.layout.reservation);
            }
        });

    }
}
