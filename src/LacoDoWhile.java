import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leitor = new Scanner (System.in);
	Scanner leitorTexto = new Scanner (System.in);
	double soma = 0, nota;
	String resposta;
	
	do {
	System.out.println("Digite a qtde de instrumentos aplicados: ");//somar quantas notas desejar
	int i = 1, qtd; //inicialização de variavel de teste (quantas voltas dá)
	qtd = leitor.nextInt();
	
	while (i<=qtd) {//condição (VERDADEIRO: REPETE | FALSO: SAI DO LAÇO
	System.out.println("Digite uma nota: ");
	nota = leitor.nextDouble();
	soma = soma + nota;
	i++; // incremento (é o comando para contar as voltas)
	}
	System.out.println("Media: " + soma/qtd);
	System.out.println("Deseja cadastrar outro aluno: ");
	resposta = leitorTexto.next();
	}while (resposta.equals("Sim"));
	
	}

}
