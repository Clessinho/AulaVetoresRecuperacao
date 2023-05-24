import java.util.Scanner;

public class LacosWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner (System.in);
		double soma=0, nota, media; // na soma coloco zero, porque se na condiçao While der
		//falso, ele coloca zero para se somar com os demais numeros que deram verdadeiro
		int i=1; // total de voltas (inicializacao de variavel de teste)
		
		while (i<=5) { // condicao( Verdadeiro: repete | Falso: sai do laco
		System.out.println("Digite uma nota: ");
		nota = leitor.nextDouble();
		soma = soma + nota;
		i++; // incremento, ou seja, altera a variavel de controle (i=1 + 2o volta do laco i=2)
		}
		System.out.println("Media: " + soma/5);
	}

}
