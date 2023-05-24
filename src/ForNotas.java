import java.util.Scanner;

public class ForNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leitor = new Scanner(System.in);
	//somar 5 notas
	double soma=0, nota;
	int i;
	
	for (i=1; i<=5; i++) {
	System.out.println("Digite uma nota: ");
	nota = leitor.nextDouble();
	soma = soma + nota;
	}
	System.out.println("Média: " +soma/5);
	}

}
