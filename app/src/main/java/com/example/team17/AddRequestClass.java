package com.example.team17;

public class AddRequestClass {
    String title;
    String description;
    String category;
    String features;
    String status;

    public AddRequestClass(String title, String description, String category, String features, String status) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.features = features;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
