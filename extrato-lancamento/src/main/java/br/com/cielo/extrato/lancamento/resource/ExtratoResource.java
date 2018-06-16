package br.com.cielo.extrato.lancamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.extrato.lancamento.dto.ExtratoDTO;
import br.com.cielo.extrato.lancamento.exceptions.ArquivoNaoEncontradoException;
import br.com.cielo.extrato.lancamento.service.ExtratoService;

/**
 * @author Jhonatas Oliveira
 *
 */
@RestController
@RequestMapping("/extratos")
public class ExtratoResource {

	@Autowired
	ExtratoService service;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ExtratoDTO>> listar() {
		List<ExtratoDTO> extratos;
		try {
			extratos = service.getListaExtrato();
			return ResponseEntity.status(HttpStatus.OK).body(extratos);
		} catch (ArquivoNaoEncontradoException e) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
