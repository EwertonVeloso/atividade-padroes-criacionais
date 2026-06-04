package br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.elfos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.FabricaPersonagem;

public class FabricaPersonagemElfoGuerreiro extends FabricaPersonagem {

    public FabricaPersonagemElfoGuerreiro(FabricaEquipamentos fabricaEquipamentos) {
        super(fabricaEquipamentos);
    }

    @Override
    protected Personagem montarPersonagemBase(String nome) {
        return new PersonagemBuilder()
                .nome(nome)
                .raca("Elfo")
                .classe("Guerreiro")
                .forca(12)
                .inteligencia(14)
                .agilidade(16)
                .vida(100)
                .mana(60)
                .arma(fabricaEquipamentos.criarArma())
                .armadura(fabricaEquipamentos.criarArmadura())
                .habilidades("Dança das Lâminas", "Agilidade Élfica").build();
    }
}

