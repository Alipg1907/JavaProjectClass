package Review6;

public class E2StringMethods {
    public static void main(String[] args) {
        String str = "This is a Java class";
        boolean starts = str.startsWith("T");
        System.out.println(starts);
        System.out.println(str.endsWith("class"));
        System.out.println(str.contains("Java"));
        str.indexOf('a');
        int num = 'a';
        System.out.println(num);
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf(97));
        String.valueOf(12);
        char c = str.charAt(8);
        System.out.println(c);
    }
}
