import java.util.Scanner;

public class LacosWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner (System.in);
		double soma=0, nota, media=0; // na soma coloco zero, porque se na condiçao While der
		//falso, ele coloca zero para se somar com os demais numeros que deram verdadeiro
		int i=1, qtd; // total de voltas (inicializacao de variavel de teste)
		System.out.println("Digite a qtde de notas a digitar: ");
		qtd = leitor.nextInt(); 
				
		while (i<=qtd) { // condicao( Verdadeiro: repete | Falso: sai do laco
		System.out.println("Digite uma nota: ");
		nota = leitor.nextDouble();
		soma = soma + nota;
		media = soma/i;
		i++; // incremento, ou seja, altera a variavel de controle (i=1 + 2o volta do laco i=2)
				}
		System.out.println("Media: " + String.format("%.2f", media));
	}

}
