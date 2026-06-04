package br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.elfos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;

public class FabricaEquipamentosElfoGuerreiro implements FabricaEquipamentos {

    @Override
    public Arma criarArma() {
        return new Arma("Lâmina Élfica", 22, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Cota de Malha Élfica", 15, "Média");
    }
}



