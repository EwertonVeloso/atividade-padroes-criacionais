package br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.orcs;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;

public class FabricaEquipamentosOrcArqueiro implements FabricaEquipamentos {

    @Override
    public Arma criarArma() {
        return new Arma("Arco de Osso", 24, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Couro de Besta", 16, "Média");
    }
}

