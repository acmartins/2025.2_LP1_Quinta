public class Funcionario {


    private int matricula;
    private String nome;
    private Double salarioBruto;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double calcularInss() {
        double INSS;
        INSS = (salarioBruto * 0.15);
        return INSS;
    }

    public Double  calcularSalarioLiquido() {
        return salarioBruto - calcularInss();
    }

    public void exibirContracheque(Funcionario funcionario) {

        System.out.println("----------------------------------------");
        System.out.println("             Contra-Cheque");
        System.out.println("----------------------------------------");
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("----------------------------------------");
        System.out.printf("Salário Bruto: %.2f%n", funcionario.getSalarioBruto());
        System.out.printf("PrevidÊncia: %.2f%n", funcionario.calcularInss());
        System.out.printf("Salário Líquido: %.2f%n", funcionario.calcularSalarioLiquido());
        System.out.println("----------------------------------------");

    }


}
