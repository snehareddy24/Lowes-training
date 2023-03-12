public class ControlStatements {
	//for-loop to check prime number//
	boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false; 
			}
		}
		
		return true;
	}
public static void main(String args[]) {
	//if-else to check which number is greater//
	int x=100,y=200;
	if(x>y) {
		System.out.println("x is greater");
	}
	else if(x<y) {
		System.out.println("y is greater");
	}
	else {
		System.out.println("Equal");
	}
	//while-loop to print even number upto 10//
	int i=2;
	while(i<=10) {
		System.out.println(i);
		i+=2;
	}
	//do while to print odd numbers upto 10//
	int j=1;
	do {
		System.out.println(j);
		j+=2;
	}
	while(j<=10);
	//switch 
	int score=0;
	switch(score) {
	case 0:
		System.out.println("Fresher");
		break;
	
	case 1:
		System.out.println("Experienced");
		break;
	default:
		System.out.println("student");
	}
	ControlStatements c=new ControlStatements();
	System.out.println(c.isPrime(10));
	
	
}
}

