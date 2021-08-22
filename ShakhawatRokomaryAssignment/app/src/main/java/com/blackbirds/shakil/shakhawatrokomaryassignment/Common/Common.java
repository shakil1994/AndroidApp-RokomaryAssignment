package com.blackbirds.shakil.shakhawatrokomaryassignment.Common;

import com.blackbirds.shakil.shakhawatrokomaryassignment.Network.APIService;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Network.RetrofitClient;

public class Common {
    public static final String USER_TOKEN = "token";
    private static final String BASE_URL = "http://202.84.44.253:5005/api/v1/";

    public static final String USER_ID = "userID";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_NAME = "userName";
    public static final String USER_PASSWORD = "userPassword";

    public static APIService getAPIService(){
        return RetrofitClient.getRetrofit(BASE_URL).create(APIService.class);
    }
}
