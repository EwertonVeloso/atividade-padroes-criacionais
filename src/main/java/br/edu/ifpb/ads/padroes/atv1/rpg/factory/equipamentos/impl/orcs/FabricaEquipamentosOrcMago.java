package br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.orcs;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;

public class FabricaEquipamentosOrcMago implements FabricaEquipamentos {

    @Override
    public Arma criarArma() {
        return new Arma("Cajado Tribal", 12, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Xamânicas", 6, "Leve");
    }
}

