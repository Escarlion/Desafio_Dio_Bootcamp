package desafioDio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
	
	Mentoria(){
		
	}

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo= " + titulo + 
				", descricao= " + descricao + 
				", data= " + data + "]";
	}

	
	

}
