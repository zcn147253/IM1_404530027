/*
 * [C]68
 * [TA's advise]
 * 1.�U���@�~�зǮɥ�, ���Z���G�w�g�e��Ѯv��W�F, ���Ʀ�C�}�l�p��.
 * 2.���ϥ�getWidth(),getHeight(),�o���������.
 * */

import java.util.Scanner;

public class RetangleTester {
	int X, Y, height, width;

	// RetangleTester(){this(-1,-1,-1,-1);}//�[�J�o�槹�������l��, �i�H���A���{���󧹾�.
	
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
		//�榡���G���I�]�F��.
		return "java.Rectangle[" + this.X + this.Y + this.height + this.width + "]";
	}

	public static void main(String[] args) {
		Scanner newt = new Scanner(System.in);
		//why you print newt?
		System.out.println(newt.toString());
		
		int X, Y, height, width;
		System.out.println("Rec1");
		System.out.println("please enter X�G");
		X = newt.nextInt();
		System.out.println("please enter Y�G");
		Y = newt.nextInt();
		System.out.println("please enter the height�G");
		height = newt.nextInt();
		System.out.println("please enter the width�G");
		width = newt.nextInt();

		int area1 = height * width;
		int perimeter1 = height * 2 + width * 2;

		System.out.println("X = " + X);
		System.out.println("Y = " + Y);
		System.out.println("area = " + area1);
		System.out.println("perimeter = " + perimeter1);
		System.out.println("\n");

		System.out.println("Rec2");
		System.out.println("please enter X�G");
		X = newt.nextInt();
		System.out.println("please enter Y�G");
		Y = newt.nextInt();
		System.out.println("please enter the height�G");
		height = newt.nextInt();
		System.out.println("please enter the width�G");
		width = newt.nextInt();

		int area2 = height * width;
		int perimeter2 = height * 2 + width * 2;
		System.out.println("X = " + X);
		System.out.println("Y = " + Y);
		System.out.println("area = " + area2);
		System.out.println("perimeter = " + perimeter2);

	}

}