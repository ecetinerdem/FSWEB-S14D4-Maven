package org.example.model;

public class Chocolate extends ProductForSale{
    private boolean hasSugar;
    private String color;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, boolean hasSugar, String color) {
        super(type, price, description);
        this.hasSugar = hasSugar;
        this.color = color;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "hasSugar=" + hasSugar +
                ", color='" + color + '\'' +
                '}';
    }
}
