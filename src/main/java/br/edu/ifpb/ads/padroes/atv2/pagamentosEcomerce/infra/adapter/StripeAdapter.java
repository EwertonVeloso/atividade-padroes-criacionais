package br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.infra.adapter;

import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.infra.StripeSDK;
import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.core.PagamentoGateway;

public class StripeAdapter implements PagamentoGateway {

    @Override
    public void processar(double valor) {
       StripeSDK api = new StripeSDK();
       api.processarPagamento(valor);
    }
}
