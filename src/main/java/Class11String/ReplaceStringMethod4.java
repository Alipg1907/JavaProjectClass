package Class11String;

public class ReplaceStringMethod4 {public static void main(String[] args) {
    String str = " Hi There how are you. I am Good. I am Driving";
    String [] strs =  str.split("[.\\s]");
    //String [] strs =  str.split("[.\\s]");

    System.out.println(strs.length);
    System.out.println(strs[0]);
    System.out.println(strs[2]);
    System.out.println(strs[2].trim());
    System.out.println(strs.length);


}
}
