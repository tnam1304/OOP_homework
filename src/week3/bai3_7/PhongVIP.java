package week3.bai3_7;
public class PhongVIP extends Phong {
    private static final long GIA_DEM = 2_000_000;

    public PhongVIP(int soDem) {
        super(soDem);
    }

    @Override
    public long tinhTien() {
        return soDem * GIA_DEM; // VIP không giảm giá
    }
}