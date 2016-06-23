package com.example.dklein.doko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Solo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo);

        Button button = (Button) findViewById(R.id.square);

        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //setContentView(R.layout.reservation_choice);
                Intent myIntent = new Intent(Solo.this, Reh.class);
                Solo.this.startActivity(myIntent);
            }
        });
    }
}
