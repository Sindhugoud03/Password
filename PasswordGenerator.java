import java.util.*;
public class PasswordGenerator {
    
    public static void main(String[] args) {
        String Upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String SpecialChars = "<>?/:=+-";
        String Combination = Upper + Lower + num + SpecialChars;
        int len = 12;

        char[] password = new char[len];
        Random r = new Random();

        for (int i = 0; i < len; i++) {
            password[i] = Combination.charAt(r.nextInt(Combination.length()));
        }

        System.out.println("Generated password is: " + new String(password));
    }
}

