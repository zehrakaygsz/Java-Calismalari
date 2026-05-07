public class Selamlama {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Lütfen parametre giriniz :");
            System.out.println("Kullanım : java Selamlama <Ad> <Soyad> <Yaş>");
            return;

        }
        String ad =args[0];
        String soyad = args[1];
        int yas = Integer.parseInt(args[2]);

        System.out.println("Merhaba "+ad+" "+ soyad);
        System.out.println("Seneye "+ (yas+1) + " yaşında olacaksın. ");
    }
}

