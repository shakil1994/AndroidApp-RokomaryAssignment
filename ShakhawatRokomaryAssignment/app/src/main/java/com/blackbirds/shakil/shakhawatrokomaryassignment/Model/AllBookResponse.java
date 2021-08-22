package com.blackbirds.shakil.shakhawatrokomaryassignment.Model;

import java.util.List;

public class AllBookResponse {
    private Integer total_count;
    private List<BookModels> models;

    public AllBookResponse() {
    }

    public AllBookResponse(Integer total_count, List<BookModels> models) {
        this.total_count = total_count;
        this.models = models;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public List<BookModels> getModels() {
        return models;
    }

    public void setModels(List<BookModels> models) {
        this.models = models;
    }
}
