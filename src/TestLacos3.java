import java.util.Scanner;

public class TestLacos3 {
public static void main(String[] args) {
	double somaAltura = 0, media;
	Scanner leitor = new Scanner (System.in);
	int aluno = 1; // vlr inicial => vai se somar ao aluno++ lá embaixo
	// 06 repetições de padrão, crio um inicio int (nome) = 1 e faço
	// um comando de laço de repetição o While, no caso
			
	while (aluno<=6) {
	
	System.out.println("Digite altura do " + aluno + ". aluno: ");
	//repare que na func acima, o + aluno está trazendo o numero aluno++
	//ou seja, na 1o volta ele vale 1 (1. aluno), 2o volta vale 2 (2. aluno)
	somaAltura = somaAltura + leitor.nextDouble();
	aluno++; // aluno = aluno + 1
	}

	media = somaAltura/6;
	System.out.println("A media de altura dos aluno é de: " + String.format("%.2f", media));
	leitor.close();
	
}
}
