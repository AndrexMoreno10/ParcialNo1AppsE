package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CuentaBancaria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombreTitular;
	private String edadTitular;
	private String cedulaTitular;
	private String emailTitular;
	private String numeroCuenta;
	private String saldo;
	
	
	public CuentaBancaria() {
		super();
	}


	public CuentaBancaria(Long id, String nombreTitular, String edadTitular, String cedulaTitular, String emailTitular,
			String numeroCuenta, String saldo) {
		super();
		this.id = id;
		this.nombreTitular = nombreTitular;
		this.edadTitular = edadTitular;
		this.cedulaTitular = cedulaTitular;
		this.emailTitular = emailTitular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombreTitular() {
		return nombreTitular;
	}


	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}


	public String getEdadTitular() {
		return edadTitular;
	}


	public void setEdadTitular(String edadTitular) {
		this.edadTitular = edadTitular;
	}


	public String getCedulaTitular() {
		return cedulaTitular;
	}


	public void setCedulaTitular(String cedulaTitular) {
		this.cedulaTitular = cedulaTitular;
	}


	public String getEmailTitular() {
		return emailTitular;
	}


	public void setEmailTitular(String emailTitular) {
		this.emailTitular = emailTitular;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public String getSaldo() {
		return saldo;
	}


	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	
	

}
