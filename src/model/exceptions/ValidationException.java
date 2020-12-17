package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	//chave String indica nome do campo, e o valor String é o erro especifico do campo
	private Map<String , String> errors = new HashMap<>();
	public ValidationException(String msg) {
		super(msg);
	}
	
	//metodo para pegar os erros
	public Map<String , String> getErrors(){
		return errors;
	}
	
	//metodo que permite adicionar erros a coleção
	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}
	
}
