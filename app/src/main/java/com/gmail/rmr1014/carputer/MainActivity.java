package com.gmail.rmr1014.carputer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnSubmit = findViewById(R.id.btnSubmit);
        final ToggleButton tbtnToggle = findViewById(R.id.tbtnToggle);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tbtnToggle.toggle();
            }
        });

    }
}
