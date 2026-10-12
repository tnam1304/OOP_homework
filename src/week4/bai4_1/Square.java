package week4.bai4_1;

public class Square extends Shape {
    public Square(int x, int y)
    {
        super(x,y);
    }
    @Override
    public void draw() {
        System.out.println("Ve hinh vuong tai ("+ x + ", " + y +")");
    }
    @Override
    public void erase() {
        System.out.println("Xoa hinh vuong tai ("+ x + ", " + y +")");
    }
}
