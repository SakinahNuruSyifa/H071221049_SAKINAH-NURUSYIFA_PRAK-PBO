public class Main2 {
    public static void main(String[] args){
        PengurusInti1 pi1 = new PengurusInti1("Syifa", "H071221049", 18, "ketua");
        PengurusInti1 pi2 = new PengurusInti1("Ethan", "H071221051", 18,"sekretaris");
        PengurusInti1 pi3 = new PengurusInti1("Jake", "H071221060", 17, "bendahara");
        System.out.println("=".repeat(15) + "PENGURUS INTI" + "=".repeat(15));
        pi1.infoPengurus();
        pi2.infoPengurus();
        pi3.infoPengurus();  
        System.out.println("=".repeat(43));

        Koordinator koor1 = new Koordinator("Jay", "H071221020", 19, "perlengkapan");
        Koordinator koor2 = new Koordinator("Ricky", "H071221035", 19, "danus");
        Koordinator koor3 = new Koordinator("Kamden", "H071221031", 20, "humas");
        System.out.println("=".repeat(15) + "PENGURUS INTI" + "=".repeat(15));
        koor1.infoKoor();
        koor2.infoKoor();
        koor3.infoKoor();
        System.out.println("=".repeat(43));
    }
}
