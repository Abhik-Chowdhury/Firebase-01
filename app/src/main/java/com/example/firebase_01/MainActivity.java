package com.example.firebase_01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Name01 = findViewById(R.id.Name01);
        final EditText Position03 = findViewById(R.id.Position03);
        Button submit = findViewById(R.id.submit);
        FirBase fire = new FirBase();
        submit.setOnClickListener(view -> {
            Employee emp = new Employee(Name01.getText().toString(),Position03.getText().toString());
            fire.add(emp).addOnSuccessListener(suc-> Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_SHORT).show()).addOnFailureListener(er-> Toast.makeText(MainActivity.this, "Not Inserted", Toast.LENGTH_SHORT).show());

        });
    }
}