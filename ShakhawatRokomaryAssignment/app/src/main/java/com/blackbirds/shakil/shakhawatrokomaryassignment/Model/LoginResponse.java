package com.blackbirds.shakil.shakhawatrokomaryassignment.Model;

public class LoginResponse {
    private String refresh;
    private String access;

    public LoginResponse() {
    }

    public LoginResponse(String refresh, String access) {
        this.refresh = refresh;
        this.access = access;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
