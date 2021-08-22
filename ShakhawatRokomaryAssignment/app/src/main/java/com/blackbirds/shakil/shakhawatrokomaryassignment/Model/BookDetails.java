package com.blackbirds.shakil.shakhawatrokomaryassignment.Model;

public class BookDetails {
    private Integer id;
    private String name_bn;
    private String name_en;
    private String summary;
    private String author_name_bn;
    private String publisher_name_bn;
    private Double price;
    private Boolean is_available;
    private Boolean is_unavailable;
    private Boolean is_newarrival;
    private String lang;
    private String image_path;
    private Integer position;

    public BookDetails() {
    }

    public BookDetails(Integer id, String name_bn, String name_en, String summary, String author_name_bn, String publisher_name_bn, Double price, Boolean is_available, Boolean is_unavailable, Boolean is_newarrival, String lang, String image_path, Integer position) {
        this.id = id;
        this.name_bn = name_bn;
        this.name_en = name_en;
        this.summary = summary;
        this.author_name_bn = author_name_bn;
        this.publisher_name_bn = publisher_name_bn;
        this.price = price;
        this.is_available = is_available;
        this.is_unavailable = is_unavailable;
        this.is_newarrival = is_newarrival;
        this.lang = lang;
        this.image_path = image_path;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_bn() {
        return name_bn;
    }

    public void setName_bn(String name_bn) {
        this.name_bn = name_bn;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor_name_bn() {
        return author_name_bn;
    }

    public void setAuthor_name_bn(String author_name_bn) {
        this.author_name_bn = author_name_bn;
    }

    public String getPublisher_name_bn() {
        return publisher_name_bn;
    }

    public void setPublisher_name_bn(String publisher_name_bn) {
        this.publisher_name_bn = publisher_name_bn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getIs_available() {
        return is_available;
    }

    public void setIs_available(Boolean is_available) {
        this.is_available = is_available;
    }

    public Boolean getIs_unavailable() {
        return is_unavailable;
    }

    public void setIs_unavailable(Boolean is_unavailable) {
        this.is_unavailable = is_unavailable;
    }

    public Boolean getIs_newarrival() {
        return is_newarrival;
    }

    public void setIs_newarrival(Boolean is_newarrival) {
        this.is_newarrival = is_newarrival;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
