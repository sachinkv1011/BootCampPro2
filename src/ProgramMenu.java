import java.util.Scanner;

public class ProgramMenu {
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1.Largest of 3 numbers");
        System.out.println("2.smallest of 3 numbers");
        System.out.println("3.Prime number or not");
        System.out.println("4.Even or Not");
        System.out.println("5.Reverse of a number");
        int flag=1;
        while(flag == 1){
        System.out.println("Enter a choice from 1-5 from the MENU");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();



            switch(choice){

                case 1:
                    System.out.println("---This is program to print the larget of 3 numbers---");
                    System.out.println("Enter the 3 numbers");
                    int num1=sc.nextInt();
                    int num2=sc.nextInt();
                    int num3=sc.nextInt();

                    if(num1>num2 && num1>num3){
                        System.out.println(num1 + " is larger");
                    }
                    else if(num2>num1 && num2>num3){
                        System.out.println(num2 + " is larger");
                    }
                    else{
                        System.out.println(num3 + " is larger");
                    }

                    break;

                case 2:
                    System.out.println("---This is program to print the smallest of 3 numbers---");
                    System.out.println("Enter the 3 numbers");
                    int n1=sc.nextInt();
                    int n2=sc.nextInt();
                    int n3=sc.nextInt();

                    if(n1<2 && n1<n3){
                        System.out.println(n1 + " is smaller");
                    }
                    else if(n2<n1 && n2<n3){
                        System.out.println(n2 + " is smaller");
                    }
                    else{
                        System.out.println(n3 + " is smaller");
                    }

                    break;


                case 3 :
                    System.out.println("---This is program to print the prime or not---");
                    System.out.println("Enter the number to check");
                    int prime=sc.nextInt();
                    int flag1=0;
                    for(int i=1;i<=prime;i++){
                        if(prime%i==0){
                            flag1++;
                        }
                    }
                    if(flag1==2){
                        System.out.println(prime +" is a prime number");
                    }
                    else {
                        System.out.println(prime +" is Not a prime number");
                    }
                    break;


                case 4:
                    System.out.println("---This is program to print the prime or not---\"");
                    System.out.println("Enter the number to check even or not");
                    int num= sc.nextInt();
                    if(num%2==0){
                        System.out.println(num +" is a even number");
                    }
                    else{
                        System.out.println(num +" is a odd number");
                    }
                    break;


            }






        }

    }
}
