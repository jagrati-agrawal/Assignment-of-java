class Employee{
	String name;      
	double salary;
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
}}
class Sample{
public static void main(String[] args){
Employee e1=new Employee("anil",12342);
Employee e2=new Employee("shy",143322);
Employee e3=new Employee("riya",175342);
Employee e4=new Employee("vdgddguy",212342);
Employee e5=new Employee("rem",1234542);

Employee[] arr=new Employee[5];
arr[0]=e1;
arr[1]=e2;
arr[2]=e3;
arr[3]=e4;
arr[4]=e5;




double ans=0;
int index=-1,i=0;
String name=" ";
while(i<arr.length){
		if(arr[i].salary>ans){
			ans=arr[i].salary;
			index=i;
			name=arr[i].name;

}
i++;


}
System.out.println(name+"max salary"+ans);
}}




