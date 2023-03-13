package serviceImplementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import bean.Student;
import service.StudentService;

public class StudentImplementation implements StudentService{
	Scanner sc=new Scanner(System.in);

	ArrayList<Student>list=new ArrayList<Student>();
	 public StudentImplementation()
	 {
		Student s1=new Student(1001,"Gauri","Vikas","Dhumal","Khunte","Female",21,"Computer");
		list.add(s1);
	 }

	@Override
	public void AddStudentRecords() throws NumberFormatException, IOException {
		
		System.out.println("Enter the student_id:");
		int studid=sc.nextInt();
		
		System.out.println("Enter the first name of the student:");
		String studfirstname=sc.next();
		
		System.out.println("Enter the middle name of the student:");
		String studmiddlename=sc.next();
		
		System.out.println("Enter the last name of the student:");
		String studlastname=sc.next();
		
		System.out.println("Enter the address of the student:");
		String studaddress=sc.next();
		
		System.out.println("Enter the gender of the student:");
		String studgender=sc.next();
		
		System.out.println("Enter the age of the student:");
		int studage=sc.nextInt();
		
		System.out.println("Enter the stream of the student:");
		String studstream=sc.next();
		
		Student s2=new Student(studid,studfirstname,studmiddlename,studlastname,studaddress,studgender,studage,studstream);
		list.add(s2);
	}

	@Override
	public void UpdateStudentRecords() throws NumberFormatException, IOException {
		System.out.println("Enter  id:");
		int id=sc.nextInt();
	    int flag=0,index = 0;
	    Student s=null;
	    for(Student e:list)
	    {
	    	if(e.getStudent_id()==id)
	    	{
	    		flag=1;
	    		System.out.println(index);
	    		index=list.indexOf(e);
	    		s=e;
	    		System.out.println(s);
	    		break;
	    	}
	    }
	    
	    if(flag==1)
	    {
	    	System.out.println("Enter the first name of the student:");
			String studfirstname=sc.next();
			
			System.out.println("Enter the middle name of the student:");
			String studmiddlename=sc.next();
			
			System.out.println("Enter the last name of the student:");
			String studlastname=sc.next();
			
			System.out.println("Enter the address of the student:");
			String studaddress=sc.next();
			
			System.out.println("Enter the gender of the student:");
			String studgender=sc.next();
			
			System.out.println("Enter the age of the student:");
			int studage=sc.nextInt();
			
			System.out.println("Enter the stream of the student:");
			String studstream=sc.next();
			  
			s.setStudent_FirstName(studfirstname);
			s.setStudent_MiddleName(studmiddlename);
			s.setStudent_LastName(studlastname);
			s.setAddress(studaddress);
			s.setGender(studgender);
			s.setAge(studage);
			s.setStream(studstream);
			list.set(index,s);
			System.out.println("=========================================================");

			System.out.println("Student record updated successfully!!");
	    }
	    else
	    {
	    	System.out.println("Id does not exist!!");
	    }
		System.out.println("===============================================================");

		
	}

	@Override
	public void DeleteStudentRecords() throws NumberFormatException, IOException {
		System.out.println("Enter student id :");
		int id=sc.nextInt();
		int index=0,flag=0;
		Student s=null;
		
		for(Student e:list)
		{
			if(id==e.getStudent_id())
			{
				flag=1;
				index=list.indexOf(e);
				s=e;
				System.out.println(index);
				break;
			}
		}
		System.out.println("=========================================================");

		if(flag==0)
		{
			System.out.println("Student Id does not exist!!");
		}
		else
		{
			list.remove(s);
			System.out.println("Student record deleted successfully");
		
	}
	}

	@Override
	public void ShowStudentRecords() throws NumberFormatException, IOException {
		if(list.size()==0)
		{
			System.out.println("No record found!!");
		}
		
		
		for(Student s1:list)
		{
	System.out.println(s1);

	}
		
	}
	

}
