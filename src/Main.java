import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        int number =10;

        Boss boss = new Boss(1000, 70, "Magical protection");
        boss.getHealth();
        boss.getDamage();
        boss.getProtectionType();

        System.out.println(boss.getHealth() + "  " + boss.getDamage() + "  " + boss.getProtectionType());


    }




        }