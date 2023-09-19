package Class13;

public class E4StringBuilder {
    public static void main(String[] args) {
        String str=new String("Habib");
        String name="Habib";

        StringBuilder stringBuilder=new StringBuilder("Ehab");
        //StringBuilder name2="sdsd"; if you are using string builde ryou need to go long
        // long way like at the line 8
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(1);
        System.out.println(stringBuilder);
        stringBuilder.append("d");
        System.out.println(stringBuilder);
    }
}


//StringBuilder is mutable !