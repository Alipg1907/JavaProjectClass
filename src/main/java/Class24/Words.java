package main.java.Class24;

import java.util.ArrayList;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("Bee");
        words.add("TV");

        /*for (int i = 0; i < words.size() ; i++) {

            if (words.get(i).endsWith("e")){
                words.remove(i);
                i--;
            }
        } */

        //Lamda expression

        /*words.removeIf((String x)->{
            if(x.endsWith("e")){
                return true;
            }else{
                return false;
            }
        }); */
        words.removeIf(x->x.endsWith("e"));
        //Lamda expression
        //words.removeIf(word -> word.endsWith("e"));
        System.out.println(words);

    }
}
