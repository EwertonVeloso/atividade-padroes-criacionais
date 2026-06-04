package br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.orcs;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;

public class FabricaEquipamentosOrcGuerreiro implements FabricaEquipamentos {

    @Override
    public Arma criarArma() {
        return new Arma("Machado de Guerra", 30, "Machado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura Brutal", 25, "Pesada");
    }
}

