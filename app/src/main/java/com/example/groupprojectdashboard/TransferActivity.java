package com.example.groupprojectdashboard;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TransferActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_form);

        EditText nameInput = findViewById(R.id.editName);
        EditText emailInput = findViewById(R.id.editEmail);
        Button submitBtn = findViewById(R.id.btnSubmit);

        submitBtn.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            String email = emailInput.getText().toString();

            Toast.makeText(TransferActivity.this,
                    "Name: " + name + "\nEmail: " + email,
                    Toast.LENGTH_LONG).show();
        });
    }
}
