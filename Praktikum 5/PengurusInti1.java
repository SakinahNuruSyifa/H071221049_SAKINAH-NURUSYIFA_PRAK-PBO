public class PengurusInti1 extends Komunitas {

    public PengurusInti1(String nama, String nim, int umur, String jabatan){
        setNama(nama);
        setNim(nim);
        setUmur(umur);
        setJabatan(jabatan);
    }
    
    public void infoPengurus(){
        System.out.println("Nama \t= " + getNama());
        System.out.println("NIM \t= " + getNim());
        System.out.println("Umur \t= " + getUmur() + " tahun");
        System.out.println(getNama() + " adalah seorang " + getJabatan());
    }
}
