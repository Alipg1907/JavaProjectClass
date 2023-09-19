package Class11String;

public class ReplaceStringMethod5 {
    public static void main(String[] args) {
        String str = "Hi#There#how#are#you";
        String [] strarr=str.split("[#]");
        System.out.println(strarr.length);
        System.out.println(strarr[1]); //index starts from 0

    }
}
