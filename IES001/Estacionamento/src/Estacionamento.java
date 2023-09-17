import java.util.LinkedList;
import java.util.List;


public class Estacionamento {
	private List<Carro> carros = new LinkedList<Carro>();
	
	public void cadastrarCarro(Carro carro) {
		carros.add(carro);
	
	}
	
	public List<Carro> buscarCarroPorEspecificacao(Especificacao espec){
		List<Carro> carrosEncontrados = new LinkedList<Carro>();
		for (Carro carro:carros) {
			if (carro.getEspec().comparar(espec)) carrosEncontrados.add(carro);
		}
		return carrosEncontrados;
	}
	
	public Carro buscarCarroPorPlaca(String placa) {
		for (Carro carro:carros) {
			if (carro.getPlaca().equals(placa)) {
				return carro;
			}
		}
		return null;
	}
	
	public List<Carro> getCarros(){
		return this.carros;
	}
}
