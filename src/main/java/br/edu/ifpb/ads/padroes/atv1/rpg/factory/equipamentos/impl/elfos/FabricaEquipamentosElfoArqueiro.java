package br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.elfos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;

public class FabricaEquipamentosElfoArqueiro implements FabricaEquipamentos {
    @Override
    public Arma criarArma() {
        return new Arma("Arco Longo Élfico", 22, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro Élfico", 14, "Média");
    }
}
