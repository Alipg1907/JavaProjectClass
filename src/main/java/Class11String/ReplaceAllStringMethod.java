package Class11String;

public class ReplaceAllStringMethod {
    public static void main(String[] args) {
        String str="jklsjkGHFDHhjh   dfj212323r#$546y74";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[]b-h]", "0"));
        System.out.println(str.replaceAll("[0-9]", "W"));
        System.out.println(str.replaceAll("[&-;]","T"));
        System.out.println(str.replaceAll("[]A-Z0-58-9a-g]","o"));
        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str.replaceAll("\\s",""));
        System.out.println(str.replaceAll("^A-Z",""));

    }
}
