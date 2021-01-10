
public class Triangle3 {

	public static void main(String[] args) {
		Triangle3 obj=new Triangle3();

	}
	Triangle3()
	{
		int a=3,b=4,c=5;
		double area,perimeter,s;
		perimeter=a+b+c;
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Perimeter of the triangle=" + (perimeter));
		System.out.println("Area of the triangle=" + (area));
		
	}
}
