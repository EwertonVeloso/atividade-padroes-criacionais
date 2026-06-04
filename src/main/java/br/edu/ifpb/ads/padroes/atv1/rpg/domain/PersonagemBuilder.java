package br.edu.ifpb.ads.padroes.atv1.rpg.domain;

public class PersonagemBuilder {

    private final Personagem personagem;

    public PersonagemBuilder() {
        this.personagem = new Personagem();
    }

    public PersonagemBuilder nome(String nome) {
        personagem.setNome(nome);
        return this;
    }

    public PersonagemBuilder raca(String raca) {
        personagem.setRaca(raca);
        return this;
    }

    public PersonagemBuilder classe(String classe) {
        personagem.setClasse(classe);
        return this;
    }

    public PersonagemBuilder forca(int forca) {
        personagem.setForca(forca);
        return this;
    }

    public PersonagemBuilder inteligencia(int inteligencia) {
        personagem.setInteligencia(inteligencia);
        return this;
    }

    public PersonagemBuilder agilidade(int agilidade) {
        personagem.setAgilidade(agilidade);
        return this;
    }

    public PersonagemBuilder vida(int vida) {
        personagem.setVida(vida);
        return this;
    }

    public PersonagemBuilder mana(int mana) {
        personagem.setMana(mana);
        return this;
    }

    public PersonagemBuilder arma(Arma arma) {
        personagem.setArma(arma);
        return this;
    }

    public PersonagemBuilder armadura(Armadura armadura) {
        personagem.setArmadura(armadura);
        return this;
    }

    public PersonagemBuilder habilidades(String... habilidades) {
        personagem.setHabilidades(habilidades);
        return this;
    }

    public Personagem build() {
        if (personagem.getNome() == null) throw new IllegalStateException("Nome é obrigatório");
        return personagem;
    }
}