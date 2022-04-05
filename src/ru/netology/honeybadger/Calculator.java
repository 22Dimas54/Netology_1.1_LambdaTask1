package ru.netology.honeybadger;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    //(Подсказка: обратите внимание на реализацию тернарного оператора в переменной abs.
    //Для решения проблемы можете реализовать аналог, либо сделать полноценный многострочный блок кода с { return }).
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    //Не совсем понял, что было не так с тернарным оператором
    //Переделал на блок кода с { return }).
    UnaryOperator<Integer> abs2 = x -> {
        if (x > 0) {
            return x;
        } else {
            return x * -1;
        }
    };

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
