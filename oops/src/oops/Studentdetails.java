package oops;
import java.util.Scanner;

public class Studentdetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    
	    System.out.println("Enter your name");
	    String name=s.next();
	    System.out.println("Enter your Rollno");
	    String rollno=s.next();
	    System.out.println("Enter the Mark1");
	    int mark1=s.nextInt();
	    System.out.println("Enter the Mark2");
	    int mark2=s.nextInt();
	    System.out.println("Enter the Mark3");
	    int mark3=s.nextInt();
	    Student obj=new Student(name,rollno,mark1,mark2,mark3);
	    obj.Student_details();
	    obj.Student_total();
	    obj.Student_Rank();
	}

}
class Student{
	
	String name;
	  String rollno;
	  int mark1;
	  int mark2;
	  int mark3,tot,avg;
	  
	  public Student(String name, String rollno, int mark1, int mark2, int mark3) {
		// TODO Auto-generated constructor stub
		  
		this.name=name;
		this.rollno=rollno;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		
		  
	}
	  public void Student_details()
	  {
		  System.out.println("Name : "+this.name);
		  System.out.println("Rollno: "+this.rollno);
		  System.out.println("Mark1: "+this.mark1);
		  System.out.println("Mark2: "+this.mark2);
		  System.out.println("Mark3: "+this.mark3);
		  
	  }
	  public void Student_total()
	  {
		  tot=mark1+mark2+mark3;
		  avg=tot/3;
		  System.out.println("Total= "+tot);
		  System.out.println("Average=" +avg);
		  
	  }
	  public void Student_Rank()
	  {
		  if(avg>=90)
			{
			  System.out.println("Rank 1");
			}
		  else if(avg>=70 && avg <=89)
		  {
			  System.out.println("Rank 2");
		  }
		  else if(avg>=60 && avg <=79)
		  {
			  System.out.println("Rank 2");
		  }
		  else if(avg>=50 && avg <=69)
		  {
			  System.out.println("Rank 2");
		  }
		  else
		  {
			  System.out.println("Fail");
		  }
		  
	  }
	  }
	  
	   
