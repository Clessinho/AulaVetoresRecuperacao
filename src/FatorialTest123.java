import java.util.Scanner;

public class FatorialTest123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*dado um numero, exibir o seu fatorial (ex: fatorial 4 => 4 x 3 x 2 x 1 = 24
		 * Numero =4
		 * Fatorial = 24
		 */
	Scanner leitor = new Scanner (System.in);
	int i,fat=1;
	
	System.out.println("Digite um numero: ");
	int numero = leitor.nextInt();
	
	for (i=1;i<=numero;i++) {
	fat =fat * i;
		}
	System.out.println(numero + "!=" + fat);
	/*for invertido (i=numero;i>1;i--)
	 * resultado do for normal
	 * Numero | i | fatorial
	 * 3        1      1
	 *          2      2
	 *          3      6
	 *          4      24
	 */
	}
}
