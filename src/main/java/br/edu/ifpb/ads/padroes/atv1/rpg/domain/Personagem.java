package br.edu.ifpb.ads.padroes.atv1.rpg.domain;

public class Personagem implements Cloneable {

    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    protected Personagem() {}

    @Override
    public Personagem clone() {
        try {
            return (Personagem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Falha ao clonar personagem", e);
        }
    }

    // Getters e Setters básicos

    //Getters
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getClasse() {
        return classe;
    }

    public int getForca() {
        return forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public Arma getArma() {
        return arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) { this.raca = raca; }

    public void setClasse(String classe) { this.classe = classe; }

    public void setForca(int forca) { this.forca = forca; }

    public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }

    public void setAgilidade(int agilidade) { this.agilidade = agilidade; }

    public void setVida(int vida) { this.vida = vida; }

    public void setMana(int mana) { this.mana = mana; }

    public void setArma(Arma arma) { this.arma = arma; }

    public void setArmadura(Armadura armadura) { this.armadura = armadura; }

    public void setHabilidades(String[] habilidades) { this.habilidades = habilidades; }

    @Override
    public String toString() {
        return String.format("%s - %s %s (HP:%d, MP:%d) | Arma: %s | Armadura: %s",
                nome, raca, classe, vida, mana,
                arma != null ? arma.getNome() : "Nenhuma",
                armadura != null ? armadura.getNome() : "Nenhuma");
    }
}
