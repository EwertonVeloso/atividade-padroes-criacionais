package br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.infra;

public class StripeSDK {

    public void processarPagamento(double valor){
        System.out.println("Processando pagamento de R$ " + valor + " via Stripe...");
    }
}
