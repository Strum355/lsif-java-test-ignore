package test;

public class App {
    public static void main() {
        Banana b = new Burger();
        b.getGreeting();
    }

    public interface Banana {
        void getGreeting();
    }

    public interface Test {
        void getGreeting();
    }

    public static class Burger implements Test, Banana {
        @Override
        public void getGreeting() {}
    }
}
