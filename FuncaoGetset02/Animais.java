
public class Animais {
public static void main(String[] args) {
	
	Descricao vaca = new Descricao();
	vaca.setPeso(435.45);
	vaca.setTipo("bovino de leite");
	vaca.setCor("branca");
	System.out.println(vaca.GetPeso());
	System.out.println(vaca.getTipo());
	System.out.println(vaca.getCor());
}
}
