package br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.elfos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.FabricaPersonagem;

public class FabricaPersonagemElfoMago extends FabricaPersonagem {

    public FabricaPersonagemElfoMago(FabricaEquipamentos fabricaEquipamentos) {
        super(fabricaEquipamentos);
    }

    @Override
    protected Personagem montarPersonagemBase(String nome) {
        return new PersonagemBuilder()
                .nome(nome)
                .raca("Elfo")
                .classe("Mago")
                .forca(4)
                .inteligencia(20)
                .agilidade(14)
                .vida(70)
                .mana(180)
                .arma(fabricaEquipamentos.criarArma())
                .armadura(fabricaEquipamentos.criarArmadura())
                .habilidades("Magia da Natureza", "Teleporte").build();
    }
}

