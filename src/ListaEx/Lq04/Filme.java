package ListaEx.Lq04;

public class Filme {

    protected String nome;
    protected String genero;
    protected int ano;
    protected int duracao;
    protected double somaNotas;
    protected int qtdAvaliacoes;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public double getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(double somaNotas) {
        this.somaNotas = somaNotas;
    }

    public int getQtdAvaliacoes() {
        return qtdAvaliacoes;
    }

    public void setQtdAvaliacoes(int qtdAvaliacoes) {
        this.qtdAvaliacoes = qtdAvaliacoes;
    }

    public Filme() {
    }

    public Filme(String nome, String genero, int ano, int duracao, double somaNotas, int qtdAvaliacoes) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.somaNotas = somaNotas;
        this.qtdAvaliacoes = qtdAvaliacoes;
    }


    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + duracao + " minutos");
    }

public void avaliar(int nota) {
    if (nota >= 0 && nota <= 10) {
        somaNotas += nota;
        qtdAvaliacoes++;
        System.out.println("Sua Avaliação foi registrada com sucesso!");
    } else {
        System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
    }
}
    public void CalcularMedia() {
        if (qtdAvaliacoes > 0) {
            double media = somaNotas / qtdAvaliacoes;
            System.out.println("Média de Avaliações: " + media);
        } else {
            System.out.println("Nenhuma avaliação registrada ainda.");
        }
    }
}
