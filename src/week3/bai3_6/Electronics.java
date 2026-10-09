package week3.bai3_6;

public class Electronics extends Product {
    private double warrantyFee;

    public Electronics(String code, String name, double oriPrice, double warrantyFee) {
        super(code, name, oriPrice);
        this.warrantyFee = warrantyFee;
    }

    @Override
    public String getType() {
        return "Electronics";
    }

    @Override
    public double getFinalPrice() {
        return oriPrice * 1.1 + warrantyFee;
    }
}