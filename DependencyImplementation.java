package rivaltest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DependencyImplementation implements  DependencyProgram {
/* To store dependency mapping */		
	 HashMap hm = new HashMap();
	 
	 
/* To store set of installed components */	  
	 HashSet hs	= new HashSet();

public void depend(String keys, List<String> values) {
	/
	
}


public void install(String program) {
	
	
}

public void remove(String program) {
	
	
}


public void list() {
	
}

public void read()
{
		// scanner to read input from the keyboard
		Scanner sc = new Scanner(System.in);
	
			System.out.println("input program");

			String input = sc.nextLine();
			while (!input.equals(String.valueOf(InputComman.END))) {
				String[] arr = input.split(" ");
				String command = arr[0];
				if (command.equals(String.valueOf(InputComman.LIST))) {
					list();
					System.out.println(command);
}
			}
}}
