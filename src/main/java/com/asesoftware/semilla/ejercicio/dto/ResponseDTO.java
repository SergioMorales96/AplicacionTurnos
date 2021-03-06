package com.asesoftware.semilla.ejercicio.dto;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ResponseDTO {
	
	private Object data;
	private boolean success;
	private String message;
	private HttpStatus status;
	
	public ResponseDTO() {}
	
	public ResponseDTO(Object data, boolean success, String message, HttpStatus status) {
		super();
		this.data = data;
		this.success = success;
		this.message = message;
		this.status = status;
	}

}
