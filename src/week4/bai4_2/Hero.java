package week4.bai4_2;

public class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim{
    @Override
    public void fly() {
        System.out.println("Hero is flying");
    }

    @Override
    public void swim() {
        System.out.println("Hero is swimming");
    }
}
