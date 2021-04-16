package test;

public class App {
    public interface Banana {
        String getGreeting();
    }

    public interface Test {
        String getGreeting();
    }

    public class Burger implements Test, Banana {
        @Override
        public String getGreeting() {
            return "";
        }
    }
}
