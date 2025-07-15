package exercicios_curso_java.arrays_listas.projetos.registro_funcionarios.application;

import exercicios_curso_java.arrays_listas.projetos.registro_funcionarios.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        int n;

        System.out.print("Quantos funcionários serão registrados?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.printf("Cadastro de Funcionário: #" + i + 1);

            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            listaDeFuncionarios.add(funcionario);

        }
    }
}
