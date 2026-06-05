package br.edu.ifpb.ads.padroes.atv1.rpg.factory.provider;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.elfos.FabricaEquipamentosElfoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.elfos.FabricaEquipamentosElfoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.elfos.FabricaEquipamentosElfoMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.humanos.FabricaEquipamentosHumanoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.humanos.FabricaEquipamentosHumanoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.humanos.FabricaEquipamentosHumanoMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.orcs.FabricaEquipamentosOrcArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.orcs.FabricaEquipamentosOrcGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.orcs.FabricaEquipamentosOrcMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.elfos.FabricaPersonagemElfoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.elfos.FabricaPersonagemElfoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.elfos.FabricaPersonagemElfoMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.humanos.FabricaPersonagemHumanoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.humanos.FabricaPersonagemHumanoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.humanos.FabricaPersonagemHumanoMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.orcs.FabricaPersonagemOrcArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.orcs.FabricaPersonagemOrcGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.orcs.FabricaPersonagemOrcMago;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class FabricaPersonagemProvider {

    private static final Map<String, Supplier<FabricaPersonagem>> REGISTRO = new HashMap<>();

    static {
        REGISTRO.put("1-1", () -> new FabricaPersonagemHumanoGuerreiro(new FabricaEquipamentosHumanoGuerreiro()));
        REGISTRO.put("1-2", () -> new FabricaPersonagemHumanoMago(new FabricaEquipamentosHumanoMago()));
        REGISTRO.put("1-3", () -> new FabricaPersonagemHumanoArqueiro(new FabricaEquipamentosHumanoArqueiro()));

        REGISTRO.put("2-1", () -> new FabricaPersonagemElfoGuerreiro(new FabricaEquipamentosElfoGuerreiro()));
        REGISTRO.put("2-2", () -> new FabricaPersonagemElfoMago(new FabricaEquipamentosElfoMago()));
        REGISTRO.put("2-3", () -> new FabricaPersonagemElfoArqueiro(new FabricaEquipamentosElfoArqueiro()));

        REGISTRO.put("3-1", () -> new FabricaPersonagemOrcGuerreiro(new FabricaEquipamentosOrcGuerreiro()));
        REGISTRO.put("3-2", () -> new FabricaPersonagemOrcMago(new FabricaEquipamentosOrcMago()));
        REGISTRO.put("3-3", () -> new FabricaPersonagemOrcArqueiro(new FabricaEquipamentosOrcArqueiro()));
    }

    public static Optional<FabricaPersonagem> obterFabrica(int raca, int classe) {
        String chave = raca + "-" + classe;
        Supplier<FabricaPersonagem> fabricaSupplier = REGISTRO.get(chave);

        if (fabricaSupplier != null) {
            return Optional.of(fabricaSupplier.get());
        }
        return Optional.empty();
    }
}
