class InvalidPasswordException extends Exception {

    int passwordConditionViolated = 0;

    public InvalidPasswordException(int conditionViolated)
    {
        super("Invalid Password: ");
        passwordConditionViolated = conditionViolated;
    }

    public String printMessage()
    {

        switch (passwordConditionViolated) {


            case 1:
                return ("Password length should be"
                        + " between 8 to 15 characters");


            case 3:
                return ("Password should contain"
                        + " at least one digit(0-9)");


            case 4:
                return ("Password should contain at "
                        + "least one special character");


            case 5:
                return ("Password should contain at"
                        + " least one uppercase letter(A-Z)");


            case 6:
                return ("Password should contain at"
                        + " least one lowercase letter(a-z)");
        }

        return ("");
    }
}

// Driver Class
public class PasswordValidator {


    public static void isValid(String password)
            throws InvalidPasswordException
    {


        if (!((password.length() >= 5)
                && (password.length() <= 10))) {
            throw new InvalidPasswordException(1);
        }


        if (password.contains(" ")) {
            throw new InvalidPasswordException(2);
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
                throw new InvalidPasswordException(3);
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
            throw new InvalidPasswordException(4);
        }

        if (true) {
            int count = 0;


            for (int i = 65; i <= 90; i++) {


                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(5);
            }
        }

        if (true) {
            int count = 0;


            for (int i = 90; i <= 122; i++) {


                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(6);
            }
        }


    }


    public static void main(String[] args)
    {

        String password1 = "Hashedein";

        try {
            System.out.println("Is Password "
                    + password1 + " valid?");
            isValid(password1);
            System.out.println("Valid Password");
        }
        catch (InvalidPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }

        String password2 = "Hashdein@1";
        try {
            System.out.println("\nIs Password "
                    + password2 + " valid?");
            isValid(password2);
            System.out.println("Valid Password");
        }
        catch (InvalidPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
    }
}