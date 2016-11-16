package builder;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String idade;
	private String sexo;
	private String altura;
	private String cpf;
	private String rg;
	private String profissao;
	
	public Pessoa(String nome, String sobrenome, String idade, String sexo, String altura, String cpf, String rg,
			String profissao) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
		this.altura = altura;
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}

	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getAltura() {
		return altura;
	}
	
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	public static class Builder {
		private Pessoa pessoa;
		
		public Builder() {
			this.pessoa = new Pessoa();
		}
		

		public Builder setNome(String nome) {
			this.pessoa.nome = nome;
			return this;
		}
		
		
		public Builder setSobrenome(String sobrenome) {
			this.pessoa.sobrenome = sobrenome;
			return this;
		}
		
		
		public Builder setIdade(String idade) {
			this.pessoa.idade = idade;
			return this;
		}
		
		public Builder setSexo(String sexo) {
			this.pessoa.sexo = sexo;
			return this;
		}
		
		
		public Builder setAltura(String altura) {
			this.pessoa.altura = altura;
			return this;
		}
		
		
		public Builder setCpf(String cpf) {
			this.pessoa.cpf = cpf;
			return this;
		}
		
		
		public Builder setRg(String rg) {
			this.pessoa.rg = rg;
			return this;
		}
		
		
		public Builder setProfissao(String profissao) {
			this.pessoa.profissao = profissao;
			return this;
		}
		
		public Pessoa build() {
			return this.pessoa;
		}
	}
}
