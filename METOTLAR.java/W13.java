public class W13 {
    public static void main(String[] args) {
        String str  = "ali mert SAHIN";
        String yeni = str.replaceAll("\\w", "*");
        System.out.println(yeni.replaceFirst("\\*","A"));
    }
}
