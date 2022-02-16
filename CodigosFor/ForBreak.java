//aqui estaremos usando o encadeamento dos laços e tambem usando o break para pausar uma operaçáo.

public class ForBreak {
	public static void main(String[] args) {
		for (int linha = 0; linha <= 10; linha++) {
			for (int coluna = 0; coluna <= 10; coluna++) {
				if (coluna > linha) {
					break;

				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
