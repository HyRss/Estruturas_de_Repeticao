package testes;
public class Estrutura_de_repetição {

	public static void main(String[] args) {
		System.out.println("Loop for");
		for(int i = 15; i <= 20; i++) {
			System.out.println("O quadrado de " + i + " é " + Math.pow(i, 2));
		}
		//variável i comum para os loops while e do while
		int i = 15;
		System.out.println("Loop while");		
		while(i <= 20) {
			System.out.println("O quadrado de " + i + " é " + Math.pow(i, 2));
			i++;
		}
		
		System.out.println("Loop do while");
		i = 15;
		do {
			System.out.println("O quadrado de " + i + " é " + Math.pow(i, 2));
			i++;
		}while(i <= 20);
		
	}
}