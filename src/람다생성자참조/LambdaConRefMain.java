package 람다생성자참조;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaConRefMain {
    public static void main(String[] args) {
        Function<String, LambdaMember> function1 = LambdaMember :: new;
        LambdaMember member1 = function1.apply("angel");

        BiFunction<String, String, LambdaMember> function2 = LambdaMember :: new;
        LambdaMember member2 = function2.apply("신천사", "angel");
    }
}