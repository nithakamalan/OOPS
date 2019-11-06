package oops;
import java.util.Scanner;
public class Exercise {
static int id=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		    String name[]=new String[25];
		    String email[]=new String[25];
		 	String op1;
		 	String op2;
		    int i=1;
		 	do
		 	{
		    System.out.println("Registration");
		    System.out.println("Enter your name");
		    name[i]=s.next();
		    System.out.println("Enter your address");
		    String addr=s.next();
		    System.out.println("Contact Number");
		    String num=s.next();
		    System.out.println("E-Mail ID");
		    email[i]=s.next();
		    System.out.println("Enter proof type");
		    String proof=s.next();
		    System.out.println("Enter proof id");
		    String proofid=s.next();
		    System.out.println("Thank you for registering. Your id is"+id);
		    Details dd=new Details(name,addr,num,email,proof,proofid);
			System.out.println("Do you want to book a room(y/n)?");
	        id++;
			op1=s.next();
			
			if(op1.contentEquals("yes")==true)
			{
				dd.booking();
			}
			i++;
			System.out.println("Do you want to continue registration(yes/no)");
			op2=s.next();
		 	}
		 	while(op2.equals("yes")==true);
		 	System.out.println("View All Bookings");
		 	System.out.println("Enter the Start date:");
		 	int date1=s.nextInt();
		 	System.out.println("Enter the End date:");
		 	int date2=s.nextInt();
		 	System.out.println("The bookings from "+date1+" to  "+date2);
		 	System.out.println("Customer Id  CustomerName  Email");
		 	for(int k=1;k<i;k++)
		 	{
		 		System.out.println(k+"              "+name[k]+"            "+email[k]);
		 	}
		 				
	}
}

class Details{
	int i;
	 Scanner s=new Scanner(System.in);
	 String name[]=new String[25];
	    String email[]=new String[25];
	    String addr,num,proof,proofid;
	 public Details(String[] name, String addr, String num, String[] email, String proof, String proofid) {
		// TODO Auto-generated constructor stub
		 this.addr=addr;
		 this.num=num;
		 this.proof=proof;
		 this.proofid=proofid;
	}

	 void booking() {
			// TODO Auto-generated method stub
		 
		 String ac,pr;
		  String cot;
		  String cable;
		  String wifi;
		  String laundry;
		  Scanner s = new Scanner(System.in);
		  int total,b=0,c,d,e,f,i=1;
		  System.out.println("Booking");
		  System.out.println("Please choose the services required.");
		  System.out.println("AC/non-AC(AC/nAC)");
		  ac=s.next();
		  if(ac.equals("AC")==true)
		  {
			  b=1000;
		  }
		  else
		  {
			  b=750;
		  }
		  System.out.println("Cot(Single/Double)");
		  cot=s.next();
		  if(cot.equals("Single")==true)
		  {
			  c=0;
		  }
		  else
		  {
			  c=350;
		  }
		  System.out.println("With cable connection/without cable connection(C/nC)");
		  cable=s.next();
		  if(cable.equals("C")==true)
		  {
			  d=50;
		  }
		  else
		  {
			  d=0;
		  }
		  System.out.println("Wi-Fi needed or not(W/nW)");
		  wifi=s.next();
		  if(wifi.equals("W")==true)
		  {
			  e=200;
		  }
		  else
		  {
			  e=0;
		   
		  System.out.println("Laundry service needed or not(L/nL)");
		  laundry=s.next();
		  if(laundry.equals("L")==true)
		  {
			  f=100;
		  }
		  else
		  {
			  f=0;
		  }
		  total=b+c+d+e+f;
		  System.out.println("The total charge is Rs." +total);
		  System.out.println("The services chosen are");
		  if(b==1000)
		  {
			  System.out.println("AC"); 
		  }
		  else
		  {
			  System.out.println("non-AC");
		  }
		  if(c==0)
		  {
			  System.out.println("Single cot");
		  }
		  else
		  {
			  System.out.println("double cot");
		  } 
		 if(d!=50)
		  {
			  System.out.println("Cable connection enabled");
		  }
		  else
		  {
			  System.out.println("Cable conection not enabled");
		  }
		 
		 if(e!=200)
		  {
			  System.out.println("Wifi enabled");
			  
		  }
		  else
		  {
			  System.out.println("Wifi not enabled");
		  }
		 if(f!=100)
		  {
			  System.out.println("with laundary services");
			  
			  
		  }
		  else
		  {
			  System.out.println("with laundary services");
		  }
		 System.out.println("Do you want to proceed");
		 pr=s.next();
		 while(pr.equals("no"));
		 
		 if(pr.equals("yes")==true)
		 {
			 
			 System.out.println("Thank you your room number is "+i);
			 i++;
		 }
			
		  }
	}
}


	
	

