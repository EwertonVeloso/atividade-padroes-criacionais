package br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce;

import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.config.PagSeguroConfig;
import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.config.PayPalConfig;
import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.config.StripeConfig;
import br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.core.service.PagamentoService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ProcessaPagamentos {
    public static void main(String[] args) {

        Injector injetorPayPal = Guice.createInjector(new PayPalConfig());

        PagamentoService servico1 = injetorPayPal.getInstance(PagamentoService.class);
        servico1.pagar(150.50);

        Injector injetorStripe = Guice.createInjector(new StripeConfig());

        PagamentoService servico2 = injetorStripe.getInstance(PagamentoService.class);
        servico2.pagar(320.00);

        Injector injectorPagSeguro = Guice.createInjector(new PagSeguroConfig());

        PagamentoService servico3= injectorPagSeguro.getInstance(PagamentoService.class);
        servico3.pagar(500.00);
    }
}
