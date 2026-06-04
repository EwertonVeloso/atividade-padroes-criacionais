package br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.elfos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;

public class FabricaEquipamentosElfoMago implements FabricaEquipamentos {
    @Override
    public Arma criarArma() {
        return new Arma("Cajado da Natureza", 18, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Mantos Élficos", 10, "Leve");
    }

}
