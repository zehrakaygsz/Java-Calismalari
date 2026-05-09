public class M4 {
    public static void main(String[] args) {
        /*
         * Verilen metnin palindrom olup olmadığını kontrol edip ,
         * palindrom ise true , değilse false döndüren method oluşturunuz.
         */
        Boolean deger = palindromMu("151");
        System.out.println("Degeri : "+deger);
    }

    public static Boolean palindromMu(String metin) {
        String yeni = "";
        Boolean sonuc = false ; 
        for(int i=metin.length()-1;i>=0;i--){
            yeni+=metin.charAt(i);
            System.out.println(yeni);
        }if(!metin.equals(yeni)){
            sonuc=false;
        }else{
            sonuc=true;
        }
        return sonuc ; 


    }
}
