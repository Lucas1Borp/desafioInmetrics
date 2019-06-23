package entities;

public class Carro extends Garagem implements Comparable<Carro> {

	private String cor, placa, modelo, marca, cidade;
	private Double veloxMax;

	public Carro(String cor, Integer vagas, String placa, Double veloxMax, String modelo, String cidade, String marca) {
		super(vagas);
		this.cor = cor;
		this.placa = placa;
		this.veloxMax = veloxMax;
		this.modelo = modelo;
		this.cidade = cidade;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setVeloxMax(Double veloxMax) {
		this.veloxMax = veloxMax;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getVeloxMax() {
		return veloxMax;
	}

	public void setVeloxMax(double veloxMax) {
		this.veloxMax = veloxMax;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public Integer getVagas() {
		return super.getVagas();
	}

	@Override
	public void setVagas(Integer vagas) {
		super.setVagas(vagas);
	}

	@Override
	public String imprimeDados() {

		return "DADOS DO VEICULO  \n" + super.imprimeDados() + "\nMarca:" + marca + "\nModelo:" + modelo + "\nCor:"
				+ cor + "\nPlaca:" + placa + "\nVelocidade Maxima" + veloxMax + "\nCidade de origem:" + cidade + "\n";
	}

	@Override
	public int compareTo(Carro c) {
		return this.cor.compareTo(c.cor);
	}

}
