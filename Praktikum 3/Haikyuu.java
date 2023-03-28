public class Haikyuu {
    String name;
    String position;
    int number;
    int shootPower;

    public Haikyuu(String name, String position, int number, int shootPower) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.shootPower = shootPower;
    }

    public Haikyuu(String name, int number) {
        this.name = name;
        this.number = number;
        this.position = "unknown";
        this.shootPower= 100;
    }

    public int getShootPower() {
        return shootPower;
    }

    public void setShootPower(int shootPower) {
        this.shootPower = shootPower;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void tampilkanPemain() {
        System.out.println("Nama : " + name);
        System.out.println("Posisi : " + position);
        System.out.println("No. jersey : " + number);
    }

    public void tandingShoot(Haikyuu haikyu) {
        if (this.shootPower>haikyu.getShootPower()) {
            System.out.println(this.getName()+ " shootnya lebih kuat daripada " + haikyu.getName());
        }else if (this.shootPower==haikyu.getShootPower()){
            System.out.println(this.getName()+ " shootnya sama kuat dengan " + haikyu.getName());
        }else if (this.shootPower<haikyu.getShootPower()){
            System.out.println(haikyu.getName()+ " shootnya lebih kuat daripada " + this.getName());
        }
    }
}

    // public void introduce() {
    //     System.out.println("My name is " + this.name + ", My position is " + this.position + ". My jersey number is " + this.number + ".");
    // }

    // public void attack() {
    //     System.out.println(this.name + "receive the ball!");
    // }
    
    // // Constructor 1
    // public Haikyuu(String teamName, String captainName, int numberOfPlayer) {
    //     namaTim = teamName;
    //     namaKapten = captainName;
    //     jumlahPemain = numberOfPlayer;
    // }
    // // Constructor 2
    // public Haikyuu(String teamName, int numberOfPlayer) {
    //     namaTim = teamName;
        
    // }