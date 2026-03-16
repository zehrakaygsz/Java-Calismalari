import java.util.Scanner;
public class K8 {
    public static void main(String[] args) {
        /*
         * İki sayı arasında dört işlemden(toplama, çıkarma, çarpma, bölme) 
        birini yapan
         * programın
         * çalışması şu şekilde olmalıdır; ilk önce iki sayının 
         * veri girişi yapılacak
         * daha sonra ise kullanıcı
         * hangi matematiksel işlemi yapmak istiyorsa o işlemin
         *  operatörünü klavyeden
         * girecek ve iki
         * sayı kullanıcının girdiği matematik operatörüne göre
         *  hesaplamasını yapıp
         * sonucu ekrana
         * yazdıracaktır. Bu işlemi yapan programın algoritmasını 
         * yazınız.( toplama için
         * +, çıkarma için -,çarpma için * ,bölme için / veri girişi olduğunu
         * varsayınız.
         */
        Scanner giris= new Scanner(System.in);
        System.out.println("Hesap yapilacak iki sayiyi giriniz :");
        Double s1,s2;
        s1=giris.nextDouble();
        s2=giris.nextDouble();
        Double sonuc;
        System.out.println("Yapmak istediginiz islemi seciniz:");
        System.out.print("+ = Toplama/- = cikarma /* =Carpma / / =Bolme");
        char secim = giris.next().charAt(0);

            switch(secim){
                case '+':
                    System.out.println("Toplama islemi secildi. Sonuc = "+ (s1+s2));
                    break;
                case '-':
                    System.out.println("Cikartma islemi secildi. Sonuc = "+(s1-s2));
                    break;
                case '*':
                    System.out.println("Carpma islemi secildi.Sonuc ="+(s1*s2));
                    break;
                case '/':
                    System.out.println("Bolme islemi secildi. Sonuc ="+(s1/s2));
                    break;
                default:
                    System.out.println("Lutfen gecerli islem seciniz!");
                    break;
            }
    }
}
