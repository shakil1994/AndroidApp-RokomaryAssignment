package com.blackbirds.shakil.shakhawatrokomaryassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.blackbirds.shakil.shakhawatrokomaryassignment.Common.Common;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.RegistrationRequest;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Utils.PreferenceHelper;
import com.blackbirds.shakil.shakhawatrokomaryassignment.ViewModel.RegistrationViewModel;
import com.google.android.material.textfield.TextInputEditText;

public class RegistrationActivity extends AppCompatActivity {

    TextInputEditText edtUserName, edtEmail, edtPassword;
    AppCompatButton btnSignUp;

    TextView txtHaveAccount;

    RegistrationViewModel registrationViewModel;
    private String userEmail, userName, userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        edtUserName = findViewById(R.id.edtUserName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnSignUp = findViewById(R.id.btnSignUp);

        txtHaveAccount = findViewById(R.id.txtHaveAccount);

        String text = "<font color=#afafaf>Already have an account? </font> <font color=#32be4a>Sign In</font>";
        txtHaveAccount.setText(Html.fromHtml(text));

        if (!PreferenceHelper.retriveData(this, Common.USER_EMAIL).isEmpty()){
            startActivity(new Intent(this, MainActivity.class));
        }

        txtHaveAccount.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity.class));
        });

        btnSignUp.setOnClickListener(v -> {
            userRegistration();
        });
    }

    private void userRegistration() {
        registrationViewModel = new ViewModelProvider(this).get(RegistrationViewModel.class);
        userEmail = edtEmail.getText().toString();
        userName = edtUserName.getText().toString();
        userPassword = edtPassword.getText().toString();

        RegistrationRequest registrationRequest = new RegistrationRequest();
        registrationRequest.setEmail(userEmail);
        registrationRequest.setUsername(userName);
        registrationRequest.setPassword(userPassword);

        registrationViewModel.registrationResponse(registrationRequest).observe(this, registrationResponse -> {
            if (registrationResponse != null){
                PreferenceHelper.insertData(this, Common.USER_EMAIL, registrationRequest.getEmail());
                PreferenceHelper.insertData(this, Common.USER_NAME, registrationRequest.getUsername());
                PreferenceHelper.insertData(this, Common.USER_PASSWORD, registrationRequest.getPassword());

                startActivity(new Intent(this, MainActivity.class));
                Toast.makeText(RegistrationActivity.this, "Registration Success!!", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(RegistrationActivity.this, "Registration Failed!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}