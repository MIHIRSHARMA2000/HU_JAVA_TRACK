import javax.sound.midi.Soundbank;
import java.sql.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Login{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set= new HashSet<String>();
        String jdbcURL = "jdbc:mysql://localhost:3306/login";
        String username = "root";
        String password = "root";
        int option = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connection Established Successfully");
            Statement st = connection.createStatement();
            int b = 0;
            while (b != -1) {
                System.out.println("******Welcome to User Database******* \n" +
                        "1. Login \n" +
                        "2. Registration\n");
                option = sc.nextInt();
                if (option == 1) {           // Login input
                    System.out.println("--Welcome To Login Page--");
                    System.out.println("Enter Username: ");                 // Username
                    String uname = sc.next();
                    System.out.println("Enter Password: ");                  // Password Input
                    String pswd = sc.next();
                    if (uname != null && pswd != null) {
                        String sql = "SELECT * from login WHERE username='" + uname + "' and password='"+pswd+"'"; // running queries
                        Statement stmt = connection.createStatement();   //
                        ResultSet rset = stmt.executeQuery(sql);

                        rset.next();
                        uname = rset.getString("username");
                        pswd = rset.getString("password");
                        System.out.println("Login Successful");
                        AccessRecord em = new AccessRecord();
                        em.employee_info();  // calling function employee_info from class AccessRecord
                    }


                } else if (option == 2) {              // Registration
                    System.out.println("--Registration--");
                    System.out.println("Enter Username: ");
                    String runame = sc.next();
                    set.add(runame);
                    System.out.println("Enter Password: ");
                    String rpswd = sc.next();
                    Password pv = new Password();
                    String validation = pv.isValid(rpswd);  // checking password is valid or not by calling isValid function from Password class
                    if (validation != "VALID") {
                        while(validation!="VALID") {
                            System.out.println(validation);
                            System.out.println("Enter the Password again");
                            rpswd = sc.next();
                            validation= pv.isValid(rpswd);
                        }
                    }
                    System.out.println("Re -Enter Password Again: ");
                    String repswd = sc.next();
                    st.executeUpdate("insert into login value('" + runame + "','" + rpswd + "')");
                    System.out.println("Registration Successful");
                }
                System.out.println("Press 1 for continue or Press -1 for exit");
                int inputu = sc.nextInt();
                b = inputu;
            }
        }
        catch(SQLIntegrityConstraintViolationException e) {
            if (option==1) {
                System.out.println("Login Success");
            } else {

                System.out.println("Already Registered");         // if user name already present displaying message user Already registered
                System.out.println("Enter Different User Name");
            }
        }


        catch (SQLException e){
            System.out.println("Invalid UserName Or Password");
        }
        catch (ClassNotFoundException e){

            e.printStackTrace();
        }

    }
}