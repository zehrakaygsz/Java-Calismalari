public class z14{
    public static void main(String[] args){
        //Çok Boyutlu Diziler
        //Erkek Çocuklarda Boy ve Kilo Cetveli
        /* 1.yaş ort boy=75 cm , ort kilo=10kg
        2. yaş ort boy =87,ort kilo=13
        3.yaş ort boy=95,ort kilo =15;
        4.yaş ort boy=103,ort kilo=17
        5.yaş ort boy=110 ,ort kilo=19 */
        // tek boyutlu dizi tanımlaması : int[] tek=new int[eleman sayısı];    
        //Çift boyutlu dizi tanımlaması : int [][] hesaplama = new int[a][b];
        int [][] tablo=new int[][]{
        {1,75,10},
        {2,87,13},
        {3,95,15},
        {4,103,17},
        {5,110,19}
    };
    /*int[][] tablo2= new int[5][3];
    tablo2[0][0]=1;
    tablo2[0][1]=75;
    tablo[0][2]=10;*/

    for(int i=0;i<tablo.length;i++){
        for(int k=0;k<tablo[0].length;k++){
            System.out.print(tablo[i][k]+" ");
        }
        System.out.println();
    }









    }










}