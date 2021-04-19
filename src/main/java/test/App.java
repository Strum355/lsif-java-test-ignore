package test;

public class App {
    public static void main(String[] args) {
        Burger b = new Burger();
        b.getGreeting();
    }

    public interface Banana {
        String getGreeting();
    }

    public interface Test {
        String getGreeting();
    }

    public static class Burger implements Test, Banana {
        @Override
        public String getGreeting() {
            return "";
        }
    }
}
