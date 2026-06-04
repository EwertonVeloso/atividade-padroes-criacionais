package br.edu.ifpb.ads.padroes.atv1.rpg.service;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;

public interface PersonagemEspecial {
    Personagem especializar(Personagem base);
}
