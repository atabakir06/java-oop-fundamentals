// 1. Üst Sınıf (Superclass)
class Sekil {
    
    public double alan() { 
        return 0; 
    }
    
    public double cevre() { 
        return 0; 
    }
}

// 2. Alt Sınıf: Üçgen (Subclass)
class Ucgen extends Sekil { 
    private double kenar1; 
    private double kenar2; 
    private double kenar3;

    // Üçgen Sınıfı Kurucu Metodu (Constructor)
    public Ucgen(double kenar1, double kenar2, double kenar3) { 
        this.kenar1 = kenar1; 
        this.kenar2 = kenar2; 
        this.kenar3 = kenar3; 
    } 

    // Çevre hesaplama metodunun ezilmesi (Overriding)
    @Override 
    public double cevre() { 
        return kenar1 + kenar2 + kenar3; 
    } 

    // Heron Formülü ile alan hesaplama metodunun ezilmesi (Overriding)
    @Override 
    public double alan() { 
        double s = cevre() / 2; 
        return Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3)); 
    }
}

// 3. Alt Sınıf: Kare (Subclass)
class Kare extends Sekil { 
    private double kenar;

    // Kare Sınıfı Kurucu Metodu (Constructor)
    public Kare(double kenar) { 
        this.kenar = kenar; 
    } 

    // Çevre hesaplama metodunun ezilmesi (Overriding)
    @Override 
    public double cevre() { 
        return 4 * kenar; 
    }
    
    // Alan hesaplama metodunun ezilmesi (Overriding)
    @Override 
    public double alan() { 
        return kenar * kenar; 
    }
}

// 4. Ana Çalıştırıcı Sınıf (Dosya adı mutlaka Main.java olmalı)
public class Main { 
    public static void main(String[] args) { 
        // Üçgen nesnesi oluşturma ve test etme (Kenarlar: 7, 8, 9)
        Ucgen ucgen = new Ucgen(7, 8, 9); 
        System.out.println("Üçgenin Çevresi: " + ucgen.cevre());
        System.out.println("Üçgenin Alanı:   " + ucgen.alan());
        
        System.out.println("-----------------------------------");

        // Kare nesnesi oluşturma ve test etme (Kenar: 5)
        Kare kare = new Kare(5); 
        System.out.println("Karenin Çevresi: " + kare.cevre()); 
        System.out.println("Karenin Alanı:   " + kare.alan()); 
    }
}