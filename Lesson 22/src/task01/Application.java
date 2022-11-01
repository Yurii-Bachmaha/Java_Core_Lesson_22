package task01;

public class Application {
	public static void main(String[] args) {

		Pet cat = () -> "Meooooow-Meoooow.";
		Pet dog = () -> "Gaaaaav-Gaaaaav.";
		Pet cow = () -> "Muuuuu-Muuuuu.";

		voice("cat", cat.voice());
		voice("dog", dog.voice());
		voice("cow", cow.voice());

	}

	public static void voice(String name, String voice) {
		System.out.println("I'm " + name + " - " + voice);
	}
}