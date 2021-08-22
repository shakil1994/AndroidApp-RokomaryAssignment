package com.blackbirds.shakil.shakhawatrokomaryassignment.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.LoginRequest;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.LoginResponse;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Repositories.LoginRepo;

public class LoginViewModel extends ViewModel {
    private final LoginRepo repo;

    public LoginViewModel(){
        repo=new LoginRepo();
    }

    public LiveData<LoginResponse> loginResponse(LoginRequest request){
        return repo.loginResponse(request);
    }
}
