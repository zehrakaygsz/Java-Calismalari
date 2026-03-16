import java.util.Scanner;

public class K9 {
    public static void main(String[] args) {
/*İdeal kilo hesabı yapan bir program yazılmak istenmektedir. Programın çalışması şu şekilde 
olmalıdır. Kişinin boy(cm olarak girildiği düşünülecek-örnek:170), yaş, cinsiyet(Erkek için E, kız 
için K bilisi girildiği düşünülecek) ve o andaki kilosu (kg olarak girildiği düşünülecek-örnek: 65) 
klavyeden girilerek aşağıdaki formüle göre ideal kilosunu hesaplanacaktır ve ekrana 
yazdırılacaktır. İdeal kilosu ekrana yazdırıldıktan sonra öğrencinin kilo farkını ekrana 
yazdırılmalıdır (örnek: 10 kilo vermelisiniz veya 2,5 kilo almalısınız veya tebrikler ideal 
kilonuzdasınız). 
a. İdeal Kilo = ( boy–100 + yaş/10 )*K formülü ile hesaplanır */
Scanner giris= new Scanner(System.in);
int yas,kilo;
double sonuc;
System.out.println("Boy degerini giriniz :");
int boy= giris.nextInt();

System.out.println("Yas degerini giriniz :");
yas = giris.nextInt();

System.out.println("Kilo degerini giriniz :");
kilo =giris.nextInt();

System.out.println("Cinsiyetinizi giriniz : Erkek icin E/ Kiz icin K giriniz.");
char cinsiyet = giris.next().charAt(0);

System.out.println("Cinsiyet : " +cinsiyet);
System.out.println("Girilen Yas degeri :" +yas);
System.out.println("Girilen kilo degeri :"+kilo);
switch(cinsiyet){
    case 'K':
    double k=0.8;
    double ideal_kilo = (boy-100 +yas/10)*k;
    System.out.println("İdeal kilonuz = "+ideal_kilo);
    if(ideal_kilo<kilo){
        System.out.println("Kilo farkiniz =" +(ideal_kilo-kilo));
        System.out.println((ideal_kilo-kilo)+"kadar kilo vermelisiniz.");
    }else
        System.out.println((ideal_kilo-kilo)+"kadar kilo almalisiniz.");

    
    

case 'E':
    

    double e=0.9;
    ideal_kilo = (boy-100 +yas/10)*e;
    System.out.println("İdeal Kilonuz ="+ideal_kilo);
    System.out.println("Kilo farkiniz ="+(ideal_kilo-kilo));
    if(ideal_kilo<kilo){
        System.out.println("Kilo farkiniz =" +(ideal_kilo-kilo));
        System.out.println((ideal_kilo-kilo)+"kadar kilo vermelisiniz.");
    }else
        System.out.println((ideal_kilo-kilo)+"kadar kilo almalisiniz.");

}
    }
}