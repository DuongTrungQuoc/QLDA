package com.nguyenhoangbaophuc.daco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginOrRegActivity extends AppCompatActivity {
    private Button mLogin, mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_reg);

        mLogin = findViewById(R.id.btnlogin);
        mRegister = findViewById(R.id.btnReg);

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginOrRegActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginOrRegActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}