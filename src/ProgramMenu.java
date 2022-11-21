import java.util.Scanner;

public class ProgramMenu {
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1.Largest of 3 numbers");
        System.out.println("2.smallest of 3 numbers");
        System.out.println("3.Prime number or not");
        System.out.println("4.Even or Not");
        System.out.println("5.Reverse of a number");

        System.out.println("Enter a choice from 1-5 from the MENU");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        int flag=1;
        while(flag == 1){

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

            }






        }

    }
}
