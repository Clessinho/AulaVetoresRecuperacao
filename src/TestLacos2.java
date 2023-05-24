import java.util.Scanner;

public class TestLacos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double somaAltura = 0, media;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite altura do 1. aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		
		System.out.println("Digite altura do 2. aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		
		System.out.println("Digite altura do 3. aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		
		System.out.println("Digite altura do 4. aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		
		System.out.println("Digite altura do 5. aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		
		System.out.println("Digite altura do 6. aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		
		media = somaAltura/6;
		System.out.println("A media de altura dos aluno é de: " + String.format("%.2f", media));
		leitor.close();
	}

}
