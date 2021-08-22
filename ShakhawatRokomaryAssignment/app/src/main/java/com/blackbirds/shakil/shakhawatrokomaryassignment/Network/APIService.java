package com.blackbirds.shakil.shakhawatrokomaryassignment.Network;

import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.RegistrationRequest;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.RegistrationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {
    @POST("auth/register")
    Call<RegistrationResponse> registration(
            @Body RegistrationRequest body
    );
}
