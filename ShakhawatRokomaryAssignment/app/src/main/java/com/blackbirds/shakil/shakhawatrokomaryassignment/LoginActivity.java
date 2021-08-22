package com.blackbirds.shakil.shakhawatrokomaryassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.blackbirds.shakil.shakhawatrokomaryassignment.Common.Common;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.LoginRequest;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Utils.PreferenceHelper;
import com.blackbirds.shakil.shakhawatrokomaryassignment.ViewModel.LoginViewModel;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    LoginViewModel loginViewModel;
    TextInputEditText edtUserName, edtPassword;
    AppCompatButton btnSignIn;

    TextView txtNoAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        txtNoAccount = findViewById(R.id.txtNoAccount);

        String text = "<font color=#afafaf>Don't have account? </font> <font color=#32be4a>Sign Up</font>";
        txtNoAccount.setText(Html.fromHtml(text));

        /*if (!PreferenceHelper.retriveData(this, Common.USER_EMAIL).isEmpty()){
            startActivity(new Intent(this, MainActivity.class));
        }*/

        txtNoAccount.setOnClickListener(v -> {
            startActivity(new Intent(this, RegistrationActivity.class));
        });

        btnSignIn.setOnClickListener(v -> {
           login();
        });
    }

    private void login() {
        startActivity(new Intent(this, MainActivity.class));
        /*LoginRequest loginRequest = new LoginRequest();
        loginViewModel.loginResponse(loginRequest).observe(this,loginResponse -> {
            if (loginResponse!=null){
                PreferenceHelper.insertData(this, Common.USER_TOKEN,loginResponse.getAccess());
                startActivity(new Intent(this, MainActivity.class));
                Toast.makeText(LoginActivity.this, "Login Success!!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(LoginActivity.this, "Login Failed!!", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}