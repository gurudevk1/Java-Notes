package guru.syntax;

import java.util.*;

public class BasicSyntaxNotes {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter Operation 1 Add 2 Remove 3 Promote");
	    int op=myObj.nextInt();
	    myObj.nextLine();
	    System.out.println("Enter Empl Name");
    	String userName = myObj.nextLine();
    	System.out.println(userName);
    	
    	char[] arr = { 'p', 'q', 'r', 's' };
    	String str = String.valueOf(arr);//it returns String format of charArray/Int/Long/boolean/Object
    	char[] arrB = str.toCharArray();
    	
    	//reverse the chars 
    	List<Character> trial1 = new ArrayList<>(); 
    	for (char c:arr) 
    		trial1.add(c); 
    	Collections.reverse(trial1);//used to reverse any List 
    	System.out.println(str);
    	
    	

	}

}
