package testes;
import java.util.Scanner;

public class Ex_Estrutura {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		char again = 'S';
		 while(again=='S') {
		
		    System.out.print("Digite o primeiro número da operação: ");
		    float n1 = scn.nextInt();
		    System.out.print("Digite o segundo número da operação: ");
		    float n2 = scn.nextInt();
		    System.out.print("Digite a operação que deseja aplicar '/','*','+','-': ");
		    char oper = scn.next().charAt(0);
		    //Soma
		    float soma = n1+n2;
		    //Subtração
		    float sub = n1-n2;
		    //Multiplicação
		    float mult = n1*n2;
		    //Divisão
		    float div = n1/n2;
		    //Escolha do usuário
		    switch(oper) {
		    case'+':
		    	System.out.println("A soma dos valores é: " + soma);
		    	break;
		    case'-':
		    	System.out.println("A subtração dos valores é: " + sub);
		    	break;
		    case'*':
		    	System.out.println("A subtração dos valores é: " + mult);
		    case'/':
		    	if (n2!=0) {
	           System.out.println("A divisão dos valores é: " + div);
	           }else{
	           System.out.println("Erro: operação inválida");
	           }
	           break;
	                    }
		    //Repetição
		    System.out.print("Deseja continuar (S/N)? ");
	        again = scn.next().charAt(0);}
		    System.out.println("Agradecemos pela sua colaboração");
	   scn.close();

	}

}
