package br.com.cielo.extrato.lancamento.exceptions;

import java.io.FileNotFoundException;

/**
 * @author Jhonatas Oliveira
 *
 */
public class ArquivoNaoEncontradoException extends FileNotFoundException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param mensagem
	 */
	public ArquivoNaoEncontradoException(String mensagem){
		super(mensagem);
	}

}
