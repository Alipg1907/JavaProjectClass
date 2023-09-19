package Class11String;

public class ReplaceStringMethod3 {
    public static void main(String[] args) {
        String str = " Hi There how are you. I am Good. I am Driving";
     String [] strs =  str.split("[.]");
        String [] space =  str.split(" "); // space between " "

        System.out.println(strs.length);
        System.out.println(strs[0]);
        System.out.println(strs[2]);
        System.out.println(strs[2].trim());
        System.out.println(strs);
        System.out.println(space.length);
        System.out.println(space[9]);

    }
}
