public class Musik {
    // Atribut kelas Musik
    String title;
    String artis;
    
    public void titleMusik (String titleMusik) {
        title = titleMusik;
    }
    public void artisMusik (String artisMusik) {
        artis = artisMusik;
    }
    public void detailMusik() {
        System.out.println("title : " + title);
        System.out.println("Artis : " + artis);
    }
    public static void main(String[] args) {
        Musik music = new Musik();
        music.titleMusik("Ditto");
        music.artisMusik("NewJeans");
        music.detailMusik();
    }
    
}