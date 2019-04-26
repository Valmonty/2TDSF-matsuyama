import javax.faces.bean.ManagedBean;

@ManagedBean
public class AnimalBean {
	private String raca;
	private String nome;
	private String genero;
	private int idade;
	private double peso;
	private String porte;
	private String rg;

	public void enviar() {
		System.out.println("Ra�a: " + getRaca());
		System.out.println("Nome: " + getNome());
		System.out.println("Genero: " + getGenero());
		System.out.println("Idade: " + getIdade());
		System.out.println("Peso: " + getPeso());
		System.out.println("Porte: " + getPorte());
		System.out.println("RG: " + getRg());
	}

	public AnimalBean() {
		super();
	}

	public AnimalBean(String raca, String nome, String genero, int idade, double peso, String porte, String rg) {
		super();
		this.raca = raca;
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.peso = peso;
		this.porte = porte;
		this.rg = rg;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
