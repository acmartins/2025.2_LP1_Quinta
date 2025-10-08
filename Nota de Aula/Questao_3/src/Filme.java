import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Filme {

    private String genero;
    private int ano;
    private int duracao;
    private int somaNotas;
    private int qtdAvaliacoes;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    int codigo;
    String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(int somaNotas) {
        this.somaNotas = somaNotas;
    }

    public int getQtdAvaliacoes() {
        return qtdAvaliacoes;
    }

    public void setQtdAvaliacoes(int qtdAvaliacoes) {
        this.qtdAvaliacoes += qtdAvaliacoes;
    }

    public void exibirDetalhes(ArrayList<Filme> listaFilmes) {

        if (listaFilmes.size() != 0) {

            System.out.println("\n------------------------------------------------------------------------------------");
            System.out.println("                            Detalhes dos filmes                                     ");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println(" Código Título                         Gênero               Ano  Duração Avaliação ");
            System.out.println("------------------------------------------------------------------------------------");

            int i = 0;
            int n = listaFilmes.size();
            for (i = 0; i < n; i++) {
                Filme listaFilme = listaFilmes.get(i);
                System.out.print(" ");
                System.out.print(StringUtils.leftPad(String.valueOf(listaFilme.codigo), 6, '0'));
                System.out.print(" ");
                System.out.print(StringUtils.rightPad(String.valueOf(listaFilme.titulo), 30, ' '));
                System.out.print(" ");
                System.out.print(StringUtils.rightPad(String.valueOf(listaFilme.genero), 20, ' '));
                System.out.print(" ");
                System.out.print(StringUtils.leftPad(String.valueOf(listaFilme.ano), 4, '0'));
                System.out.print("     ");
                System.out.print(StringUtils.leftPad(String.valueOf(listaFilme.duracao), 3, '0'));
                System.out.print(" ");
                System.out.println(StringUtils.leftPad(String.valueOf(listaFilme.calcularMediaAvaliacoes()), 2, ' '));
                // 123456 123456789012345678901234567890 12345678901234567890 9999 999     99         ");
            }

            System.out.println("------------------------------------------------------------------------------------");
        } else {
            System.out.println("\n------------------------------------------------------------------------------------");
            System.out.println(" Não existes filmes para exibir");
            System.out.println("------------------------------------------------------------------------------------");
        }
    }

    public void avaliar (int nota) {
        somaNotas += nota;
        qtdAvaliacoes++;
    }

    public int calcularMediaAvaliacoes() {
        if ((somaNotas == 0) || (qtdAvaliacoes == 0)) {
            return 0;
        } else {
            return (int) (somaNotas / qtdAvaliacoes);

        }

    }

    public void exibirMediaAvaliacoes(ArrayList<Filme> listaFilmes) {

        if (listaFilmes.size() != 0) {

            System.out.println("\n--------------------------------------");
            System.out.println("   Média das Avaliações dos filmes    ");
            System.out.println("--------------------------------------");
            System.out.println(" Título                         Média ");
            System.out.println("--------------------------------------");
            //                   123456789012345678901234567890 99

            int i = 0;
            int somaMediaNotas = 0;
            int n = listaFilmes.size();
            for (i = 0; i < n; i++) {
                Filme listaFilme = listaFilmes.get(i);
                System.out.print(" ");
                System.out.print(StringUtils.rightPad(String.valueOf(listaFilme.titulo), 30, ' '));
                System.out.print(" ");
                System.out.println(StringUtils.leftPad(String.valueOf(listaFilme.calcularMediaAvaliacoes()), 2, ' '));
                somaMediaNotas += listaFilme.calcularMediaAvaliacoes();
            }
            System.out.println("--------------------------------------");
            System.out.print(" Média geral..................: ");
            System.out.println(StringUtils.leftPad(String.valueOf(somaMediaNotas / i), 2, ' '));
            System.out.println("--------------------------------------");


        } else {
            System.out.println("\n--------------------------------------");
            System.out.println("    Não existes filmes para exibir");
            System.out.println("--------------------------------------");
        }
    }


}
