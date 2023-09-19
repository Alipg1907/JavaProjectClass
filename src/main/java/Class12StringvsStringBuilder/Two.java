package Class12StringvsStringBuilder;

public class Two {
    public static void main(String[] args) {
        String name1,name2,name3,name4;
        name1="united States of America";
        name2="united States of America";
        name3="united States of America";
        name4="united States of America";

        StringBuilder sb=new StringBuilder("Sunday");
        StringBuffer sf=new StringBuffer("Sunday");
        sb.reverse();
        sf.reverse();
    }
}
