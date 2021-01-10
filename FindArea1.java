
public class FindArea1 {
	public static void main(String[] args) {
			Shapes Findarea=new Shapes();
			Findarea.Area(4,5);
			Findarea.Area(4);
			}
		}
class Shapes
{
	void Area(int l,int b)
	{
		System.out.println("Area of the rectangle=" + (l*b));
	}
	void Area(float r)
	{
		System.out.println("Area of the circle=" + (3.14*r*r)); 
	}
}

