import java.util.HashMap;
import java.util.Scanner;

public class shuffle {
    public static void main(String[] args) {
        HashMap<Character,Integer> mp= new HashMap<Character,Integer>();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3= sc.nextLine();
        Integer novalid=0;
        int arr1[]= new int[str1.length()];
        int arr2[]= new int[str2.length()];
        for(int i=0; i<str1.length(); i++)
        {
            arr1[i]=-1;
        }
        for(int i=0; i<str2.length(); i++)
        {
            arr1[i]=-1;
        }

        if(str1.length()+ str2.length()!=str3.length())
        {
            System.out.println("Invalid");
        }
        else{
            for(int i=0; i<str3.length(); i++)
            {
                mp.put(str3.charAt(i),i);
            }
            for(int i=0; i<str1.length(); i++)
            {
                arr1[i]=mp.get(str1.charAt(i));
            }
            for(int i=0; i<str2.length(); i++)
            {
                arr2[i]=mp.get(str2.charAt(i));
            }

            for(int i=0; i<str1.length(); i++)
            {
                if(arr1[i]>arr1[i+1] || arr1[i]==-1)
                {
                    novalid=1;
                }
            }
            if(novalid==0)
            {
                for(int i=0; i<str2.length(); i++)
                {
                    if(arr2[i]>arr2[i+1] || arr2[i]==-1)
                    {
                        novalid=1;
                    }
                }
            }



        }
        if(novalid==1)
        {
            System.out.println("INVALID");
        }
        else{
            System.out.println("VALID");
        }
    }
}