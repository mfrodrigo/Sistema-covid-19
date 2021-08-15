package Pessoa;

import java.io.IOException;

public class Pessoa {
	protected String name, login, password;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Pessoa(
			String name, 
			String login, 
			String password
			) throws IOException {
		this.login = login;
		this.password = password;
		this.name = name;
	}
}
