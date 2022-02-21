import java.util.Scanner;

public class QuizApplication{

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String userName;
		
		Question questionA = new Question("Café e açucar vão na:", "xicara");
		Question questionB = new Question("Qual a fórmula da água:", "h2o");
		Question questionC = new Question("Melhor bebida do mundo:", "cerveja");
		Question questionD = new Question("Numero do lado oposto ao 1 de um dado de 6 lados:", "Seis");
		Question questionE = new Question("De quem é a famosa frase “Penso, logo existo”?", "Descartes");
		Question questionF = new Question("Quantas casas decimais tem o número pi?", "Infinitas");
		Question questionG = new Question("Em qual local da Ásia o português é língua oficial?", "Macau");
		
		System.out.printf("\t QUIZ COMPASS \n" + "\t-------------- \n\n");
		
		System.out.printf("Olá, qual o seu nome?\n");
		userName = read.next();	
		
		questionA.createQuestion(userName);
	
	}
}