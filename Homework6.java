package cop2805;


import java.util.ArrayList;
import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;
        ArrayList<Integer> factors, smallFactor ;
        System.out.println("Enter n:");
        number = input.nextInt();

        factors = allFactors(number);
        System.out.println("Factors: "+factors);
        smallFactor = smallestFactors(factors,number);
        System.out.println("Smallest Factors: "+smallFactor);


    }

    public static ArrayList<Integer> allFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }

        return factors;

    }

    public static ArrayList<Integer> smallestFactors(ArrayList<Integer> factors, int number){
        ArrayList<Integer> smallFactors = new ArrayList<>();
        int i =1;
        while (number!=1){

            boolean divisor=false;
            while (divisor==false){
                if(number%factors.get(i)==0){
                    divisor=true;
                    smallFactors.add(factors.get(i));
                    number = number/factors.get(i);

                }else{
                    i++;
                }
            }
        }
        return smallFactors;

    }
}
