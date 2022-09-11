import java.util.Scanner;
public class Medical{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the no.of classes held");
int h=sc.nextInt();
System.out.println("enter the no.of classes attended");
int A=sc.nextInt();
double per=(A*100)/h;
String medical_Issue=sc.next();

if(per<75){
if(medical_Issue =='y'|| medical_Issue =='Y'){
System.out.println("student can sit in the exam"+per);}
else if(medical_Issue =='n'|| medical_Issue =='N'){
System.out.println("student can't sit in the exam"+per);}}
else{
System.out.println("student can sit in the exam"+per);
}}
}
