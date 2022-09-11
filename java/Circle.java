import java.util.Scanner;
public class Circle{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double pi=3.14,area;
		System.out.println("Enter the radius of circle");
		int r=s.nextInt();
		area=pi*r*r;
		System.out.println("area= "+area);
		}}