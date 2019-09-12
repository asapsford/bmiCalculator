package com.alexsapsford;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (Kg): ");
        float weight = scanner.nextFloat();

        System.out.print("Height (M): ");
        float height = scanner.nextFloat();

        double BMI = weight / (height * Math.pow(2, 1));
        System.out.println("Your BMI is: " + BMI);

        if (BMI < 18.5) {
            System.out.print("You're underweight");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.print("You're healthy");
        } else if (BMI >= 25 && BMI < 30) ;
        {
            System.out.print("You're overweight");
        }


    }

}





