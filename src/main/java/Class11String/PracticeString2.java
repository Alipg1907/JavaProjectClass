package Class11String;

public class PracticeString2 {
    public static void main(String[] args) {
        String str = "AliPG", name=" ";
        char N;
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            N=str.charAt(i); //excute each character
            name=N+name;
        }
        System.out.println("Reversed word: "+ name);



    }
}





//second part
//Create a String and print it in reverse order(sunday to yadnuS)