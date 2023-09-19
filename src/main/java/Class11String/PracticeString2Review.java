package Class11String;

public class PracticeString2Review {
    public static void main(String[] args) {
        String str = "Sunday";
        System.out.println(str.length());
        System.out.println();
        for (int i = str.length()-1 ; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
