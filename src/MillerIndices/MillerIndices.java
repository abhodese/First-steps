/**
 * Created by schandramouli on 12/7/15.
 */
package MillerIndices;

import java.util.Scanner;
import NumberSystems.Rational;

public class MillerIndices {
    Rational x;
    Rational y;
    Rational z;

    public MillerIndices(Rational x, Rational y, Rational z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter x = ");
        Rational x = new Rational(scanner.nextLine());

        System.out.printf("Enter y = ");
        Rational y = new Rational(scanner.nextLine());

        System.out.printf("Enter z = ");
        Rational z = new Rational(scanner.nextLine());

        MillerIndices millerIndices =  new MillerIndices(x, y, z);
    }
}