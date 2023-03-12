class Add {
  int addition(int i,int j) {
	  return i+j;
  }
}
class Sub extends Add{
	int Subtraction(int i,int j) {
		return i-j;
	}
}
class Mul extends Sub{
	int Multiplication(int i,int j) {
		return i*j;
		
	}
	
}

public class MultiLevel {
	public static void main(String []args) {
		Mul m=new Mul();
		System.out.println(m.addition(2,3));
		System.out.println(m.Subtraction(4, 3));
		System.out.println(m.Multiplication(4, 5));
		
	}
}
