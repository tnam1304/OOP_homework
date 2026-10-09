package week3.bai3_7;
public abstract class Phong {
    protected int soDem;

    public Phong(int soDem) {
        this.soDem = soDem;
    }

    public abstract long tinhTien();
}