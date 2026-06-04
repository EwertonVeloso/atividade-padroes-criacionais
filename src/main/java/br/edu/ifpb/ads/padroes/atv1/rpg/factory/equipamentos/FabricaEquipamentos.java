package br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos;

import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Armadura;

public interface FabricaEquipamentos {
    Arma criarArma();
    Armadura criarArmadura();
}
