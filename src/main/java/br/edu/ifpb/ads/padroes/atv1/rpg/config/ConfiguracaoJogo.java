package br.edu.ifpb.ads.padroes.atv1.rpg.config;

public class ConfiguracaoJogo {

    private static ConfiguracaoJogo configuracaoJogo;
    private int nivelDificuldade;

    public static synchronized ConfiguracaoJogo getInstancia() {
        if (configuracaoJogo == null) {
            configuracaoJogo = new ConfiguracaoJogo();
        }
        return configuracaoJogo;
    }

    private ConfiguracaoJogo() {
        this.nivelDificuldade = 1;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivel) {
        this.nivelDificuldade = nivel;
    }

}
