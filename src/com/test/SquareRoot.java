package com.test;

public class SquareRoot {
private int number;

       public static void squareroot(double number){
        double i=1;
        //double value=i*i;
        boolean found=false;
        while(!found) {
            if (i*i == number) {
                System.out.println("Found " + i);
                found=true;
            }
            else {

                if ( i * i > number) {
                    double result = square(number,i-1 ,i);
                    System.out.println(result);
                    found = true;
                }
            }
            i++;
        }
        }

        public static double square(double number,double initValue,double finalValue) {
            double mid = (initValue + finalValue) / 2;
            double value = mid * mid;
            if (value == number || (Math.abs(value - number) < 0.00001)) {
                return mid;
            } else if (value < number) {
                return square(number, mid, finalValue);
            } else
            return square(number,initValue,mid);
        }
        }


