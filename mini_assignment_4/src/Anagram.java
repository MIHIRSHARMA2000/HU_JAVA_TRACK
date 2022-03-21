

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {  // using hashmap
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char arr1[]= str1.toCharArray();
        char arr2[] = str2.toCharArray();
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0; i<arr1.length; i++)
        {
            if(mp.get(arr1[i])==null)
            {
                mp.put(arr1[i],1);
            }
            else{
                Integer frequency = mp.get(arr1[i]);
                mp.put(arr1[i],frequency+1);
            }
        }
        for(int i=0; i<arr2.length; i++)
        {
            if(mp.containsKey(arr2[i]))
            {

                mp.put(arr2[i],mp.get(arr2[i])-1);

            }
        }
        Boolean ans=true;
        Set<Character> st= mp.keySet();
        for(Character c: st)
        {
            if(mp.get(c)!=0)
            {
                ans= false;
                break;
            }
        }
        System.out.println(ans);

    }
}