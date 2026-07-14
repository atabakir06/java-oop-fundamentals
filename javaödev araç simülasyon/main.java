abstract class Otomobil {
    String renk;
    double en;
    double boy;

    // Üst sınıf için kurucu metot (Constructor)
    public Otomobil(String renk, double en, double boy) {
        this.renk = renk;
        this.en = en;
        this.boy = boy;
    }

    public abstract void kimsin();
    public abstract void calistir();
}

interface Kamyonet {
    void doldur();
    void yurut();
}

class ISUZU extends Otomobil implements Kamyonet {
    private double kasaboy;
    double kasayukseklik;

    // Alt sınıf için kurucu metot
    public ISUZU(String renk, double en, double boy, double kasaboy, double kasayukseklik) {
        super(renk, en, boy); // Üst sınıfın değişkenlerini super ile gönderdik
        this.kasaboy = kasaboy;
        this.kasayukseklik = kasayukseklik;
    }

    // private olan kasaboy değişkeni için isteğe bağlı Getter metodu (Kapsülleme standartı)
    public double getKasaboy() {
        return kasaboy;
    }

    @Override
    public void kimsin() {
        System.out.println("Ben bir ISUZU kamyonetim.");
    }

    @Override
    public void calistir() {
        System.out.println("ISUZU motoru çalıştırılıyor.");
    }

    @Override
    public void doldur() {
        System.out.println("ISUZU kamyonet kasası dolduruluyor.");
    }

    @Override
    public void yurut() {
        System.out.println("ISUZU kamyonet hareket ediyor.");
    }
}

public class Main {
    public static void main(String[] args) {
        ISUZU arac = new ISUZU("Beyaz", 2.0, 4.5, 3.0, 1.5);
        
        arac.kimsin();
        arac.calistir();
        arac.doldur();
        arac.yurut();
    }
}