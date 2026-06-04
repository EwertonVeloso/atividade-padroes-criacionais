package br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.orcs;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.FabricaPersonagem;

public class FabricaPersonagemOrcGuerreiro extends FabricaPersonagem {

    public FabricaPersonagemOrcGuerreiro(FabricaEquipamentos fabricaEquipamentos) {
        super(fabricaEquipamentos);
    }

    @Override
    protected Personagem montarPersonagemBase(String nome) {
        return new PersonagemBuilder()
                .nome(nome)
                .raca("Orc")
                .classe("Guerreiro")
                .forca(20)
                .inteligencia(6)
                .agilidade(8)
                .vida(150)
                .mana(20)
                .arma(fabricaEquipamentos.criarArma())
                .armadura(fabricaEquipamentos.criarArmadura())
                .habilidades("Fúria", "Pancada Devastadora").build();
    }
}

