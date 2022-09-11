import java.util.Scanner;
public class TotalCost{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int r=100;
double qty=sc.nextDouble();
double totalcost;
if(qty<=1000){
totalcost=qty*r;
System.out.println(totalcost);
}
else{
totalcost=((r*qty)-(0.1*qty*100));
System.out.println(totalcost); 
}
}}