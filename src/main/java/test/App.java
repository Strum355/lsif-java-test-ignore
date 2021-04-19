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
			return new CharSequence() {
				@Override
				public int length() {
					return 0;
				}

				@Override
				public char charAt(int index) {
					return 0;
				}

				@Override
				public CharSequence subSequence(int start, int end) {
					return null;
				}
			}.toString();
		}
	}
}
