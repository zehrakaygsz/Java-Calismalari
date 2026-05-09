public class W16 {
    public static void main(String[] args) {
        //Kullanıcıdan belirli formatta verdiği String fiyatları
        //toplayıp yazdırsın.
        //örnek: input : "15.30 €" , input2="11.45€"
        //output : 26.75 € 
        //Not : sondaki para birimi değişken olmalıdır.

        String fiyatStr1= "15.30 TL";
        String fiyatStr2="11.45 TL";
        
        //İlk olarak fiyatlardaki para birimini tutmam gerekiyor. 
        String f1 = fiyatStr1.substring(0,5).replaceAll("\\D","");
        Double s1= Double.parseDouble(f1)/100;
        System.out.println("Fiyat 1 = "+s1);

        String f2=fiyatStr2.substring(0,5).replaceAll("\\D", "");
        Double s2=Double.parseDouble(f2)/100;
                System.out.println("fiyat 2 = "+s2);

        Double sonuc= s1+s2;

        String birim= fiyatStr1.substring(5);

        System.out.println("İşlem tutarı = "+sonuc+" "+birim);



    }
}
