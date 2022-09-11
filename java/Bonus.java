import java.util.Scanner;
public class Bonus{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int sal=sc.nextInt();
double bonus;
int yearOfService=sc.nextInt();
if(yearOfService>5){
bonus=sal+(0.05*sal);
System.out.println("bonus="+bonus);
}
else{
System.out.println("no bonus");}

}}