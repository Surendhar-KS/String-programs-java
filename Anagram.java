import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		char arr[]=a.toCharArray();
		
		char arr2[]=b.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr,arr2)){
		    System.out.print("Anagram");
		}
		else{
		    System.out.print("Not a Anagram");
		}
		

	}
}

=======================================
Sample Input
surendhar
urendhars
Your Output
Anagram
=====================================


	import java.util.*;

public class Solution{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine().toLowerCase();
        String s2=sc.nextLine().toLowerCase();

        if(s1.length()!=s2.length()){
            System.out.print("Not Anagram");
            return;
        }

        int[] count=new int[26];

        for(int i=0;i<s1.length();i++){

            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){

            if(count[i]!=0){
                System.out.print("Not Anagram");
                return;
            }
        }

        System.out.print("Anagram");
    }
}
