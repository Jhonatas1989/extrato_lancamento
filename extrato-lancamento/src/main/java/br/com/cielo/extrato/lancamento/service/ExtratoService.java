package br.com.cielo.extrato.lancamento.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.extrato.lancamento.dao.ExtratoDAO;
import br.com.cielo.extrato.lancamento.exceptions.ArquivoNaoEncontradoException;
import br.com.cielo.extrato.lancamento.model.DadosBancarios;
import br.com.cielo.extrato.lancamento.model.Extrato;
import br.com.cielo.extrato.lancamento.model.legado.LancamentoLegado;
import br.com.cielo.extrato.lancamento.model.legado.ListaControleLancamento;

/**
 * @author Jhonatas Oliveira
 *
 */
@Service
public class ExtratoService {
	
	@Autowired
	private ExtratoDAO extratoDAO;

	/**
	 * @return
	 * @throws ArquivoNaoEncontradoException
	 * @throws Exception
	 */
	public List<Extrato> getListaExtrato() throws ArquivoNaoEncontradoException, Exception {

		LancamentoLegado lancamentoLegado = extratoDAO.loadExtratoFromJSONGson();

		List<Extrato> listaExtrato = new ArrayList<Extrato>();

		for (ListaControleLancamento listaControleLancamento : lancamentoLegado.getListaControleLancamento()) {

			DadosBancarios dadosBancarios = new DadosBancarios(
					Integer.toString(listaControleLancamento.getLancamentoContaCorrenteCliente()
							.getDadosDomicilioBancario().getNumeroAgencia()),
					listaControleLancamento.getNomeBanco(), listaControleLancamento.getLancamentoContaCorrenteCliente()
							.getDadosDomicilioBancario().getNumeroContaCorrente());

			Extrato extrato = new Extrato(listaControleLancamento.getDataLancamentoContaCorrenteCliente(),
					listaControleLancamento.getDescricaoGrupoPagamento(), listaControleLancamento.getNumeroEvento(),
					listaControleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa(),
					listaControleLancamento.getDataEfetivaLancamento(), dadosBancarios,
					listaControleLancamento.getValorLancamentoRemessa().toString());

			listaExtrato.add(extrato);

		}

		return listaExtrato;
	}

}
