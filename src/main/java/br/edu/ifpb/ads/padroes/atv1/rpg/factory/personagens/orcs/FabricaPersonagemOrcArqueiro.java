package br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.orcs;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.FabricaPersonagem;

public class FabricaPersonagemOrcArqueiro extends FabricaPersonagem {

    public FabricaPersonagemOrcArqueiro(FabricaEquipamentos fabricaEquipamentos) {
        super(fabricaEquipamentos);
    }

    @Override
    protected Personagem montarPersonagemBase(String nome) {
        return new PersonagemBuilder()
                .nome(nome)
                .raca("Orc")
                .classe("Arqueiro")
                .forca(14)
                .inteligencia(8)
                .agilidade(12)
                .vida(120)
                .mana(40)
                .arma(fabricaEquipamentos.criarArma())
                .armadura(fabricaEquipamentos.criarArmadura())
                .habilidades("Tiro Brutal", "Intimidação").build();
    }
}

