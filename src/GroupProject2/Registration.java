package GroupProject2;

public class Registration {
    private String emailAddress;
    private String userName;
    private String password;

    Registration(String emailAddress, String userName, String password) {
        setEmailAddress(emailAddress);
        setUserName(userName);
        setPassword(password);
    }

    public void setEmailAddress(String emailAddress) {

        if (emailAddress.contains("yahoo")) {
            this.emailAddress = emailAddress;
        }
        else {
            this.emailAddress = "Not a valid email";
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()) {
            this.userName = "username is empty please input a username";
        }

        else if (userName.length() < 6) {
            this.userName = "username is not more than 6 characters please input a large userName";
        }

        else {
            this.userName = userName;
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        if (password.isEmpty()) {
            this.password = "Password is empty please input a password";
        }

        else if (password.length() < 6) {
            this.password = "Password is not more than 6 characters please input a password that contains more than 6 characters";
        }

        else if (password.contains(userName)) {
            this.password = "Password cannot include Username please create a password without the username";
        }

        else {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }

    public void printInfo() {
        System.out.println(getEmailAddress());
        System.out.println(getUserName());
        System.out.println(getPassword());
    }

    public static void main(String[] args) {
        Registration account = new Registration("spease3685@yahoo.com", "SpeaseGamer", "GamesRuleOurHearts$");

        account.printInfo();


        System.out.println();

        account.setEmailAddress("spease3643@yahoo.com");
        account.setUserName("");
        account.setPassword("Naruto9632");

        account.printInfo();
    }


}
