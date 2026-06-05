package br.edu.ifpb.ads.padroes.atv1.rpg.app.CLI;

import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;
import br.edu.ifpb.ads.padroes.atv1.rpg.domain.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.personagens.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.provider.FabricaPersonagemProvider;
import br.edu.ifpb.ads.padroes.atv1.rpg.service.PersonagemEspecial;
import br.edu.ifpb.ads.padroes.atv1.rpg.service.impl.EspecializadorHumanoGuerreiro;

import java.util.Optional;
import java.util.Scanner;

public class CriadorHeroisRpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("   BEM-VINDO AO CRIADOR DE HERÓIS RPG    ");
        System.out.println("=========================================\n");

        System.out.println("\nEscolha a dificuldade do jogo: ");
        System.out.println("1 - Fácil\n2 - Médio\n3 - Difícil");
        System.out.print("Opção: ");
        ConfiguracaoJogo.getInstancia().setNivelDificuldade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("\nDigite o nome do seu personagem: ");
        String nome = scanner.nextLine();

        System.out.println("\nEscolha a Raça:");
        System.out.println("1 - Humano\n2 - Elfo\n3 - Orc");
        System.out.print("Opção: ");
        int opcaoRaca = scanner.nextInt();

        System.out.println("\nEscolha a Classe:");
        System.out.println("1 - Guerreiro\n2 - Mago\n3 - Arqueiro");
        System.out.print("Opção: ");
        int opcaoClasse = scanner.nextInt();

        Optional<FabricaPersonagem> fabricaOpt = FabricaPersonagemProvider.obterFabrica(opcaoRaca, opcaoClasse);

        if (fabricaOpt.isEmpty()) {
            System.out.println("\n[ERRO] Combinação inválida de menu. Encerrando programa.");
            scanner.close();
            return;
        }

        Personagem personagemCriado = fabricaOpt.get().criarPersonagem(nome);

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
