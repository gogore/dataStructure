package algospot;

public class PasswordValidation {
    public static Boolean strongPassword(String password) {
        boolean passFlag = true;
        passFlag = password != null;
        if (passFlag) {
            passFlag = password.length() > 11;
        }
        if (passFlag) {
            String[] include = new String[3];
            include[0] = "\\D";
            include[1] = "[^A-Z]";
            include[2] = "[^a-z]";
            for (int i = 0; i < include.length; i++) {
                if (password.replaceAll(include[i], "").length() < 1) {
                    passFlag = false;
                    break;
                }
            }
            String[] exclude = new String[1];
            exclude[0] = "123";
            for (int i = 0; i < exclude.length; i++) {
                if (password.replaceAll(exclude[i], "").length() != password.length()) {
                    passFlag = false;
                    break;
                }
            }
        }

        return passFlag;
    }

    public static void main(String[] args) {
        System.out.println(strongPassword("Strong1Password")); // Strong password
        System.out.println(strongPassword("strong1password")); // Weak password
    }
}
