import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Qual a matrícula do funcionário: ");
        funcionario.setMatricula(sc.nextInt());
        System.out.print("Qual o nome do funcionário: ");
        funcionario.setNome(sc2.nextLine());
        System.out.print("Qual o salário bruto do duncionário: ");
        funcionario.setSalarioBruto(sc.nextDouble());

        funcionario.exibirContracheque(funcionario);

    }
}