import java.util.Scanner;
public class Queue2 {

	public static void main(String[] args) {
		int size;
		new Queue();
		System.out.println("\n\nEnter the size of the queue");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		new Queue(size);

	}

}
class Queue
{
	 int size,front=-1,rear=-1,element;
	 int[] array= new int[20];
	
	
	Queue()
	{
		System.out.println("   ------QUEUE OPERATIONS------");
	}
	Queue(int size)
	{
		int c;
		do
		{
			System.out.println("\n\n\tMENU\n\n");
			System.out.println("1.INSERT\n2.DELETE\n3.DISPLAY\n4.EXIT");
			System.out.println("Enter the choice");
			Scanner sc= new Scanner(System.in);
			c=sc.nextInt();
			switch (c)
			{
				case 1:
					Enqueue(size);
					break;
				case 2:
					Dequeue(size);
					break;
				case 3:
					Display(rear);
					break;
				case 4:
					System.exit(0);
				default :
					break;
					
			}
		} while(c<5);
	}
	void Enqueue(int size)
	{
		if(rear==(size-1))
			System.out.println("\n\t\tOverflow");
			else
			{
				System.out.println("\n\tEnter the element: ");
				Scanner sc= new Scanner(System.in);
				element=sc.nextInt();
				if(front==-1&&rear==-1)
					front=0;
				rear++;
				array[rear]=element;
			}
	}
	void Dequeue(int size)
	{
		int k;
		if(front==-1)
			System.out.println("\n\t\tUnderflow\n");
		else
		{
			k=array[front];
			System.out.println("\n\t\tDeleted element is "+ (k));
		}
		if(front==rear)
			front=rear=-1;
		else
			front++;
	}
	void Display(int rear)
	{
		int i;
		if(front==-1&&rear==-1)
			System.out.println("\n\t\tUnderflow\n");
			else
			{
				System.out.println("\n\t\tQueue elements are\n ");
			for(i=front;i<=rear;i++)
			{
				System.out.println(array[i]);
			}
	}
	}
}
