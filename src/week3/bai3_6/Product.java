package week3.bai3_6;

public class Product {
    protected String code;
    protected String name;
    protected double oriPrice;

    public Product(String code, String name, double oriPrice) {
        this.code = code;
        this.name = name;
        this.oriPrice = oriPrice;
    }

    public String getType() {
        return "Product";
    }

    public double getFinalPrice() {
        return oriPrice;
    }
}