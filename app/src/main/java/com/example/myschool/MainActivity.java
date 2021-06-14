package com.example.myschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtLogin, txtPassword;
    private Button btnConnect, btnSignUp;
    private String login, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLogin = findViewById(R.id.txtLogin);
        txtPassword = findViewById(R.id.txtPassword);
        btnConnect = findViewById(R.id.btnConnect);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login = txtLogin.getText().toString().trim();
                password = txtPassword.getText().toString().trim();

                if(login.isEmpty() || password.isEmpty()){
                    Toast.makeText(MainActivity.this, getString(R.string.error_fields) , Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Bienvenue sur Groupe ISI", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}