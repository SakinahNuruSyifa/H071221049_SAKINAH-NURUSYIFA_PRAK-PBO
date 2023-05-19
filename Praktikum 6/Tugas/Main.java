abstract class Dog {
    protected int position;
    protected int averageLenght;
    
    public Dog(int position, int averageLenght) {
        this.position = position;
        this.averageLenght = averageLenght;
    }
    abstract void describe();
}
interface Move {
    void move();
}

class Pitbull extends Dog implements Move {

    public Pitbull(int position, int averageLenght){
        super(position, averageLenght);
    }

    @Override
    void describe() {
        System.out.println("1. Memiliki rahang  yang kuat \n2. Memiliki tubuh berotot \n3. Memiliki telinga berbentuk segitiga");
    }

    @Override
    public void move() {
        position += 3;
    }
}

class SiberianHusky extends Dog implements Move {

    public SiberianHusky(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    void describe() {
        System.out.println("1. Memiliki bulu yang tebal \n2. Memiliki tubuh proporsial dan berotot \n3. Berukuran sedang dengan kerangka yang ringan dan padat");
    }

    @Override
    public void move() {
        position += 2;
    }
}

class Bulldog extends Dog implements Move {

    public Bulldog(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    void describe() {
        System.out.println("1. Memiliki kaki yang pendek \n2. Memiliki hidung berwarna hitam \n3. Memiliki lipatan kulit di sekitar kepala dan wajahnya");
    }

    @Override
    public void move() {
        position += 1;
    }
}

class GermanShepherd extends Dog implements Move {

    public GermanShepherd(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    void describe() {
        System.out.println("1. Memiliki rahang yang kuat \n2. Memiliki otot leher yang besar \n3. Memiliki punggung yang kokoh dan dada yang lebar");
    }

    @Override
    public void move() {
        position += 3;
    }
}

class Smartphone implements Move {
    protected int price;
    protected String brand;
    
    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Move {
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;
    
    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

class Main{
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(10, 55);
        // SiberianHusky husky = new SiberianHusky(15, 60);
        // Bulldog bulldog = new Bulldog(20, 50);
        // GermanShepherd shepherd = new GermanShepherd(30, 65);

        pitbull.move();
        // husky.move();
        // bulldog.move();
        // shepherd.move();

        System.out.println("-".repeat(20) + " DOG " + "-".repeat(20));
        System.out.println("* Pitbull");
        System.out.println("> Position  : " + pitbull.position);
        System.out.println("> Deskripsi : ");
        pitbull.describe();
        System.out.println("=".repeat(45));

        // System.out.println("* Siberian Husky");
        // System.out.println("> Position  : " + husky.position);
        // System.out.println("> Deskripsi : ");
        // husky.describe();
        // System.out.println("=".repeat(45));

        // System.out.println("* Bulldog");
        // System.out.println("> Position  : " + bulldog.position);
        // System.out.println("> Deskripsi : ");
        // bulldog.describe();
        // System.out.println("=".repeat(45));

        // System.out.println("* German Shepherd");
        // System.out.println("> Position  : " + shepherd.position);
        // System.out.println("> Deskripsi :");
        // shepherd.describe();
        // System.out.println("=".repeat(45));

        Smartphone phone = new Smartphone(20_000_000, "Samsung Galaxy S23 Ultra");
        System.out.println("-".repeat(16) + " Smartphone " + "-".repeat(16));
        phone.move();
        System.out.println("=".repeat(45));

        Car car = new Car(4, "Blue", 120);
        System.out.println("-".repeat(20) + " Car " + "-".repeat(20));
        car.move();
        System.out.println("=".repeat(45));
    }
}