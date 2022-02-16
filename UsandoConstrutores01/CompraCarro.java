
public class CompraCarro {
public static void main(String[] args) {
	Carro carro = new Carro(2015, "Cadete", 12000);
	carro.setAno(2002);
	carro.setModelo(null);
	carro.setPreco(12000);
	System.out.println(carro.getModelo());
	System.out.println(carro.getAno());
	System.out.println(carro.getPreco());
}
}
