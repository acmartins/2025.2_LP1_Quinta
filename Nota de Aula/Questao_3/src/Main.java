 /*
    Para que este programa funcione será necessário a adição de uma referencia externa:
    - apache commons lang3
    Os arquivos necessários encontran-se na pasta principal do projeto:
    - commons-lang3-3.18.0-bin.zip
    - commons-lang3-3.18.0-src.zip
    sendo necessária a descompactação dos dois arquivos em um pasta da sua escolha.
    E logo após no INTELLIJ usar o atalho SHIFT-CTRL-ALT-S
    clicar em Project Settings \ Libraries
    clicar em mais (+) e selecionar a pasta onde você descompactou a bliblioteca
    clicar em apply
 */

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Filme> filmes = new ArrayList<>();

        int opcao;

        do {

            opcao = 0;

            System.out.println("\nSelecione o que Deseja fazer:");
            System.out.println("--------------------------------------");
            System.out.println("1 - Cadastrar um Filme");
            System.out.println("2 - Exibir os detalhes dos Filmes");
            System.out.println("3 - Avaliar o Filme");
            System.out.println("4 - Mostrar a média das avaliações");
            System.out.println("5 - Sair");
            System.out.println("--------------------------------------");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            if (opcao > 5) {
                System.out.println("Você digitou uma opção inválida. Redigite!");
            } else {

                if (opcao > 0) {

                    switch (opcao) {
                        case 1: // Exibir cadastrae filme

                            Filme filme = new Filme();

                            System.out.println("\n--------------------------------------------");
                            System.out.println("Informe os dados do filme");
                            System.out.println("--------------------------------------------");
                            System.out.println("Código do filme: " + (filmes.size() + 1));
                            System.out.print("Título: ");
                            filme.titulo = sc2.nextLine();
                            System.out.print("Gênero: ");
                            filme.setGenero(sc2.nextLine());
                            System.out.print("Ano de lançamento (9999): ");
                            filme.setAno(sc.nextInt());
                            System.out.print("Duração em minutos: ");
                            filme.setDuracao(sc.nextInt());

                            // adicionando o novo filme ao array()
                            filme.codigo = (filmes.size() + 1); // Auto-incremento no código do filme
                            filmes.add(filme);
                            break;
                        case 2: // Exibir os detalhes dos filmes
                            if (filmes.size() == 0) {
                                System.out.println("\n-------------------------------------------------------------------------");
                                System.out.println("Ainda não existem filmes cadastrados!. Cadastre um filme e tente novamente.");
                                System.out.println("---------------------------------------------------------------------------");
                            } else {
                                Filme exibefilme = new Filme();
                                exibefilme.exibirDetalhes(filmes);
                            }
                            break;
                        case 3: // Realizar a avaliação do filme

                            Filme avaliacao = new Filme();

                            System.out.println("\n------------------------------------------------------------------------------------");
                            System.out.println("Fazer a avaliação de um filme: ");
                            System.out.println("------------------------------------------------------------------------------------");

                            System.out.print("Código do filme: ");
                            int codigoFilme = sc.nextInt();

                            filme = filmes.get(codigoFilme-1);
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.print(" ");
                            System.out.print(StringUtils.leftPad(String.valueOf(filme.getCodigo()), 6, '0'));
                            System.out.print(" ");
                            System.out.print(StringUtils.rightPad(String.valueOf(filme.getTitulo()), 30, ' '));
                            System.out.print(" ");
                            System.out.print(StringUtils.rightPad(String.valueOf(filme.getGenero()), 20, ' '));
                            System.out.print(" ");
                            System.out.print(StringUtils.leftPad(String.valueOf(filme.getAno()), 4, '0'));
                            System.out.print("     ");
                            System.out.print(StringUtils.leftPad(String.valueOf(filme.getDuracao()), 3, '0'));
                            System.out.print(" ");
                            System.out.println(StringUtils.leftPad(String.valueOf(filme.calcularMediaAvaliacoes()), 2, ' '));
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.print("De (0 a 10) qual a sua avaliação para o filme?: ");
                            int notaAvaliacao = sc.nextInt();
                            System.out.println("------------------------------------------------------------------------------------");
                            // Ajustando notas e quantidade de avalições dos filmes
                            filmes.get(codigoFilme-1).avaliar(notaAvaliacao);
                            break;
                        case 4: // Mostrar a média das avaliações
                            if (filmes.size() == 0) {
                                System.out.println("\n-------------------------------------------------------------------------");
                                System.out.println("Ainda não existem filmes cadastrados!. Cadastre um filme e tente novamente.");
                                System.out.println("---------------------------------------------------------------------------");
                            } else {
                                Filme exibefilme = new Filme();
                                exibefilme.exibirMediaAvaliacoes(filmes);
                            }
                            break;
                    }

                }

            }

        } while (opcao != 5);

    }
}