package br.com.cielo.extrato.lancamento.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.cielo.extrato.lancamento.dto.DadosBancariosDTO;
import br.com.cielo.extrato.lancamento.dto.ExtratoDTO;
import br.com.cielo.extrato.lancamento.model.legado.LancamentoLegado;
import br.com.cielo.extrato.lancamento.model.legado.ListaControleLancamento;

/**
 * @author Jhonatas Oliveira
 *
 */
@Component
public class ExtratoBuilder {

	/**
	 * @param lancamentoLegado
	 * @return
	 */
	public List<ExtratoDTO> buildExtrato(LancamentoLegado lancamentoLegado) {

		List<ExtratoDTO> listaExtrato = new ArrayList<ExtratoDTO>();

		for (ListaControleLancamento listaControleLancamento : lancamentoLegado.getListaControleLancamento()) {

			DadosBancariosDTO dadosBancarios = new DadosBancariosDTO();
			dadosBancarios.setAgencia(listaControleLancamento.getLancamentoContaCorrenteCliente()
					.getDadosDomicilioBancario().getNumeroAgencia());
			dadosBancarios.setNomeBanco(listaControleLancamento.getNomeBanco());
			dadosBancarios.setContaCorrente(listaControleLancamento.getLancamentoContaCorrenteCliente()
					.getDadosDomicilioBancario().getNumeroContaCorrente());

			ExtratoDTO extrato = new ExtratoDTO();
			extrato.setDataLancamento(listaControleLancamento.getDataLancamentoContaCorrenteCliente());
			extrato.setDescricao(listaControleLancamento.getDescricaoGrupoPagamento());
			extrato.setNumero(listaControleLancamento.getNumeroEvento());
			extrato.setSituacao(listaControleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
			extrato.setDataConfirmacao(listaControleLancamento.getDataEfetivaLancamento());
			extrato.setDadosBancarios(dadosBancarios);
			extrato.setValorFinal(listaControleLancamento.getValorLancamentoRemessa());

			listaExtrato.add(extrato);
		}

		return listaExtrato;
	}

}
