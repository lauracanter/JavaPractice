package com.example;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        float weight, height, b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter weight in kg: ");

        weight = scan.nextFloat();

        System.out.println("Enter height in meters: ");

        height = scan.nextFloat();

        b = bmi(weight, height);

        System.out.println("BMI is: "+ b);

        if (b>25)
            System.out.println("Overweight!");
        else if (b<25 && b>18.5)
            System.out.println("Normal Weight");
        else if (b<18.5)
            System.out.println("Underweight");

    }



    public static float bmi(float weight, float height)

    {
        return weight/(height*height);
    }
}
