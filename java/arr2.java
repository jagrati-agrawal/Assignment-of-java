class arr2{
public static void main(String[] args){
int[] arr1={1,2,3,4,5};
int ele=3;
int pos=2;
int n=5;
for (int i=pos;i<=n-1;i++){
arr1[i]=arr1[i+1];
n--;
}
System.out.print(arr1);



}}
