
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i; // posso dar um valor para o I na declaração global
	// ex: i = 1 =>  eu posso ocultar a condição de inicio no for (;i>10;i++) dá certo
	for (i =10; i<=30; i+=3) {// inicializacao; final; incremento (quanto vai somar nas voltas)
	System.out.println("Valor de i: " + i);
}// a variavel i quando gravada dentro do comando ela não funciona fora dele...
	// ou seja, se quiser uma melhor performance, é melhor declarar ela fora
	System.out.println("O i saiu do laço valendo: " + i);
	for (i=30; i>10; i--) {
	System.out.println("Valor de i: " + i);
	}
	System.out.println("O i saiu do laço valendo: " + i);
	}
}
