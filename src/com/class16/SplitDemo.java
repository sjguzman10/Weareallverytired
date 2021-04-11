package com.class16;

public class SplitDemo {

	public static void main(String[] args) {
		// How to split a string
		
		String var1="Today is Wednesday";
		
		System.out.println(var1.length()); //gives me numbers of characters in present NOT the verse
		
		//NEED TO SPLIT INTO ARRAYS
		
		//number of spaces plus 1 will give me the number of words 
		String [] strArr=var1.split(" "); //turns words into arrays
			for (String word:strArr) {
				System.out.println(word);
			}
			
		String var2="Syntax is best. Batch 9 is great.";
		String [] strArr2=var2.split("[.]"); //we specify regular expression by using [] not just "."
		
		//System.out.println(strArr2.length);
		
		for (int i=0; i<strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}
		//Method Chaining - writing multiple on one time
		String var3="       SYNTAX       ";
		System.out.println(var3.trim().toLowerCase()); //trim will remove spaces AND there the string left will be to lower case
		
		String var4="hi what are you doing";
		System.out.println(convert(var4));
	} //FROM INTERNET 
	static String convert(String str)
    {
 
        // Create a char array of given String
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
 
            // If first character of a word is found
            if (i == 0 && ch[i] != ' ' ||
                ch[i] != ' ' && ch[i - 1] == ' ') {
 
                // If it is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') {
 
                    // Convert into Upper-case
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
 
            // If apart from first character
            // Any one is in Upper-case
            else if (ch[i] >= 'A' && ch[i] <= 'Z')
 
                // Convert into Lower-Case
                ch[i] = (char)(ch[i] + 'a' - 'A');           
        }
 
        // Convert the char array to equivalent String
        String st = new String(ch);
        return st;
    }
}
