abstract class Character {
    String name;
    int attackPower;

    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    abstract int attack();

    abstract int attack(String attackType);

}

class Fighter extends Character {

    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.equals("melee")) {
            return this.attackPower * 2;
        } else if (attackType.equals("ranged")) {
            return this.attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {

    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.equals("frost")) {
            return this.attackPower * 2;
        } else if (attackType.equals("fire")) {
            return this.attackPower * 3;
        } else {
            return 0;
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Character[] karakter = new Character[5];
        karakter[0] = new Fighter("Aldous", 200);
        karakter[1] = new Mage("Eudora", 150);
        karakter[2] = new Fighter("Sun", 100);
        karakter[3] = new Fighter("Yin", 100);
        karakter[4] = new Mage("Odette", 200);

        for (Character character : karakter) {
            printAttack(character);
        }
    }

    public static void printAttack(Character character) {
        int melee = character.attack("melee");
        int ranged = character.attack("ranged");
        int fire = character.attack("fire");
        int frost = character.attack("frost");

        System.out.println(character.name + " attack with " + character.attack() + " attack power, melee " + melee);
        System.out.println(character.name + " attack with " + character.attack() + " attack power, ranged " + ranged);
        System.out.println(character.name + " attack with " + character.attack() + " attack power, fire " + fire);
        System.out.println(character.name + " attack with " + character.attack() + " attack power, frost " + frost);
        System.out.println("=".repeat(100));

    }
}