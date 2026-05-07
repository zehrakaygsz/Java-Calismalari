import java.util.Arrays;
public class W5 {

public class W4 {
    public static int[] diziKopyala(int[] gelenDizi){
    int yeni[]= new int[gelenDizi.length];

    for(int i=0;i<gelenDizi.length;i++)
{
    yeni[i]=gelenDizi[i];
    
}
return yeni;



    }
    public static void main(String[] args) {
        int gelenDizi[]={1,2,3,4,5,6,7};
        int[] kopya = diziKopyala(gelenDizi);
        System.out.println(Arrays.toString(kopya));
    }
}

}
