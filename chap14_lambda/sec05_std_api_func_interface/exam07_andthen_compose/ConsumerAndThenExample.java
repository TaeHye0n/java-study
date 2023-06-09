package chap14_lambda.sec05_std_api_func_interface.exam07_andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
    public static void main(String[] args) {
        Consumer<Member> consumerA = (m) ->{
            System.out.println("consumerA: " + m.getName());
        };

        Consumer<Member> consumerB = (m) ->{
            System.out.println("consumerB: " + m.getName());
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("홍길동", "hong", null));
    }
}
