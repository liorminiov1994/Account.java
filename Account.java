import java.util.Scanner;

public class Account {
    String user_name;
    String password;
    Date creation;
    Date expire;

    public Account(String user_name, String password, Date creation, Date expire) {
        this.user_name = user_name;
        this.creation = creation;
        this.expire = expire;
        Scanner scanner = new Scanner(System.in);
        this.password = password;
        while(!isStrongPassword(this.password)) {
            System.out.println("Enter Strong Password (atleast 6 digits  one char , one alphabetic digit");
            //scanner.nextLine();
            this.password = scanner.nextLine();
        }
    }
    // return true if strong password else return false
    private boolean isStrongPassword(String password) {
        if(password.length() < 6)
            return false;
        char[] pass  = password.toCharArray();
        int dig_count = 0 , char_count = 0;
       for(int i = 0; i < password.length(); i++) {
            if (Character.isDigit(pass[i]))
                dig_count++;
            if (Character.isAlphabetic(pass[i]))
                char_count++;
       }
        return (dig_count > 0 && char_count > 0);
    }


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
