abstract class Character{
    String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int attack();
    abstract int attack(String attackType);
}

class Fighter extends Character{
    private int attackPower;

    public Fighter(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
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

class Mage extends Character{
    private int attackPower;

    public Mage(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    int attack() {
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

class Main {
    public static void main(String[] args) {
        Character[] chara = new Character[5];
        chara[0] = new Fighter("Dyrroth", 50);
        chara[1] = new Mage("Eudora", 55);
        chara[2] = new Fighter("Chou", 40);
        chara[3] = new Fighter("Leomord", 60);
        chara[4] = new Mage("Esmeralda", 45);

        for (Character character : chara) {
            printAttack(character);
        }

        public static void printAttack(Character character) {
            int melee = character.attack("melee");
            int ranged = character.attack("ranged");
            int fire = character.attack("fire");
            int frost = character.attack("frost");
        }

        // System.out.println(chara.name + "attack with " + chara.attack() + " attack power, melee " + melee);
        // System.out.println();
    }
}