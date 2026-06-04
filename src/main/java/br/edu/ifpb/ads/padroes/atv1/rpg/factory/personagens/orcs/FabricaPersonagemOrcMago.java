package br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.orcs;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.FabricaPersonagem;

public class FabricaPersonagemOrcMago extends FabricaPersonagem {

    public FabricaPersonagemOrcMago(FabricaEquipamentos fabricaEquipamentos) {
        super(fabricaEquipamentos);
    }

    @Override
    protected Personagem montarPersonagemBase(String nome) {
        return new PersonagemBuilder()
                .nome(nome)
                .raca("Orc")
                .classe("Mago")
                .forca(10)
                .inteligencia(14)
                .agilidade(6)
                .vida(100)
                .mana(120)
                .arma(fabricaEquipamentos.criarArma())
                .armadura(fabricaEquipamentos.criarArmadura())
                .habilidades("Magia Sombria", "Invocação").build();
    }
}

