package week4.bai4_2;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();

        CanSwim swimmer = (CanSwim) hero;
        swimmer.swim();

        CanFight fighter = (CanFight) hero;
        fighter.fight();
    }
}