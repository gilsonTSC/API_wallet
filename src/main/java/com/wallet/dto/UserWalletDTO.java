package com.wallet.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserWalletDTO {

	private Long id;
	
	@NotNull(message = "Inofrme o id do usuário")
	private Long users;
	
	@NotNull(message = "Inofrme o id da carteira")
	private Long wallet;
	
}