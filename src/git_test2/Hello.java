package git_test2;

public class Hello {
<<<<<<< HEAD

	String message = "안녕하세요";

	public String say() {
		return message;
=======
	String message;

	public Hello() {
		this("안녕하세요");
	}

	public Hello(String message) {
		this.message = message;
	}

	public void say() {
		System.out.println(message);
>>>>>>> 6ad0f1d425484863bc7840b2978587cd98fbf0af
	}
}
