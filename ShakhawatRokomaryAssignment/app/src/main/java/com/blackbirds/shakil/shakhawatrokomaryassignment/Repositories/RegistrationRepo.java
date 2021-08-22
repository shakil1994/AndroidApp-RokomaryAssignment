package com.blackbirds.shakil.shakhawatrokomaryassignment.Repositories;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.blackbirds.shakil.shakhawatrokomaryassignment.Common.Common;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.RegistrationRequest;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.RegistrationResponse;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Network.APIService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistrationRepo {
    private static final String TAG = "RegistrationRepository";
    private final APIService apiService;

    public RegistrationRepo() {
        this.apiService = Common.getAPIService();
    }

    public LiveData<RegistrationResponse> registrationResponse(RegistrationRequest request){
        MutableLiveData<RegistrationResponse> data =new MutableLiveData<>();
        apiService.registration(request).enqueue(new Callback<RegistrationResponse>() {
            @Override
            public void onResponse(Call<RegistrationResponse> call, Response<RegistrationResponse> response) {
                Log.e(TAG, "onResponse: " + response.code());
                if (response.isSuccessful()) {
                    data.setValue(response.body());
                } else {
                    data.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<RegistrationResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
                data.setValue(null);
            }
        });
        return data;
    }
}
