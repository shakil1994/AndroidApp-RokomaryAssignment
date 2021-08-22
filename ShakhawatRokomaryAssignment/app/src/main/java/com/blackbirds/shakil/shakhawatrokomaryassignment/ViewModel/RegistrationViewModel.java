package com.blackbirds.shakil.shakhawatrokomaryassignment.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.RegistrationRequest;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.RegistrationResponse;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Repositories.RegistrationRepo;

public class RegistrationViewModel extends ViewModel {
    private final RegistrationRepo registrationRepo;

    public RegistrationViewModel() {
        registrationRepo = new RegistrationRepo();
    }

    public LiveData<RegistrationResponse> registrationResponse(RegistrationRequest request){
        return registrationRepo.registrationResponse(request);
    }

}
