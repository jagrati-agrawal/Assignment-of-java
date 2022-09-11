import java.util.Scanner;
public class Percentage{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the no.of classes held");
int h=sc.nextInt();
System.out.println("enter the no.of classes attended");
int A=sc.nextInt();
double per=(A*100)/h;

if(per<75){
System.out.println("student can't sit in the exam"+per);}
else{
System.out.println("student can sit in the exam"+per);
}}
}
