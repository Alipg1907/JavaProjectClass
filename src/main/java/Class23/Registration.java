package Class23;

public class Registration {

    private String email;
    private String userName;
    private String password;

    // Constructor
    public Registration() {
        this.email = "";
        this.userName = "";
        this.password = "";
    }

    // Method to set email with validation
    public void setEmail(String email) {
        if (email.toLowerCase().endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address. " +
                    "Only Yahoo email addresses are allowed.");
        }
    }

    // Method to set userName with validation
    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username. Username must be at " +
                    "least 7 characters long.");
        }
    }

    // Method to set password with validation
    public void setPassword(String password) {
        if (password.length() > 6 && password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Password must be at " +
                    "least 7 characters long and contain the username.");
        }
    }

    // Method to display user details
    public void displayUserDetails() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }

}

//Create Registration Class in which you would have variable as email,
// userName and
// password that have an access scope only
// within it is own class. After creating an object ot the class user
// should be able
// to call methods and in each method
// seperately pass values to see users email, username and passsword.
//Requirements:
//A. Valid email consider to be only yahoo
//b. Valid userName and password cannot be empthy and
// should be of lenght larger than 6 characters.
// Also valid password contain userName.

/*public Registration(String email, String userName, String password){
        setEmail(email);
        setUserName(userName);
        setPassword(password);
    */