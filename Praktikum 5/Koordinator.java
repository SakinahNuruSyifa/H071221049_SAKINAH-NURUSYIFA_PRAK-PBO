public class Koordinator extends Komunitas {
    
    public Koordinator(String nama, String nim, int umur, String bidang){
        setNama(nama);
        setNim(nim);
        setUmur(umur);
        setBidang(bidang);
    }

    public void infoKoor(){
        System.out.println("Nama \t= " + getNama());
        System.out.println("NIM \t= " + getNim());
        System.out.println("Umur \t= " + getUmur() + " tahun");
        System.out.println(getNama() + " adalah seorang koordinator bidang " + getBidang());
    }
}
