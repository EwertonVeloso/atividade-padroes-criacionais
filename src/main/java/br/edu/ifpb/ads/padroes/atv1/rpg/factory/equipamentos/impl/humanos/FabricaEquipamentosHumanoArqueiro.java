package br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.humanos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;

public class FabricaEquipamentosHumanoArqueiro implements FabricaEquipamentos {
    @Override
    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12, "Média");
    }
}
