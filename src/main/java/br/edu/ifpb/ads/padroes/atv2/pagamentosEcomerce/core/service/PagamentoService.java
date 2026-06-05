package br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.core.service;

import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.core.PagamentoGateway;
import com.google.inject.Inject;

public class PagamentoService {

    private final PagamentoGateway pagamentoGateway;

    @Inject
    public PagamentoService(PagamentoGateway pagamentoGateway) {
        this.pagamentoGateway = pagamentoGateway;
    }

    public void pagar(double valor){
        pagamentoGateway.processar(valor);
        System.out.println("Pagamento de R$ " + valor + " realizado com sucesso!");
    }
}
