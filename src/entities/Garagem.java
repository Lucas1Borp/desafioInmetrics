package entities;

public class Garagem {

	private Integer vagas;

	public Garagem(Integer vagas) {
		this.vagas = vagas;
	}

	public Integer getVagas() {
		return vagas;
	}

	public void setVagas(Integer vagas) {
		this.vagas = vagas;
	}

	public String imprimeDados() {
		return "Garagem \nVaga: " + vagas;
	}

}
