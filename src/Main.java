import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // taking an input from the user n1 and n2
        // we need to find which one is smaller and then apply the process
        Scanner input = new Scanner(System.in);
        System.out.print("Please choose the n1 number : ");
        int n1 = input.nextInt();
        System.out.println("****************************");
        System.out.print("Please choose the n2 number : ");
        int n2 = input.nextInt();
        System.out.println("****************************");

        int gdc = 0;
        int minValue = 0;
        int i = 0;
        int lcm;

        if(n1 > n2){

            minValue = n2;

        }else if(n1 < n2){
            minValue = n1;
        }else if( n1 <= 0 || n2 <= 0){
            while(n1 <= 0 || n2 <= 0){
                System.out.print("New n1 number : ");
                n1 = input.nextInt();
                System.out.print("New n2 number : ");
                n2 = input.nextInt();
                if(n1 > n2){
                    minValue = n2;
                }else{
                    minValue = n1;
                }
            }
            
        }
        else{
            System.out.println("Please be sure both of them aren't equal to each other!");
            while(n1 == n2){
                System.out.print("New n1 number : ");
                n1 = input.nextInt();
                System.out.print("New n2 number : ");
                n2 = input.nextInt();
                if(n1 > n2){
                    minValue = n2;
                }else{
                    minValue = n1;
                }
            }
        }

        for(i = 1; i <= minValue; i++){
            if(n1 % i == 0 && n2 % i == 0){
                gdc = i;
            }
        }
        System.out.println("Gdc of n1 and n2 is : " + gdc);
        lcm = (n1 * n2) / gdc;
        System.out.println("Ldc of n1 and n2 is : " + lcm);
    }
}
