package br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.elfos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.FabricaPersonagem;

public class FabricaPersonagemElfoArqueiro extends FabricaPersonagem {

    public FabricaPersonagemElfoArqueiro(FabricaEquipamentos fabricaEquipamentos) {
        super(fabricaEquipamentos);
    }

    @Override
    protected Personagem montarPersonagemBase(String nome) {
        return new PersonagemBuilder()
                .nome(nome)
                .raca("Elfo")
                .classe("Arqueiro")
                .forca(8)
                .inteligencia(16)
                .agilidade(20)
                .vida(90)
                .mana(100)
                .arma(fabricaEquipamentos.criarArma())
                .armadura(fabricaEquipamentos.criarArmadura())
                .habilidades("Tiro Múltiplo", "Camuflagem").build();
    }
}

