package com.example.dklein.doko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReservationChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_choice);

        Button button = (Button) findViewById(R.id.poverty);

        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //setContentView(R.layout.reservation_choice);
                Intent myIntent = new Intent(ReservationChoice.this, Reh.class);
                ReservationChoice.this.startActivity(myIntent);
            }
        });

        Button button2 = (Button) findViewById(R.id.which_solo);

        assert button2 != null;
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //setContentView(R.layout.reservation_choice);
                Intent myIntent = new Intent(ReservationChoice.this, Solo.class);
                ReservationChoice.this.startActivity(myIntent);
            }
        });

    }
}
