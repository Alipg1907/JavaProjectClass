package Class10Notes;

public class StringDemoPractice2 {
    public static void main(String[] args) {
        String userName="User123";
        String password="Pass123";
        String confirmPassword="Pass24";
        if(userName.isEmpty()||password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");

        } else if (password.contains(userName)) {
            System.out.println("Password cannot contain username");

        } else if (password.equals(confirmPassword)) {
            System.out.println("Password do not match");

        }else {
            System.out.println("Your username and password has been created");
        }
    }
}
