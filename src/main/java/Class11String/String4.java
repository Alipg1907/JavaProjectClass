package Class11String;

public class String4 {
    public static void main(String[] args) {
        String str = "Batch 17 is A great batch. Just Kidding Please don't take it seriously";
        System.out.println(str.length());
        String subStr = str.substring(0,5);
        String w = str.substring(0,10);
        String b = str.substring(0,4);
        System.out.println(subStr);
        System.out.println(w);
        System.out.println(b);
    }
}
