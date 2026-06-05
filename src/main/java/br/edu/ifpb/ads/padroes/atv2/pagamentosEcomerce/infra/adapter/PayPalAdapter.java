package br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.infra.adapter;

import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.infra.PayPalSDK;
import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.core.PagamentoGateway;

public class PayPalAdapter implements PagamentoGateway {

    @Override
    public void processar(double valor) {
        PayPalSDK api = new PayPalSDK();
        api.processarPagamento(valor);
    }
}
