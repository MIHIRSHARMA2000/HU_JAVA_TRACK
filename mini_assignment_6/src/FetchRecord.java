import java.io.*;
import java.util.Scanner;
public class FetchRecord {
    public static void main(String[] args) throws Exception {
//parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File("C:\\Users\\mihirsharma\\Downloads\\record.csv"));
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner
    }
}