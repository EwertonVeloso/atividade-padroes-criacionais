package br.edu.ifpb.ads.padroes.atv1.rpg;

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
import br.edu.ifpb.ads.padroes.atv1.rpg.service.PersonagemEspecial;
import br.edu.ifpb.ads.padroes.atv1.rpg.service.impl.EspecializadorHumanoGuerreiro;

import java.util.Scanner;


public class CriadorHeroisRpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("   BEM-VINDO AO CRIADOR DE HERÓIS RPG    ");
        System.out.println("=========================================\n");

        System.out.println("\nEscolha a dificuldade do jogo: ");
        System.out.println("1 - Fácil");
        System.out.println("2 - Médio");
        System.out.println("3 - Difícil");
        System.out.print("Opção: ");

        int nivelDificuldade = scanner.nextInt();
        ConfiguracaoJogo.getInstancia().setNivelDificuldade(nivelDificuldade);
        scanner.nextLine();

        System.out.print("\nDigite o nome do seu personagem: ");
        String nome = scanner.nextLine();

        System.out.println("\nEscolha a Raça:");
        System.out.println("1 - Humano");
        System.out.println("2 - Elfo");
        System.out.println("3 - Orc");
        System.out.print("Opção: ");
        int opcaoRaca = scanner.nextInt();

        System.out.println("\nEscolha a Classe:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        System.out.print("Opção: ");
        int opcaoClasse = scanner.nextInt();

        FabricaPersonagem fabricaEscolhida = null;

        if (opcaoRaca == 1) { // HUMANO
            if (opcaoClasse == 1) fabricaEscolhida = new FabricaPersonagemHumanoGuerreiro(new FabricaEquipamentosHumanoGuerreiro());
            else if (opcaoClasse == 2) fabricaEscolhida = new FabricaPersonagemHumanoMago(new FabricaEquipamentosHumanoMago());
            else if (opcaoClasse == 3) fabricaEscolhida = new FabricaPersonagemHumanoArqueiro(new FabricaEquipamentosHumanoArqueiro());

        } else if (opcaoRaca == 2) { // ELFO
            if (opcaoClasse == 1) fabricaEscolhida = new FabricaPersonagemElfoGuerreiro(new FabricaEquipamentosElfoGuerreiro());
            else if (opcaoClasse == 2) fabricaEscolhida = new FabricaPersonagemElfoMago(new FabricaEquipamentosElfoMago());
            else if (opcaoClasse == 3) fabricaEscolhida = new FabricaPersonagemElfoArqueiro(new FabricaEquipamentosElfoArqueiro());

        } else if (opcaoRaca == 3) { // ORC
            if (opcaoClasse == 1) fabricaEscolhida = new FabricaPersonagemOrcGuerreiro(new FabricaEquipamentosOrcGuerreiro());
            else if (opcaoClasse == 2) fabricaEscolhida = new FabricaPersonagemOrcMago(new FabricaEquipamentosOrcMago());
            else if (opcaoClasse == 3) fabricaEscolhida = new FabricaPersonagemOrcArqueiro(new FabricaEquipamentosOrcArqueiro());
        }

        if (fabricaEscolhida == null) {
            System.out.println("\n[ERRO] Combinação inválida de menu. Encerrando programa.");
            scanner.close();
            return;
        }

        Personagem personagemCriado = fabricaEscolhida.criarPersonagem(nome);

        System.out.println("\n=========================================");
        System.out.println("       PERSONAGEM CRIADO COM SUCESSO!      ");
        System.out.println("=========================================");
        imprimir(personagemCriado);

        if (opcaoRaca == 1 && opcaoClasse == 1) {
            System.out.println("-----------------------------------------");
            System.out.println("Uma aura misteriosa envolve seu personagem...");
            System.out.print("Deseja despertar o poder LENDÁRIO? (S/N): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("S")) {
                PersonagemEspecial especializador = new EspecializadorHumanoGuerreiro();
                Personagem lendario = especializador.especializar(personagemCriado);

                System.out.println("\n*** DESPERTAR CONCLUÍDO ***");
                imprimir(lendario);
            }
        }

        System.out.println("\nBom jogo!");
        scanner.close();
    }

    private static void imprimir(Personagem personagem) {
        System.out.println(personagem);
        if (personagem.getHabilidades() != null && personagem.getHabilidades().length > 0) {
            System.out.println("Habilidades: " + String.join(", ", personagem.getHabilidades()));
        }
    }
}

