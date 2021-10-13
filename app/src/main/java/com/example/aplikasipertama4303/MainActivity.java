package com.example.aplikasipertama4303;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView textPertama, textKedua, textKetiga;
    EditText editName;
    Button buttonClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textPertama = findViewById(R.id.textView2);
        textKedua = findViewById(R.id.textView3);
        textKetiga = findViewById(R.id.textView4);
        editName = findViewById(R.id.editName);
        buttonClickMe = findViewById(R.id.buttonClickMe);

        buttonClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKedua.setText(editName.getText().toString());
            }
        });

        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    buttonClickMe.setEnabled(false);
                } else {
                    buttonClickMe.setEnabled(true);
                }
            }
        });
    }
}