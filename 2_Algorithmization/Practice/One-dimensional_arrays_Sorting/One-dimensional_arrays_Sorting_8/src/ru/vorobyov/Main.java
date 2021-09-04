package ru.vorobyov;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /*Даны дроби p1/q1, p2/q2, ... pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
    знаменателю и упорядочивает их в порядке возрастания.*/

    public static void main(String[] args) {
        var a = new ArrayList<Fraction>();

        int commonDenominator = 1;

        a.add(new Fraction(2, 3));
        a.add(new Fraction(6, 4));
        a.add(new Fraction(3, 7));
        a.add(new Fraction(9, 2));
        a.add(new Fraction(10, 6));
        a.add(new Fraction(12, 9));
        a.add(new Fraction(5, 11));
        a.add(new Fraction(8, 15));
        a.add(new Fraction(17, 2));
        a.add(new Fraction(5, 9));
        a.add(new Fraction(15, 20));

        for(int i = 0; i < a.size() - 1; i++){
            commonDenominator = nok(commonDenominator, a.get(i).getDenominator());
        }

        for(int i = 0; i < a.size() - 1; i++){
            a.set(i, new Fraction( (commonDenominator / a.get(i).getDenominator()) * a.get(i).getNumerator() , commonDenominator));
        }

        var b = new ArrayList<Fraction>();
        Fraction currentElement;

        for (int i = 0; i < a.size() - 1; i++) {
            System.out.println(a.get(i).getNumerator());
        }
        b.add(a.get(0));

        for(int i = 0; i < a.size() - 1; i++){
            int index = binarySearch(b, a.get(i+1).getNumerator(), 0, i+1);
            currentElement = a.get(i+1);

            b = stepToRight(b, index);
            /*b[index] = currentElement;*/
            b.set(index, currentElement);
        }


    }

    static ArrayList<Fraction> stepToRight(ArrayList<Fraction> a, int index){
        for(int i = a.size() - 1; i > index ; i--){
           /* a[i] = a[i - 1];*/
            a.set(i, a.get(i - 1));
        }
        return a;
    }

    static int binarySearch(ArrayList<Fraction> a, int key, int low, int high) {
        int index = 0;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid).getNumerator() < key) {
                low = mid + 1;
            } else if (a.get(mid).getDigit() > key) {
                high = mid - 1;
            } else if (a.get(mid).getDigit() == key) {
                break;
            }
        }
        index = mid;
        return index;
    }

    static int nok(int a, int b) {
        return a * b / nod(a, b);
    }

    static int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }

    public static class Fraction{

        int numerator;
        int denominator;

        Fraction(int numerator, int denominator){
            setNumerator(numerator);
            setDenominator(denominator);
        }

        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        public double getDigit() {
            double temp = numerator/denominator;
            return temp;
        }
    }

}
