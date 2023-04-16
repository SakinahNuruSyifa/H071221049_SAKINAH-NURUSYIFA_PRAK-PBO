public class Bangun {
    
}
class BangunRuang {
    private double hitungLuasPermukaan;
    private double hitungVolume;
    
    public double getHitungLuasPermukaan() {
        return hitungLuasPermukaan;
    }
    public void setHitungLuasPermukaan(double hitungLuasPermukaan) {
        this.hitungLuasPermukaan = hitungLuasPermukaan;
    }
    public double getHitungVolume() {
        return hitungVolume;
    }
    public void setHitungVolume(double hitungVolume) {
        this.hitungVolume = hitungVolume;
    }
}

class BangunDatar {
    private double hitungLuas;
    private double hitungKeliling;
    
    public double getHitungLuas() {
        return hitungLuas;
    }
    public void setHitungLuas(int hitungLuas) {
        this.hitungLuas = hitungLuas;
    }
    public double getHitungKeliling() {
        return hitungKeliling;
    }
    public void setHitungKeliling(double hitungKeliling) {
        this.hitungKeliling = hitungKeliling;
    }
}

class kubus extends BangunRuang {
    private double sisi;

    public kubus (double sisi) {
        this.sisi = sisi;
    }
    public double hitungLuasPermukaan() {
        return 6*sisi*sisi;
    }
    public double hitungVolume() {
        return sisi*sisi*sisi;
    }
}

class balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public balok (double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double hitungLuasPermukaan() {
        return panjang*lebar + 2*(lebar*tinggi) + 2*(panjang*tinggi);
    }
    public double hitungVolume() {
        return panjang*lebar*tinggi;
    }
}

class bola extends BangunRuang {
    private double jarijari;

    public bola (double jarijari) {
        this.jarijari = jarijari;
    }
    public double hitungLuasPermukaan() {
        return 4*Math.PI*jarijari*jarijari;
    }
    public double hitungVolume() {
        return 4*Math.PI*jarijari*jarijari*jarijari/3;
    }
}

class tabung extends BangunRuang {
    private double jarijari;
    private double tinggi;

    public tabung (double jarijari, double tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }
    public double hitungLuasPermukaan() {
        return 2*Math.PI*jarijari*(jarijari+tinggi);
    }
    public double hitungVolume() {
        return Math.PI*jarijari*jarijari*tinggi;
    }
}

class persegi extends BangunDatar {
    private double sisi;

    public persegi (double sisi) {
        this.sisi = sisi;
    }
    public double hitungLuas() {
        return sisi*sisi;
    }
    public double hitungKeliling() {
        return sisi+sisi+sisi+sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang (double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double hitungLuas() {
        return panjang*lebar;
    }
    public double hitungKeliling() {
        return 2*(panjang+lebar);
    }
}

class lingkaran extends BangunDatar {
    private double jarijari;

    public lingkaran (double jarijari) {
        this.jarijari = jarijari;
    }
    public double hitungLuas() {
        return Math.PI*jarijari*jarijari;
    }
    public double hitungKeliling() {
        return 2*Math.PI*jarijari;
    }
}

class segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public segitiga (double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    public double hitungLuas() {
        return alas*tinggi/2;
    }
    public double hitungKeliling() {
        return sisi1+sisi2+sisi3;
    }
}

class Trapesium extends BangunDatar {
    private double sisi1;
    private double sisi2;
    private double sisi3;
    private double sisi4;
    private double tinggi;

    public Trapesium(double sisi1, double sisi2, double sisi3, double sisi4,  double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * (sisi1 + sisi2) * tinggi;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}