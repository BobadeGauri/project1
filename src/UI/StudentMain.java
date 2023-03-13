package UI;

import java.io.IOException;
import java.util.Scanner;

import serviceImplementation.StudentImplementation;

public class StudentMain {

	public static void main(String[] args) throws NumberFormatException, IOException{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("STUDENT MANAGEMENT SYSTEM");
		System.out.println("1.View Student Records");
		System.out.println("2.Add Student Records");
		System.out.println("3.Update Student Records");
		System.out.println("4.Delete Student Records");
		
		System.out.println("Student Management System");
		StudentImplementation s1=new StudentImplementation();
		
		do
	      {
	    	  System.out.println("Enter the choice ");
	    	  int choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		  
	    		  
	    		    s1.ShowStudentRecords();
	    		  break;
	    	  case 2:
	    		  

	    		
	    		 s1.AddStudentRecords();
	    		 break;
	    		 
	    	  case 3:
	    		  

	      		
	     		 s1.UpdateStudentRecords();
	     		 break;
	    	  case 4:
	    		  

	        		
	      		 s1.DeleteStudentRecords();
	      		 break; 	 
	    		  
	    	  }
	    	  System.out.println("do you want to continue");
	    	   s=sc.next();

	       }
		  while(s.equals("yes"));

		}


	}


