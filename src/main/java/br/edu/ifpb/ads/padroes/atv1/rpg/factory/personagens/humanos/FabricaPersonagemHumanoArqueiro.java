package br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.humanos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.FabricaPersonagem;

public class FabricaPersonagemHumanoArqueiro extends FabricaPersonagem {

    public FabricaPersonagemHumanoArqueiro(FabricaEquipamentos fabricaEquipamentos) {
        super(fabricaEquipamentos);
    }

    @Override
    protected Personagem montarPersonagemBase(String nome) {
        return new PersonagemBuilder()
                .nome(nome)
                .raca("Humano")
                .classe("Arqueiro")
                .forca(10)
                .inteligencia(12)
                .agilidade(16)
                .vida(100)
                .mana(70)
                .arma(fabricaEquipamentos.criarArma())
                .armadura(fabricaEquipamentos.criarArmadura())
                .habilidades("Tiro Certeiro", "Chuva de Flechas").build();
    }
}

