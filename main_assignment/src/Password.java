

// Driver Class
public class Password extends  Login{


    public  String isValid(String password) {


        if (!((password.length() >= 5)
                && (password.length() <= 15))) {
            return "Password length should be between 5 to 15 characters";

        }


        if (password.contains(" ")) {
            return "INVALID";
        }
        if (true) {
            int count = 0;


            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return "Password should contain at least one digit(0-9)";
            }
        }


        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return "Password should contain at least one special character";
        }

        if (true) {
            int count = 0;


            for (int i = 65; i <= 90; i++) {


                char c = (char) i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return "Password should contain at least one uppercase letter(A-Z)";
            }

            if (true) {
                int c1 = 0;


                for (int i = 90; i <= 122; i++) {


                    char c = (char) i;
                    String str1 = Character.toString(c);

                    if (password.contains(str1)) {
                        c1 = 1;
                    }
                }
                if (c1 == 0) {
                    return "Password should contain at least one lowercase letter(a-z)";
                }
            }



        }

        return "VALID";
    }


}