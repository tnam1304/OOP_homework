package week3.bai3_6;

import java.time.LocalDate;

public class Food extends Product {
    private LocalDate expiryDate;

    public Food(String code, String name, double oriPrice, LocalDate expiryDate) {
        super(code, name, oriPrice);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getType() {
        return "Food";
    }

    @Override
    public double getFinalPrice() {
        if (expiryDate.isBefore(LocalDate.now().plusDays(7))) {
            return oriPrice * 0.8;
        }
        return oriPrice;
    }
}