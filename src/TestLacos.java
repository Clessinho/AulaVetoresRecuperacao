import java.util.Scanner;

public class TestLacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double altura1, altura2, altura3, altura4, altura5, altura6, media;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite altura do 1. aluno: ");
		altura1 = leitor.nextDouble();
		
		System.out.println("Digite altura do 2. aluno: ");
		altura2 = leitor.nextDouble();
		
		System.out.println("Digite altura do 3. aluno: ");
		altura3 = leitor.nextDouble();
		
		System.out.println("Digite altura do 4. aluno: ");
		altura4 = leitor.nextDouble();
		
		System.out.println("Digite altura do 5. aluno: ");
		altura5 = leitor.nextDouble();
		
		System.out.println("Digite altura do 6. aluno: ");
		altura6 = leitor.nextDouble();
		media = (altura1 + altura2 + altura3 + altura4 + altura5 + altura6)/6;
		System.out.println("A media de altura dos aluno é de: " + String.format("%.2f", media));
		leitor.close();
	}

}
