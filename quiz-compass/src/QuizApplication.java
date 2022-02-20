import java.util.Scanner;

public class QuizApplication{

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String userName;
		
		Question questionA = new Question("Café e açucar vão na:", "xicara");
		Question questionB = new Question("Qual a fórmula da água:", "h2o");
		Question questionC = new Question("Melhor bebida do mundo:", "cerveja");
		Question questionD = new Question("Numero do lado oposto ao 1 de um dado de 6 lados:", "Seis");
		
		
		System.out.printf("\t QUIZ COMPASS \n" + "\t-------------- \n\n");
		
		System.out.printf("Olá, qual o seu nome?\n");
		userName = read.next();	
		
		questionA.createQuestion(userName);
	
				
	}
}