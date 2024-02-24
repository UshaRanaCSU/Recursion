import java.util.*;
class Product
{
    public static void main(String args[]){

        int arr[]=new int[5];

        System.out.println("Please enter Five numbers : ");

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<5;i++){

            arr[i]=sc.nextInt();
        }
        int mul=product(arr,4);

        System.out.println("The Product of the numbers is "+mul);
    }

    public static int product(int arr[],int n){

        if(n==0)
            return arr[0];
        else
            return (arr[n] * product(arr,n-1));
    }
}