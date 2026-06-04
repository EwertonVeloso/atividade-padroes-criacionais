package br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.humanos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.FabricaPersonagem;

public class FabricaPersonagemHumanoGuerreiro extends FabricaPersonagem {

    public FabricaPersonagemHumanoGuerreiro(FabricaEquipamentos fabricaEquipamentos) {
        super(fabricaEquipamentos);
    }

    @Override
    protected Personagem montarPersonagemBase(String nome) {
        return new PersonagemBuilder()
                .nome(nome)
                .raca("Humano")
                .classe("Guerreiro")
                .forca(15)
                .inteligencia(8)
                .agilidade(10)
                .vida(120)
                .mana(30)
                .arma(fabricaEquipamentos.criarArma())
                .armadura(fabricaEquipamentos.criarArmadura())
                .habilidades("Investida", "Bloqueio").build();
    }
}
