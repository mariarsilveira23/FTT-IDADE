import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Idade...");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o ano de nascimento:");
		
		try {
			System.out.println("Sua idade �: " + (2018 - scanner.nextInt()));
		}
		catch(Exception e)
		{
			System.err.println("N�o foi poss�vel calcular :(");
			e.printStackTrace();
		}
				
		scanner.close();
		
		//teste

	}

}
