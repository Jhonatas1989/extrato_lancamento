package br.com.cielo.extrato.lancamento.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import br.com.cielo.extrato.lancamento.exceptions.ArquivoNaoEncontradoException;
import br.com.cielo.extrato.lancamento.model.legado.LancamentoLegado;

/**
 * @author Jhonatas Oliveira
 *
 */
@Repository
public class ExtratoDAO {
	
	public static final String CAMINHO_LANCAMENTO_CONTA_LEGADO_JSON = "src\\main\\resources\\lancamento-conta-legado.json";

	/**
	 * @return
	 * @throws ArquivoNaoEncontradoException
	 */
	public LancamentoLegado loadExtratoFromJSONGson() throws ArquivoNaoEncontradoException {
		Gson gson = new Gson();
		BufferedReader br;
		LancamentoLegado lancamentoLegado = null;
		try {
			br = new BufferedReader(new FileReader(CAMINHO_LANCAMENTO_CONTA_LEGADO_JSON));
			lancamentoLegado = gson.fromJson(br, LancamentoLegado.class);
		} catch (FileNotFoundException e) {
			throw new ArquivoNaoEncontradoException("O arquivo json não foi encontrado.");
		}
		return lancamentoLegado;
	}
	
}
