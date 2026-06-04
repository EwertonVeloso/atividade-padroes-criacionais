package br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.humanos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.FabricaEquipamentos;

public class FabricaEquipamentosHumanoGuerreiro implements FabricaEquipamentos {
    @Override
    public Arma criarArma() {
        return new Arma("Espada de Ferro", 25, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Placas", 20, "Pesada");    }
}
