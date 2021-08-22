package com.blackbirds.shakil.shakhawatrokomaryassignment.Model;

public class SingleBookDetails {

    private Boolean is_purchased;
    private BookDetails model;

    public SingleBookDetails() {
    }

    public SingleBookDetails(Boolean is_purchased, BookDetails model) {
        this.is_purchased = is_purchased;
        this.model = model;
    }

    public Boolean getIs_purchased() {
        return is_purchased;
    }

    public void setIs_purchased(Boolean is_purchased) {
        this.is_purchased = is_purchased;
    }

    public BookDetails getModel() {
        return model;
    }

    public void setModel(BookDetails model) {
        this.model = model;
    }
}
