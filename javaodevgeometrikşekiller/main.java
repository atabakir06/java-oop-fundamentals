abstract class Sekil { 
    public void alan() { 
        System.out.println("Bu şeklin alanı hesaplanabilir."); 
    } 
    public abstract double cevre(); 
} 

interface Semal { 
    void hacim(); 
    void boyut(); 
    void kimsin(); 
} 

class Ucgen extends Sekil implements Semal { 
    private double kenar1; 
    private double kenar2; 
    private double kenar3; 
    private double yukseklik; 

    public Ucgen(double kenar1, double kenar2, double kenar3, double yukseklik) { 
        this.kenar1 = kenar1; 
        this.kenar2 = kenar2; 
        this.kenar3 = kenar3; 
        this.yukseklik = yukseklik; 
    } 

    
    @Override
    public double cevre() { 
        return kenar1 + kenar2 + kenar3; 
    } 

    
    @Override
    public void kimsin() { 
        System.out.println("Ben bir üçgenim."); 
    } 

    @Override
    public void hacim() { 
        System.out.println("Üçgenin hacmi yoktur."); 
    } 

    @Override
    public void boyut() { 
        System.out.println("Üçgen iki boyutlu bir şekildir."); 
    } 

    
    public double alanUcgen() { 
        return (kenar1 * yukseklik) / 2; 
    } 
}


public class GeometriMain {
    public static void main(String[] args) {
        
        Ucgen ucgen = new Ucgen(3.0, 4.0, 5.0, 4.0);

 
        ucgen.kimsin();
        System.out.println("Üçgenin Çevresi: " + ucgen.cevre());
        System.out.println("Üçgenin Alanı: " + ucgen.alanUcgen());
        ucgen.boyut();
        ucgen.hacim();
    }
}












