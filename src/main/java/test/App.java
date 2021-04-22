package test;

/**
 * <code class="language-java">public class App {}</code>
 * <tt>Some other text?</tt>
 */
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
