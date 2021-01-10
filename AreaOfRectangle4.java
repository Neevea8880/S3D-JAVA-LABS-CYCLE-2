import java.util.Scanner;
public class AreaOfRectangle4 {

	public static void main(String[] args) {
		System.out.println("Enter the length of the rectangle");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int b=sc.nextInt();
		Area obj= new Area(l,b);
		System.out.println("Area of the rectangle=" + (obj.ReturnArea()));

	}

}
class Area
{
	int area;
	Area(int l,int b)
	{
		area=l*b;
	}
	int ReturnArea()
	{
		return area;
	}
}
