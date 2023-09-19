package Class11String;

public class Practice1ReviewImportant {
    public static void main(String[] args) {
        String str = "hello";
        // if (!str.isEmpty()){ we dont need that becuase it s already has 3 charaters
        if (str.length() % 2 != 0 && str.length() >= 3) {
        int middle=str.length()/2;
            System.out.println(str.charAt(middle));
            System.out.println(middle);
        }


    }
}


//Create a String and if the string is not empthy perform the following:
// if the string has an odd number of characters and has 3 or more characters,
//print the character in the middle of the string.
// for example String str=hello=>=l
