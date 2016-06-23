package com.example.dklein.doko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reh);

        Button button = (Button) findViewById(R.id.reh);

        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //setContentView(R.layout.reservation_choice);
                Intent myIntent = new Intent(Reh.this, Contra.class);
                Reh.this.startActivity(myIntent);
            }
        });
    }
}
