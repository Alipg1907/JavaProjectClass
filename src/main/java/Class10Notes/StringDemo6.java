package Class10Notes;

public class StringDemo6 {
    public static void main(String[] args) {
        String name="Artur";
        System.out.println(name.isEmpty());
        //name is not empthy so boolean will say false
        String name2="";
        boolean is=name.isEmpty();
        System.out.println(is);
    }
}
