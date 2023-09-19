package Class14;

//How would you reverse a String word by word?
//for example
//input => This is sentence I want to reverse
//output=> sihT si ecnetnes i tnaq ot esrever
public class T1ReverseWord {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.accountNumber);



        StringBuilder sb = new StringBuilder("This is sentence I want to reverse");
        sb.reverse();
        System.out.println(sb);

        String str = "This is sentence I want to reverse";
        String[] arr = str.split(" "); // when we leave space it gives word!
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) { // on lenght part we need use parantheses
            // if we say str.lenght because we are calling method
            String word=arr[i];
            String reversed=reverseStr(word);
            System.out.print(reversed+ " ");

        }


    }
    static String reverseStr(String inputStr){

        String reversed="";
        for (int i = inputStr.length()-1; i>=0; i--) {
            reversed=reversed+inputStr.charAt(i);

        }
        return reversed;

    }

}