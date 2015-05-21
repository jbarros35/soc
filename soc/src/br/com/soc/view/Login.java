package br.com.soc.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

public class Login {
	
	private String userName;
	private String password;
	private String msg;
	private String empresa;
	private List<SelectItem> empresas;
	private boolean empresaSelecionada;
	
	public String autenticar() {
		if (userName.equals("teste")
				&& password.equals("123456")) {
			empresas = new ArrayList<SelectItem>();
			empresas.add(new SelectItem("1", "Empresa 1"));
			empresas.add(new SelectItem("2", "Empresa 2"));
			empresas.add(new SelectItem("3", "Empresa 3"));
			return "sucesso";
		} else {
			this.userName = null;
			this.password = null;
			msg = "Nome de usuário ou senha inválidos.";
		}
		return null;
	}

	public void reset(ActionEvent event) {
		this.userName = null;
		this.password = null;
		this.msg = null;
	}
	
	public String selecionarEmpresa() {
		empresaSelecionada = true;
		return null;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public List<SelectItem> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<SelectItem> empresas) {
		this.empresas = empresas;
	}
	
	

}
