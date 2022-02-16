
public class WhileEVariaveis {
public static void main(String[] args) {
	int contador = 0;
//	String letra = "i";
//	String valor = letra + contador;
	//Nes codigo teremos apenas a letra I e 0 repedidos 10 pois, atribuimos de maneira errada.
	
	while (contador <= 10) {
		System.out.println("I" +contador); //Mas desta maneira teremos o resultado esperado., pois escrevemos a mensagem e depois, atribuimos a variavel contador.
		contador ++;
	}
	System.out.println("I" +contador); //Quando escrevemos assim fora do escopo, o resultado é um número acima dofinal do laço.
	
}
}
