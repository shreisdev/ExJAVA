package ListaEx.Lq01;

public class folha {
    private int matricula;
    private String nome;
    private double salario;


    public folha(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
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

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public double calcularinss(double salario){

        return salario * 0.15;
    }


    public double salarioliquido(double salario){

        return salario - calcularinss(salario);
    }



    public void exibirContracheque() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println(String.format("Salário Bruto: %.2f", salario));
        System.out.println(String.format("Desconto INSS: %.2f", calcularinss(salario)));
        System.out.println(String.format("Salário Líquido: %.2f", salarioliquido(salario)));


    }
}
