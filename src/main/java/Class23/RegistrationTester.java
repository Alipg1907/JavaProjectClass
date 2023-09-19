package main.java.Class23;

public class RegistrationTester {
    public static void main(String[] args) {
        Class23.Registration user = new Class23.Registration();

        user.setEmail("user@yahoo.com");
        user.setUserName("myusername");
        user.setPassword("mypassword123");

        user.displayUserDetails();
    }
}
