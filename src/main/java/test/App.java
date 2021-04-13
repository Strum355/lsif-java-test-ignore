package test;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public class Test extends App {
        @Override
        public String getGreeting() {
            return "";
        }

        public class Banana extends Test {
            @Override
            public String getGreeting() {
                return "";
            }
        }
    }
}
