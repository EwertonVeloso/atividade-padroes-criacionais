package br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.infra.adapter;

import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.infra.PagSeguroSDK;
import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.core.PagamentoGateway;

public class PagSeguroAdapter implements PagamentoGateway {

    @Override
    public void processar(double valor) {
        PagSeguroSDK api = new PagSeguroSDK();
        api.processarPagamento(valor);;
    }
}
