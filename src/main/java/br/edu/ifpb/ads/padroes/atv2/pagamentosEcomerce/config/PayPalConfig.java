package br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.config;

import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.core.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.infra.adapter.PayPalAdapter;
import com.google.inject.AbstractModule;

public class PayPalConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(PagamentoGateway.class)
                .to(PayPalAdapter.class);
    }
}
