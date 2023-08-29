package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double Price) {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        return category;
    }

    public boolean getisNew() {
        return isNew;
    }

    public void setisNew(boolean isNew) {
        return isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
