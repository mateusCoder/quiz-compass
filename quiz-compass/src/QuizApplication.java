import java.util.Scanner;

public class QuizApplication{

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String userName;
		
		Question questionA = new Question("Caf� e a�ucar v�o na:", "xicara");
		Question questionB = new Question("Qual a f�rmula da �gua:", "h2o");
		Question questionC = new Question("Melhor bebida do mundo:", "cerveja");
		Question questionD = new Question("Numero do lado oposto ao 1 de um dado de 6 lados:", "Seis");
		
		
		System.out.printf("\t QUIZ COMPASS \n" + "\t-------------- \n\n");
		
		System.out.printf("Ol�, qual o seu nome?\n");
		userName = read.next();	
		
		questionA.createQuestion(userName);
	
				
	}
}