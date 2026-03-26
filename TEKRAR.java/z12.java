public class z12 {


    public static void main(String[] args){
        char Karakter='A';
        System.out.println(Karakter);
        Karakter=65;
        System.out.println(Karakter);
        Karakter++;
        System.out.println(Karakter);

        short s1;
        s1=(short)(32767+3);
        System.out.println(s1);

        int k = (int)1903.0;
        System.out.println(k);
        byte b=(byte)125L;
        System.out.println(b);
        long c=(byte)(200);
        System.out.println(c);
        byte d = (byte)200L;
        System.out.println(d);

        String c1="zehra";
        String metin=c1.toUpperCase();
        System.out.println(metin);

        double sonuc1=Double.parseDouble("500.5");
        System.out.println(sonuc1);

        float sonuc2= Float.parseFloat("500.5");
        System.out.println(sonuc2);

        long sonuc3=Long.parseLong("2563987");
        System.out.println(sonuc3);

        short sonuc4= Short.parseShort("256");
        System.out.println(sonuc4);

        byte sonuc5= Byte.parseByte("127");
        System.out.println(sonuc5);

        int sonuc6= Integer.parseInt("500");
        System.out.println(sonuc6+50);

        byte sonuc7=127;
        String SozelDeger=String.valueOf(sonuc5);
        System.out.println(SozelDeger+20);

        String mesaj = "merhaba nasilsin?";
        char ch='?';
        mesaj = "naber?"+"123"+12;
        mesaj+=ch;

        System.out.println(mesaj);

        
    
}
}