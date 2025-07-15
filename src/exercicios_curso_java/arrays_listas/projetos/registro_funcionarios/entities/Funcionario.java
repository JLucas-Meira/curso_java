package exercicios_curso_java.arrays_listas.projetos.registro_funcionarios.entities;

public class Funcionario {

    private final int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", nome: " + nome + ", salário: R$ " + String.format("%.2f" + salario);
    }
}
