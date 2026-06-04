package br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;

public abstract class FabricaPersonagem {

    protected final FabricaEquipamentos fabricaEquipamentos;

    public FabricaPersonagem(FabricaEquipamentos fabricaEquipamentos) {
        this.fabricaEquipamentos = fabricaEquipamentos;
    }

    public Personagem criarPersonagem(String nome) {
        return montarPersonagemBase(nome);
    }

    protected abstract Personagem montarPersonagemBase(String nome);
}