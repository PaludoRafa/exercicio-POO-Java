package projetoCar;

public class Carro {
	String modelo;
	String marca;
	int qtdMaxCombustivel;
	int qtdAtualCombustivel;
	boolean status;
	int consumoMedio;
	
	public void ligar() {
		System.out.println("O carro ligou");
		this.status = true;
	}
	
	public void desligar() {
		System.out.println("O carro desligou");
		this.status = false;
	}
	
	public void andar(int km) {
		System.out.println("O carro andou " + km + " quilômetros");
		System.out.println("E gastou " + km/this.consumoMedio + " litros");
	}
	
	private void consumirCombustivel(int qtd) {
		
	}
	
	public void abastecer(int qtd) {
		//code
	}
	
	private boolean verificarCombustivel(int qtd) {
		//code
		return false;
	}
}
