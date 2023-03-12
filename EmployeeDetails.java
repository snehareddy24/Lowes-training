
public class EmployeeDetails {
  int hra(int eid,String eName,int basic) {
	  return (12*basic)/100;
  }
  int ta(int eid,String eName,int basic) {
	  return (8*basic)/100;
  }
  int da(int eid,String eName,int basic) {
	  return (9*basic)/100;
  }
  public static void main(String []args) {
	  EmployeeDetails c=new EmployeeDetails();
	  int id=Integer.parseInt(args[0]);
	  String name=args[1];
	  int basic=Integer.parseInt(args[2]);
	  System.out.println("Employee name is "+name);
	  System.out.println(c.hra(id, name, basic));
	  System.out.println(c.ta(id, name, basic));
	  System.out.println(c.da(id, name, basic));
	  int gross=c.hra(id, name, basic)+c.ta(id, name, basic)+c.da(id, name, basic);
	  System.out.println("Gross amount is "+gross);
	  if(gross>=25000) {
		  System.out.println("A");
	  }
	  else if(gross>=10000 && gross<25000) {
		 
			  System.out.println("B");
		  
	  }
	  else {
		  System.out.println("C");
	  }
	  
	  
  }
}
