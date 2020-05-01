package com.wallet.response;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Gilson
 *
 * @param <T> Tipo generico da classe
 * NoArgsConstructor Vai criar o construtor sem paramentros
 */
@Getter
@Setter
@NoArgsConstructor
public class Response<T> {

	private T data;
	private List<String> errors;
}