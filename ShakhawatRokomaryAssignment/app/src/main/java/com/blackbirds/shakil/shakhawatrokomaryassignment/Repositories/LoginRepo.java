package com.blackbirds.shakil.shakhawatrokomaryassignment.Repositories;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.blackbirds.shakil.shakhawatrokomaryassignment.Common.Common;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.LoginRequest;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.LoginResponse;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Network.APIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepo {
    private static final String TAG = "LoginRepository";
    private final APIService api;

    public LoginRepo(){
        this.api = Common.getAPIService();
    }

    public LiveData<LoginResponse> loginResponse(LoginRequest request){
        MutableLiveData<LoginResponse> data =new MutableLiveData<>();
        api.login(request).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                Log.e(TAG, "onResponse: " + response.code());
                if (response.isSuccessful()) {
                    data.setValue(response.body());
                } else {
                    data.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
                data.setValue(null);
            }
        });
        return data;
    }
}
