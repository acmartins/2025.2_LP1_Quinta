public class Vendedor {
    private String nome;
    private int matricula;

    // Construtores
    public Vendedor() {
    }

    public Vendedor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Get e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
