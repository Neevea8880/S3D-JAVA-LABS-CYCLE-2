
public class PrintClass5 {

	public static void main(String[] args) {
		
		//1.calling method of parent class by object of parent class
		Parent obj1 = new Parent();
		obj1.print1();
		
		//2.calling method of child class by object of child class
		Child obj2 = new Child();
		obj2.print2();
		
		//3.calling method of parent class by object of child class
		obj1.print1();

	}

}
class Parent
{
	void print1()
	{
	System.out.println("This is parent class");
	}
}
class Child extends Parent 
{
	void print2()
	{
	System.out.println("This is child class");
	}
}
