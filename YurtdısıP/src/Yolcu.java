
import java.util.Scanner;

public class Yolcu implements YurtDısıKuralları{
    private int  Harc;
    private boolean siyasiyasak;
    private boolean vizedurum;
    
    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("yatırdığınız harç miktarı :");
        this.Harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Siyasi cezanız var mı : ");
        String cevap = scanner.nextLine();
        if (cevap == "evet") {
            this.siyasiyasak = true;
        }
        else{
         this.siyasiyasak = false;
        }
        
        System.out.println("Vizeniz bulunuyor mu : ");
        String cevap2 = scanner.nextLine();
        if (cevap2 == "evet") {
            this.vizedurum = true;
        }
        else{
         this.vizedurum = false;
        }
    }
    
    @Override
    public boolean yurddisiHarciKontrol() {
        if (this.Harc < 15) {
            System.out.println("Harcınızı tam yatırın.");
            return false;
        }
        else{
            System.out.println("Harc işlemi tamam.");
            return true;
        }
    }

    @Override
    public boolean SiyasiyasakKontrol() {
        if (this.siyasiyasak = false) {
            System.out.println("siyasi yasağınız var yurt dışına çıkamazsınız.");
            return false;
        }
        else{
            System.out.println("yurt dışına çıkış serbest.");
            return true;
        }
   
    }

    @Override
    public boolean VizedurumuKontrol() {
        if (this.vizedurum = true) {
            System.out.println("yurt dışı vizesi onaylandı!");
            return true;
        }
        else{
            System.out.println("gideceğiniz ülkeye vizeniz bulunmamaktadır.");
            return false;
        }
        
    }
    
}
