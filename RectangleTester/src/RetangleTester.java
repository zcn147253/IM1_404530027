import java.util.Scanner;

    public class RetangleTester {	int X,Y,height,width;
        RetangleTester(int _height, int _width, int _X, int _Y) {
	    this.height = _height;
	    this.width = width;
	    this.X = _X;
	    this.Y = _Y;
    }	
	    int getHeight() {
		    return this.height;
	    }
	    int getWidth() {
		    return this.width;
	    }
	    int getX() {
		    return this.X;
	    }
        int getY() {
		    return this.Y;
	    }

    public String toString() {
	    return "java.Rectangle[" + this.X + this.Y + this.height + this.width + "]";
    }

	

	public static void main(String[] args){
		Scanner newt = new Scanner(System.in);
		System.out.println(newt.toString());
		int X,Y,height,width;
		System.out.println("Rec1");
		System.out.println("please enter X¡G");
		X = newt.nextInt();
		System.out.println("please enter Y¡G");
		Y = newt.nextInt();
		System.out.println("please enter the height¡G");
		height = newt.nextInt();
		System.out.println("please enter the width¡G");
		width = newt.nextInt();
	    
		int area1 = height * width;
		int perimeter1 = height * 2 + width * 2;
		
		System.out.println("X = " + X);
		System.out.println("Y = " + Y);
		System.out.println("area = " + area1);
		System.out.println("perimeter = " + perimeter1);
		System.out.println("\n");
		
		System.out.println("Rec2");
		System.out.println("please enter X¡G");
		X = newt.nextInt();
		System.out.println("please enter Y¡G");
		Y = newt.nextInt();
		System.out.println("please enter the height¡G");
		height = newt.nextInt();
	    System.out.println("please enter the width¡G");
		width = newt.nextInt();
		
		int area2 = height * width;
		int perimeter2 = height * 2 + width * 2;
		System.out.println("X = " + X);
		System.out.println("Y = " + Y);
		System.out.println("area = " + area2);
		System.out.println("perimeter = " + perimeter2);
		
	}

}