package model;
import java.io.Serializable;

public class ModelLogin implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String email;
	private String login;
	private String senha;
	private boolean useradmin;
	private String perfil;
	private String sexo;
	private String fotoUser;
	private String extensaoFotoUser;
	
	public boolean isNovo() {
		if(this.id == null) {
			return true;//Inserir novo
		}else if (this.id != null && this.id > 0) {
			return false; //Atualizar
		}
		return id == null;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean getUseradmin() {
		return this.useradmin;
	}
	
	public void setUseradmin(boolean useradmin) {
		this.useradmin = useradmin;
	}
	
	public String getPerfil() {
		return this.perfil;
	}
	
	public void setPerfil(String perfil) {
		this.perfil = perfil;	
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFotoUser() {
		return fotoUser;
	}

	public void setFotoUser(String fotoUser) {
		this.fotoUser = fotoUser;
	}

	public String getExtensaoFotoUser() {
		return extensaoFotoUser;
	}

	public void setExtensaoFotoUser(String extensaoFotoUser) {
		this.extensaoFotoUser = extensaoFotoUser;
	}
}
