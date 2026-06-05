package br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.config;

import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.core.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.infra.adapter.PagSeguroAdapter;
import com.google.inject.AbstractModule;

public class PagSeguroConfig extends AbstractModule {

    @Override
    protected void configure() {
       bind(PagamentoGateway.class)
                .to(PagSeguroAdapter.class);
    }
}
