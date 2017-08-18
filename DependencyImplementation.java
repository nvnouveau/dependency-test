package rivaltest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DependencyImplementation implements  DependencyProgram {
/* To store dependency mapping */		
	 HashMap hm = new HashMap();
	 
	 
/* To store set of installed components */	  
	 HashSet hs	= new HashSet();


@Override
public void depend(String keys, List<String> values) {
	// TODO Auto-generated method stub
	
}


@Override
public void install(String program) {
	// TODO Auto-generated method stub
	
}


@Override
public void remove(String program) {
	// TODO Auto-generated method stub
	
}


@Override
public void list() {
	// TODO Auto-generated method stub
	
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
					
					
					ArrayList<String> ProgramList = new ArrayList<>(Arrays.asList(arr));
					 ProgramList.remove(command);
					if (command.equals(String.valueOf(InputComman.DEPEND))) {
						depend( ProgramList.get(0),  ProgramList);
					}
					if (command.equals(String.valueOf(InputComman.INSTALL))) {
						install( ProgramList.get(0));
					}
					if (command.equals(String.valueOf(InputComman.REMOVE))) {
						remove( ProgramList.get(0));
					}
					

}
			}
}}
