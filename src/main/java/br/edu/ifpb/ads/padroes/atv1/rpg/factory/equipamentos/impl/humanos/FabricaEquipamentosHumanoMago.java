package br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.humanos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;

public class FabricaEquipamentosHumanoMago implements FabricaEquipamentos {

    @Override
    public Arma criarArma() {
        return new Arma("Cajado Mágico", 15, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Mágicas", 8, "Leve");
    }

}
