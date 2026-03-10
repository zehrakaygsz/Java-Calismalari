import java.util.Scanner;

public class z7 {
    /* girilen üc sayiyi buyukten kucuge dogru sıralama */
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("Birinci sayiyi giriniz:");
        s1=input.nextInt();
        System.out.println("İkinci sayiyi giriniz:");
        s2=input.nextInt();
        System.out.println("Ücüncü sayiyi giriniz:");
        s3=input.nextInt();
        int max=0,min=0;
        if(s1>s2){
            max=s1;
            min=s2;
            System.out.println("s1>s2");
                if(max<s3){
                    max=s3;
                    System.out.println("s3>s1>s2");
                }else{
                    if(min<s3){
                        System.out.println("s1>s3>s2");
                    }else{
                            System.out.println("s1>s2>s3");
                        }
                    
                }
        }else{
            max=s2;
            min=s1;
            System.out.println("s2>s1");
            if(max<s3){
                max=s3;
                System.out.println("s3>s2>s1");
            }else{
                    System.out.println("s2>s3");
                        if(min<s3){
                            System.out.println("s2>s3>s1");
                        }else{
                                System.out.println("s2>s1>s3");
                            }
                        }
                }
                    
            
        }
    }

