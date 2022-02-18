import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question {
	private static ArrayList<String> questions = new ArrayList<String>();
	private static ArrayList<String> alternatives = new ArrayList<String>();	
	
	int randomNumber;
	int points = 0;
	int mistakes = 0;
	String div = "--------------------";
	String choice;
	Scanner read = new Scanner(System.in);
	
	public Question(String question, String alternative) {
		this.questions.add(question);
		this.alternatives.add(alternative);
	}
	
//	public int randomNumber() {
//		Random generator = new Random();
//		randomNumber = generator.nextInt(questions.size());
//		return randomNumber;
//	}
	
	public void createQuestion(String userName) {
		for(int i = 0; i < questions.size(); i++) {
			System.out.println(questions.get(i));
			System.out.printf("Resposta: \n");
			choice = read.next();
			
			if(alternatives.get(i).equals(choice)) {
				System.out.println("Acertou! \n");
				points++;
			}else {
				System.out.println("Errou! \n");
				mistakes++;
			}
		}
		System.out.println(div);
		System.out.println(" Usuário: " + userName);
		System.out.println(div);
		System.out.println(" Acertos: " + points);
		System.out.println(div);
		System.out.println(" Erros: " + mistakes);
		System.out.println(div);
	}
}