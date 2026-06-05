package br.edu.ifpb.ads.padroes.atv1.rpg.app;

import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.elfos.FabricaEquipamentosElfoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.elfos.FabricaEquipamentosElfoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.elfos.FabricaEquipamentosElfoMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.humanos.FabricaEquipamentosHumanoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.humanos.FabricaEquipamentosHumanoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.humanos.FabricaEquipamentosHumanoMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.orcs.FabricaEquipamentosOrcArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.orcs.FabricaEquipamentosOrcGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.equipamentos.impl.orcs.FabricaEquipamentosOrcMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.elfos.FabricaPersonagemElfoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.elfos.FabricaPersonagemElfoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.elfos.FabricaPersonagemElfoMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.humanos.FabricaPersonagemHumanoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.humanos.FabricaPersonagemHumanoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.humanos.FabricaPersonagemHumanoMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.orcs.FabricaPersonagemOrcArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.orcs.FabricaPersonagemOrcGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.orcs.FabricaPersonagemOrcMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.service.PersonagemEspecial;
import br.edu.ifpb.ads.padroes.atv1.rpg.service.impl.EspecializadorHumanoGuerreiro;

public class Main {

    public static void main(String[] args) {
        Personagem arthas = new FabricaPersonagemHumanoGuerreiro(
                new FabricaEquipamentosHumanoGuerreiro()).criarPersonagem("Arthas");

        Personagem jaina = new FabricaPersonagemHumanoMago(
                new FabricaEquipamentosHumanoMago()).criarPersonagem("Jaina");

        Personagem alleria = new FabricaPersonagemHumanoArqueiro(
                new FabricaEquipamentosHumanoArqueiro()).criarPersonagem("Alleria");

        Personagem thailon = new FabricaPersonagemElfoGuerreiro(
                new FabricaEquipamentosElfoGuerreiro()).criarPersonagem("Thalion");

        Personagem danhausen = new FabricaPersonagemElfoMago(
                new FabricaEquipamentosElfoMago()).criarPersonagem("Danhausen");

        Personagem luthien = new FabricaPersonagemElfoArqueiro(
                new FabricaEquipamentosElfoArqueiro()).criarPersonagem("Luthien");

        Personagem gorok = new FabricaPersonagemOrcGuerreiro(
                new FabricaEquipamentosOrcGuerreiro()).criarPersonagem("Gorok");

        Personagem zulgar = new FabricaPersonagemOrcMago(
                new FabricaEquipamentosOrcMago()).criarPersonagem("Zulgar");

        Personagem rokhan = new FabricaPersonagemOrcArqueiro(
                new FabricaEquipamentosOrcArqueiro()).criarPersonagem("Rokhan");

        imprimir(arthas);
        imprimir(jaina);
        imprimir(alleria);
        imprimir(thailon);
        imprimir(danhausen);
        imprimir(luthien);
        imprimir(gorok);
        imprimir(zulgar);
        imprimir(rokhan);

        // Testando configuração do jogo

        ConfiguracaoJogo config = ConfiguracaoJogo.getInstancia();
        config.setNivelDificuldade(3);
        System.out.println("--- CONFIGURAÇÕES DO JOGO ---");
        System.out.println("Nível de Dificuldade: " + config.getNivelDificuldade());
        System.out.println("Instância única confirmada? " +
                (config == ConfiguracaoJogo.getInstancia()));
        System.out.println();

        // Testando o Personagem Especial
        System.out.println("--- PERSONAGEM ESPECIAL ---");
        PersonagemEspecial especializador = new EspecializadorHumanoGuerreiro();

        Personagem Lendario = especializador.especializar(arthas); //Arthas é o humano guerreiro

        imprimir(Lendario);

        System.out.println("--- GARANTINDO QUE O ORIGINAL NÃO FOI ALTERADO (CLONE FUNCIONOU) ---");
        imprimir(arthas);
    }

    private static void imprimir(Personagem personagem) {
        System.out.println(personagem);
        if (personagem.getHabilidades() != null && personagem.getHabilidades().length > 0) {
            System.out.println("Habilidades: " + String.join(", ", personagem.getHabilidades()));
        }
        System.out.println();
    }
}

