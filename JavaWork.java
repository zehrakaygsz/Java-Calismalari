public class JavaWork{
    public static void main (String[] args){
        short x= 60;
        System.out.println("Aracin hizi :" +  x + "km/sa");
        short y=2;
        System.out.println("Yolda oldugu süre zarfi :"+ y +"saattir.");
        short z= (short)(x*y);
        System.out.println("Aracin almis oldugu yol "+ z + " kmdir.");

        

        float k =20.4f;
        System.out.println("k = "+k+" float degerindedir.");

        float m = k*2;
        System.out.println("m degeri = "+m+"dir."); 

        //double örnekleri
        double p=20.4;
        System.out.println("P degeri = "+p);

        //Boolean 
        boolean flag = true;
        System.out.println(flag);

        flag = false;
        System.out.println(flag);

        //Char değişkeni
        char c ='a';
        char d= 'z';
        char sykey = 65;
        char ascii = 35;
        System.out.println("C karsiligi = " +c);
        System.out.println("D karsiligi= " +d);
        System.out.println("ASCII Degeri = " +sykey);
        System.out.println(ascii);

        //String Değişkeni
        String metin = " zehra kaygisiz"  ;
        System.out.println("İsminiz: "+ metin);
        metin = metin.toUpperCase();
        System.out.println("İsminiz : "+metin);
        String altmetin = metin.substring(8,12);
        System.out.println(altmetin);
        String test= "17";
        String yeniMetin = altmetin+test;
        System.out.println(yeniMetin);
        









        

        




    
    } 
}