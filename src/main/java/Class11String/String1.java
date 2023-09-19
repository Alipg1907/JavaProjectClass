package Class11String;

public class String1 {
    public static void main(String[] args) {
        String str="Batch 17 is great.";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));
        System.out.println(str.length());
        System.out.println(str.charAt(17));
        int length=str.length();
        System.out.println(length); //18
        System.out.println(17);
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt(str.length()-3));
        System.out.println(str.charAt(str.length()-10));
        int lastIndex=str.length()-1;
        System.out.println(lastIndex);
        char c=str.charAt(lastIndex);
        System.out.println(c);
    }
}
