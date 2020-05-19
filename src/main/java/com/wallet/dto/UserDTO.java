package com.wallet.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) //SÓ ADICIONAR VALORES NÃO NULOS.
public class UserDTO {

	private Long id;
	
	@Email(message="Email inválido")
	private String email;
	
	@Length(min=3, max=50, message="O nome deve conter entre 3 a 50 caracteres")
	private String name;
	
	@NotNull
	@Length(min=6, message="A senha deve conter no minimo 6 caracteres")
	private String password;
	
	@NotNull(message = "Informe uma role de acesso")
	@Pattern(regexp="^(ROLE_ADMIN|ROLE_USER)$", message = "Para A ROLE DE ACESSO somente são aceitos os valores ROLE_ADMIN ou ROLE_USER")
	private String role;
	
}