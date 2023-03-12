interface In1 {
  int add(int i,int j);
}
 interface In2 {
	 int sub(int i,int j);
	}
class A implements In1,In2{
	int mul(int i,int j) {
		return i*j;
	}
	public int add(int i,int j) {
		return i+j;
	}
	public int sub(int i,int j) {
		return i-j;
	}
}


public class MultipleInheritance {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.mul(2, 3));
		System.out.println(a.add(2, 3));
		System.out.println(a.sub(6, 2));
	}
}
