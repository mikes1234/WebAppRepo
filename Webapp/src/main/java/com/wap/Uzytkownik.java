package com.wap;

public class Uzytkownik {

	private String login;
	private String email;
	private String nazwa;
	private String haslo;

	public Uzytkownik(String login, String email, String nazwa, String haslo) {
		this.login = login;
		this.email = email;
		this.nazwa = nazwa;
		this.haslo = haslo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
}
