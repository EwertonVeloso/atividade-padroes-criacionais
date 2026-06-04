package br.edu.ifpb.ads.padroes.atv1.rpg.service.impl;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.service.PersonagemEspecial;

public class EspecializadorHumanoGuerreiro implements PersonagemEspecial {
    @Override
    public Personagem especializar(Personagem base) {

        if (!base.getRaca().equals("Humano") || !base.getClasse().equals("Guerreiro")) {
            throw new IllegalArgumentException("Apenas Humanos Guerreiros podem se tornar o Lendário");
        }

        Personagem especial = base.clone();

        especial.setNome(base.getNome() + " o Lendário");
        especial.setForca(18);
        especial.setInteligencia(10);
        especial.setAgilidade(12);
        especial.setVida(140);
        especial.setMana(40);
        especial.setArma(new Arma("Excalibur", 35, "Espada"));
        especial.setArmadura(new Armadura("Armadura do Rei", 30, "Pesada"));
        especial.setHabilidades(new String[]{"Investida", "Bloqueio", "Liderança"});

        return especial;
    }
}
