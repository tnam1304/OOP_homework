package week3.bai3_7;
public class PhongStandard extends Phong {
    private static final long GIA_DEM = 500_000;

    public PhongStandard(int soDem) {
        super(soDem);
    }

    @Override
    public long tinhTien() {
        long tongTien = soDem * GIA_DEM;
        if (soDem > 3) {
            tongTien = (long) (tongTien * 0.95); // Giảm 5% khi ở quá 3 đêm
        }
        return tongTien;
    }
}