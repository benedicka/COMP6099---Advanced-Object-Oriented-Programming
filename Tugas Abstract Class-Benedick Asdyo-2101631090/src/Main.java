import java.util.Scanner;

abstract class Shape{  
	double h,w;
	Shape(double height, double width)
	{
	     this.h = height;
	     this.w = width;
	}
	public double getHeight() 
	{
		return h;
	}
	 public double getWidth() 
	{
       return w;
	} 

	abstract double getArea();  
}  
class Rectangle extends Shape
{
    Rectangle(double height, double width) {
		super(height, width);
	}

    public double getArea()
    {
        return getHeight() * getWidth();
    }
}

class Triangle extends Shape
{
    Triangle(double height, double width) {
		super(height, width);
	}

    public double getArea()
    {
        return (getHeight() * getWidth())/2;
    }
}
class Circle extends Shape
{
    Circle(double height, double width) {
		super(height, width);
	}

    public double getArea()
    {
        return getHeight() * getHeight()*Math.acos(-1.0);
    }
}
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		int menu=0;
		do
		{
			System.out.println("Calculating shape");
			System.out.println("====================");
			System.out.println("1. Circle");
			System.out.println("2. Rectangle");
			System.out.println("3. Triangle");
			System.out.println("4. Exit");
			System.out.print("Your Choice [1..4]: ");
			menu = scan.nextInt();
			switch(menu)
			{
				case 1:
					double rad;
					System.out.print("Radius : ");
					rad = scan.nextDouble();
					Circle c = new Circle(rad,rad);
					System.out.println("Circle Area : "+c.getArea());
					break;
				case 2:
					double l,w;
					System.out.print("length : ");
					l = scan.nextDouble();
					System.out.print("width : ");
					w = scan.nextDouble();
					Rectangle r = new Rectangle(l,w);
					System.out.println("Rectangle Area : "+r.getArea());
					break;
				case 3:
					double b,h;
					System.out.print("Base : ");
					b = scan.nextDouble();
					System.out.print("Height : ");
					h = scan.nextDouble();
					Triangle t = new Triangle(b,h);
					System.out.println("Triangle Area : "+t.getArea());
					break;
				case 4:
					
					break;
			};
		}while(menu!=4);
	}

	public static void main(String[] args) {
		new Main();

	}

}
