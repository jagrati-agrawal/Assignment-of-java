import java.util.Scanner;
class Square{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("enter length  ");
float l=sc.nextFloat();

System.out.println("enter breadth  ");
float b=sc.nextFloat();

if (l==b)
{

System.out.println("it is a square");
}
else{

System.out.println("it is not square");
}

}}