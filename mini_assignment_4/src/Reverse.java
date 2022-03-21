import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String j;
        Integer n = sc.nextInt();
        ArrayList l= new ArrayList();
        for(int i=0; i<n+1; i++)
        {
            j= sc.nextLine();
            l.add(j);
        }
        Collections.reverse(l);

        System.out.println(l);






    }
}