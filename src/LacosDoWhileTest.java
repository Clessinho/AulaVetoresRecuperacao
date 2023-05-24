import java.util.Scanner;

public class LacosDoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner (System.in);
		int op, resultado = 0, v1, v2; //resultado pode ser nulo, entao tem que colocar o zero para somar
		System.out.println("Digite um valor: ");
		v1 = leitor.nextInt();
		System.out.println("Digite um segurndo valor: ");
		v2 = leitor.nextInt();
		do {
		System.out.println("Calculadora\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair");
		op = leitor.nextInt();
		switch (op) {
		case 1: resultado = v1 + v2;break;
		case 2: resultado = v1 - v2;break;
		case 3: resultado = v1 * v2;break;
		case 4: resultado = v1 / v2;break;
	}
		System.out.println("Resultado: " + resultado);
	}while (op !=5);
	}

}
