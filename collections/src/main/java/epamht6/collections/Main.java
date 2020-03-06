package epamht6.collections;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class Main {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		MyCollection<Integer> list = new MyCollection<Integer>();
		boolean n = true;
        Scanner sc =  new Scanner(System.in);
        while(n) {
        	try {
	        	System.out.println("Select a choice (1-4)");
	        	System.out.println("1. Add an element to the list");
	        	System.out.println("2. Remove an element from the list");
	        	System.out.println("3. Show the size Of List");
	        	System.out.println("4. Access an element with an index");
	        	System.out.println("5. Print the list");
	        	int c = sc.nextInt();
	        	switch(c) {
	        		case 1 : 
	        			System.out.println("Enter the number to add ");
	        			list.addElement(sc.nextInt());
	        			System.out.println("Do you want to continue?");
	        			if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
	        				n = true;
	        				break;
	        			} else {
	        				System.out.println("Thank you!");
	        				n = false;
	        				break;
	        			}
		        	case 2 : 
		        		System.out.println("Enter number to delete from the list");
		        		System.out.println("The list is as follows"+list);
		        		list.remove(sc.nextInt());
		        		System.out.println("Element deleted...do you want to continue?");
		        	if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
		        		System.out.println("Thank you!");
		        		n = true;
		        		break;
		        	} else {
		        		n = false;
		        		break;
		        	}
		        	case 3 : 
		        		System.out.println("The size of list is " +list.size());
			        	System.out.println("Do you want to continue?");
			        	if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
			        		n = true;
			        		break;
			        	} else {
			        		System.out.println("Thank you!");
			        		n = false;
			        		break;
			        	}	
		        	case 4 :
		        		System.out.println("Enter index (index of first element is 0) : ");
		        		System.out.println("The element is "+list.getElement(sc.nextInt()));
		        		System.out.println("Do you want to continue?");
		        	if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
		        		n = true;
		        		break;
		        	} else {
		        		System.out.println("Thank you!");
		        		n = false;
		        		break;
		        	}
		        	case 5 : System.out.println("The elements in the list are:---  " +list);
			        		 System.out.println("Do you want to continue?");
			        		 if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
			        			 n = true;
			        			 break;
			        		 } else {
			        			 System.out.println("Thank you!");
			        			 n = false;
			        			 break;
			        				}
		        		}
		    } catch(Exception e) {
		    		System.out.println("Enter an integer between 1-4!!");
		    		System.out.println("**************************************************");
		    	}
        }
		
			}
	
	}
