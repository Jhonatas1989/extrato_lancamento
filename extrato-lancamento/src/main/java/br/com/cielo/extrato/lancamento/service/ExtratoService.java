package br.com.cielo.extrato.lancamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.extrato.lancamento.builder.ExtratoBuilder;
import br.com.cielo.extrato.lancamento.dao.ExtratoDAO;
import br.com.cielo.extrato.lancamento.dto.ExtratoDTO;
import br.com.cielo.extrato.lancamento.exceptions.ArquivoNaoEncontradoException;
import br.com.cielo.extrato.lancamento.model.legado.LancamentoLegado;

/**
 * @author Jhonatas Oliveira
 *
 */
@Service
public class ExtratoService {

	@Autowired
	private ExtratoDAO dao;

	@Autowired
	private ExtratoBuilder builder;

	/**
	 * @return
	 * @throws ArquivoNaoEncontradoException
	 * @throws Exception
	 */
	public List<ExtratoDTO> getListaExtrato() throws ArquivoNaoEncontradoException, Exception {

		LancamentoLegado lancamentoLegado = dao.loadExtratoFromJSONGson();

		return builder.buildExtrato(lancamentoLegado);
	}

}
