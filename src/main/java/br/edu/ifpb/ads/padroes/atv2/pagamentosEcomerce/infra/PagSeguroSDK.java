package br.edu.ifpb.ads.padroes.atv2.pagamentosEcomerce.infra;

public class PagSeguroSDK {
    public void processarPagamento(double valor){
        System.out.println("Processando pagamento de R$ " + valor + " via PagSeguro...");
    }
}
