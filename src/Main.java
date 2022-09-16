import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setBossDamage(50);
        boss.setBossHealth(500);
        boss.setBossTypeOfDefence("Gay");
        System.out.println("boss damage: " + boss.getBossDamage() + "; " + "boss health: " + boss.getBossHealth() + "; " + boss.getBossTypeOfDefence());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("hero health: " + createHeroes()[i].getHeroHealth() + "; " + "hero damage: " + createHeroes()[i].getHeroDamage() + "; " + "hero ability; " + createHeroes()[i].getHeroAbility());
        }
    }


    public static Hero[] createHeroes() {
        Hero Midoriya = new Hero(200, 20, "power");
        Hero Mina = new Hero(300, 25, "sticky");
        Hero Mineta = new Hero(150, 100, "SuperPower");

        Hero ArrayHeroes[] = {Midoriya, Mina, Mineta};
        return ArrayHeroes;


    }




}