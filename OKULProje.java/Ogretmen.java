import java.lang.classfile.instruction.SwitchCase;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }



    public static void OgretmenMenu() throws InterruptedException {
        String tercih2;
        do {
            System.out.println("\n\n\n\t\t\t=====YILDIZLARARASI KOLEJİ=====\n" +
                    "\t\t\t===== OGRETMEN LİSTESİ =====\n" +
                    "\n" +
                    "\t 1-Ogretmenler Listesi Yazdir\n" +
                    "\t 2-Soyisimden Ogretmen bul\n" +
                    "\t 3-Branstan Ogretmen bul\n" +
                    "\t 4-Bilgilerini girerek ogretmen ekleme\n" +
                    "\t 4-Kimlik No ile Kayıt silme\t\n" +
                    "\t A- Ana Menu\n" +
                    "\t Q-Çıkış\n");
            System.out.println("Seçim giriniz :");
            tercih2 = scanner.nextLine();

            switch (tercih2) {
                case "1":
                    ogretmenListesiYazdir();

                    break;
                case "2"://Soyisimden öğretmen bulma
                soyisimdenOgretmenBulma();

                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "Q":
                case "q":
                    break;
                default:
                    System.out.println("Geçerli tercih giriniz !");
                    break;

            }
        } while (!tercih2.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    static Map<String, String> OgretmenlerMap = new HashMap<>();
    static {
        OgretmenlerMap.put("123456456789", "Ali,Can,1980,Matematik ");
        OgretmenlerMap.put("123456456879", "Serdar,Ak,1975,Kalkülüs ");
    }

    public static void ogretmenListesiYazdir() throws InterruptedException {
        Set<Map.Entry<String, String>> OgretmenEntrySet = OgretmenlerMap.entrySet();
        Thread.sleep(500);
        System.out.println("\n\n\n\t\t\t=====YILDIZLARARASI KOLEJİ=====\n" +
                "\t\t\t===== OGRETMEN LİSTESİ =====\n" +
                "Tc No\t\t\t İsim\t\t\t Soyisim\t\t\t D.yili\t\t\t Brans\t\t\t");

        for (Map.Entry<String, String> each : OgretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuearr[] = eachValue.split(",");
            System.out.printf("%11s\t\t %6s\t\t\t %8s\t\t\t %4s\t\t\t %10s\t\t \n" , eachKey , eachValuearr[0] ,eachValuearr[1],eachValuearr[2],eachValuearr[3]);

        }

    }
    public static void soyisimdenOgretmenBulma(){
        System.out.println("Aranacak kişinin Soy ismini giriniz");
        String soyİsim=scanner.nextLine();

    Set<Map.Entry<String, String>> OgretmenEntrySet = OgretmenlerMap.entrySet();
        System.out.println("\n\n\n\t\t\t=====YILDIZLARARASI KOLEJİ=====\n" +
                "\t\t\t===== SOYİSİMDEN OGRETMEN LİSTESİ =====\n" +
                "Tc No\t\t\t İsim\t\t\t Soyisim\t\t\t D.yili\t\t\t Brans\t\t\t");

        for (Map.Entry<String, String> each : OgretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuearr[] = eachValue.split(",");
            if(soyİsim.equalsIgnoreCase(eachValuearr[1]))
            System.out.printf("%11s\t\t %6s\t\t\t %8s\t\t\t %4s\t\t\t %10s\t\t \n" , eachKey , eachValuearr[0] ,eachValuearr[1],eachValuearr[2],eachValuearr[3]);
        

        }

        }
    }


