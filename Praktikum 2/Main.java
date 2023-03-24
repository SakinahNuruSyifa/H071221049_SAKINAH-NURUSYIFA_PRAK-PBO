public class Main {
    public static void main(String[]args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Macanda";
        alamat.kota = "Gowa";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Syifa";
        mahasiswa.nim = "H071221049";
        
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap()); 
        // karena get alamat ada di kelas mahasiswa, sedangkan get alamat lengkap ada di kelas alamat yang akan mereturn
    }
}