class Player{
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player() {}

    public void getDamage(Player enemy) {
        this.hp = hp-Math.abs(enemy.getAttackPower()-defense);
    }

    public Player(String name, int attackPower, int defense) {
        this.name = name;
        this.attackPower = 30;
        this.defense = 15;
        this.hp = 100;
    }

    public Player(String name, int defense) {
        this.name = name;
        this.defense = defense;
        this.hp = 100;
    }

    public void setAttackPower(String name, int defense){
        this.name = name;
        this.defense = defense;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttackPower (int attackPower) {
        this.attackPower = attackPower;
    }

    public void setDefense (int defense) {
        this.defense = defense;
    }
    
    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }
    
    int getAttackPower() {
        return attackPower;
    }
}
    
public class Main {
    public static void main(String [] args) {
        Player player1= new Player("Mino", 30, 15);
        Player player2= new Player("Hilda", 10);
        player2.setAttackPower(35);
        player1.getDamage(player2);
        player1.status();
        player2.status();
    }
}