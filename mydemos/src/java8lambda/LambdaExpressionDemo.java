package java8lambda;

class MyDemo {
    @FunctionalInterface
    interface myDemo {
        void show();
    }
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        MyDemo.myDemo obj = () -> {
            System.out.println("Hello from lambda");
        };
        obj.show();
    }
}