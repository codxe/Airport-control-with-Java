public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha gökçen havalimanına hoş geldiniz ...");
        
        String sartlar = " yurt dışı çıkış kuralları.../n"
                + "Herhangi bir siyasi yasağınızın bulunmaması gerekiyor/n"
                + "15 tl harç bedelini tam olarak yatırmanız gerekiyor../n"
                + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor.";
        
        String message = "Yurt dışı şartlarında hepsini sağlamanız gerekiyor ...";
        
        while (true) {            
            System.out.println("*********************");
            System.out.println(message);
            System.out.println("--------------------");
            System.out.println(sartlar);
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);
            if (yolcu.yurddisiHarciKontrol() == false) {
                System.out.println(message);
                continue; // döngünün basına gider
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            
            if (yolcu.SiyasiyasakKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("vize durumu kontrol ediliyor..");
            Thread.sleep(3000);
            
            if (yolcu.VizedurumuKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamam yutdışı çıkışı onaylandı..");
            break;
        }
    }
}
