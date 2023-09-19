package Class12StringvsStringBuilder;

public class StringvsStringBuilder {
    public static void main(String[] args) {
        String name = "Barber";
        name.toLowerCase();
        System.out.println(name);

        StringBuilder sb=new StringBuilder("sunday");
        sb.reverse();
        System.out.println(sb);
    }
}
