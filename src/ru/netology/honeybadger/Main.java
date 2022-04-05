package ru.netology.honeybadger;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        // Переменная b=0 по результатам вычитания, а следующая оперция
        // связана с деление, а деление на 0 невозможно.
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Oops, division by 0");
        }

        System.out.println(calc.pow.apply(a));
        System.out.println(calc.abs.apply(a));
        System.out.println(calc.abs2.apply(-10));
        System.out.println(calc.isPositive.test(b));
        calc.println.accept(5);

    }
}
