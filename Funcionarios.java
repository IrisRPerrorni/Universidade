package Universidade;

public abstract class  Funcionarios {
    private String nome;
    private int cpf;
    private int numeroDeRegistro;
    private String orgaoDeLotacao;
    private double salario ;

    public Funcionarios(String nome, int cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }

    public abstract double aumentoSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", CPF=" + cpf +
                ", Numero De Registro=" + numeroDeRegistro +
                ", Orgao De Lotacao='" + orgaoDeLotacao + '\'' +
                ", Salario=" + salario +
                '}';
    }
}
