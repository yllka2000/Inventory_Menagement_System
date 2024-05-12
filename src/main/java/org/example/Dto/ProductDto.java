package org.example.Dto;

public class ProductDto {
    private String model;
    private Integer quantity;
    private double price;
    private String description;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "model='" + model + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
