package ch6and7Assignment;

import java.util.Scanner;

/**
 * StringMethod
 * Create my own String method that replace the built in ones from Java.
 * @author 349469213 Steven Wang
 * date: November 29, 2018
 */
public class StringMethod {

	/**
	 * @param word2 
	 * @param args
	 */
	public static int length(String word){
		String temp = word +" ";
		int c=0;
		while (temp.charAt(c)!=' ')
			c++;
		
        return c;
		}
	
	public static boolean Empty(String word){
		word = word + ' ';
		int i = 0;
		
		if (word.charAt(i) == ' ')
		return true;
		else 
		return false;
		}
	
	public static void Substring(String word, int start, int end){
		word = word + ' ';
		for (int x = start; x != end; x++) {

			System.out.print(word.charAt(x));
		}
	}
	public static String ReplaceFirst(String str, String str1, String str2) {
		String front = "";
		String back = "";
		
		return(str);
	}
	
	public static int indexOf(String str, String str1){
		int a = 0; 
		if (length(str1) > length(str)){
			return -1;
		}
		for (int i = 0; i < length(str); i++) {
			a = 0;                        
			for(int j = 0; j < length(str1); j++) {
				if(str.charAt(i+j) == str1.charAt(j)) {
					a++;
				} 
				if(a == length(str1)) return i;
			}
		 }			
			return -1;
		
	}
	
	public static String stringReplaceAll(String str1, String str2){
		
		return null;
	}
	
	
	public static String stringToLowerCase(String str){
		String result = "";
		for(int i = 0;i<length(str);i++)
		{
			char tmp = str.charAt(i);
			if(tmp>='A'&& tmp<='Z')
			{
				tmp = (char)(tmp+32);
				result = result+tmp;
			}else 
			{
				result  = result + tmp;
			}
				
		}
		return result;
	}
	
	public static String stringToUpperCase(String str){
		String result = "";
		for(int i = 0;i<length(str);i++)
		{
			char tmp = str.charAt(i);
			if(tmp>='a'&& tmp<='z')
			{
				tmp = (char)(tmp-32);
				result = result+tmp;
			}else 
			{
				result  = result + tmp;
			}
				
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int length;
        String word;
        boolean empty;
        String stringLowCase;
        String stringUpperCase;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        word = input.nextLine();
	
        length = length(word);
        System.out.println("Length is: " + length);
        
        empty = Empty(word);
        System.out.println("Is it empty: " + empty);
        
        stringLowCase = stringToLowerCase(word);
        System.out.println("String To Low Case: " + stringLowCase);
        
        stringUpperCase = stringToUpperCase(word);
        System.out.println("String To Upper Case: " + stringUpperCase);
        
        int start, end;
        
        System.out.print("Enter the start number:  ");
        start = input.nextInt();
        System.out.print("Enter the end number:  ");
        end = input.nextInt();
        
        Substring(word, start, end);
        System.out.print("\n");
        
        String replacefirst;
        
        System.out.println("Enter the letter you want to replace:  ");
        String str = input.nextLine();
        System.out.print("Enter the new letter:  ");
        String str2 = input.nextLine();
	}
}
