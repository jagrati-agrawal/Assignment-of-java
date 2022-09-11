import java.util.Scanner;
public class Age{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the age of A");
int A=sc.nextInt();
System.out.println("enter the age of B ");
int B=sc.nextInt();
System.out.println("enter the age of C ");
int C=sc.nextInt();
if(A>B){
if(A>C){
System.out.println("A is oldest "+A);}
else{
System.out.println("C is oldest"+C);}}
if(B>A){
if(B>C){
System.out.println("B is oldest "+B);}
else{
System.out.println("C is oldest"+C);}}
if(A<B){
if(A<C){
System.out.println("A is youngest "+A);}
else{
System.out.println("C is youngest"+C);}}
if(B<A){
if(B<C){
System.out.println("B is youngest "+B);}
else{
System.out.println("C is youngest"+C);}}
}}