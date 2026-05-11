public class A2 {
    public static void main(String[] args) {
        String [] harfler = {"a","d","f","e","d","a","a","e","a"};
        String arananHarf="e";
        int sayac=0;
        for(int i = 0;i<harfler.length;i++){
            if(arananHarf.equals(harfler[i])){
                sayac++;
            }else{
                continue;
            }
        }
        if(sayac==0){
            System.out.println("Aranan harf yoktur.");
        }
        System.out.println(sayac+" adet aranan harf vardır.");
    }
}
