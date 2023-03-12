class Animal {
	void display() {
			 System.out.println("Iam an animal");
		 }
		}
class Dog extends Animal{
			void show() {
				System.out.println("Iam a dog");
			}
	}
	

public class SingleInheritance {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
		d.show();
	}

}
