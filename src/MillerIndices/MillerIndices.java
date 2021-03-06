/**
 * Created by schandramouli on 12/7/15.
 */
package MillerIndices;

import java.util.Scanner;
import NumberSystems.Rational;

public class MillerIndices {
    // TODO: will have rounding off errors, have to fix that
    Rational x;
    Rational y;
    Rational z;

    public MillerIndices(Rational x, Rational y, Rational z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void rationalize(int n) {
        x.rationalize(n);
        y.rationalize(n);
        z.rationalize(n);
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
        x.setPrecision(1);
        System.out.println(x.getPrecision());
        System.out.println(x + " , " + y);
        Rational lcm = x.getLCM(y).getLCM(z);
        System.out.println(lcm.intValue());
        millerIndices.rationalize(lcm.intValue());
        System.out.println("Done" + ", " + millerIndices);
    }

    @Override
    public String toString() {
        return "MillerIndices<" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ">";
    }
}
