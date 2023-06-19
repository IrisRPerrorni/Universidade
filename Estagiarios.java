package Universidade;

public class Estagiarios extends Professores {
    System vinculadoAoProfessor;

    public Estagiarios(String nome, int cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario,
                       String nivelDeGraduacao, String disciplinaMinistrada, int qtdAluno, int qtdTurma,
                       System vinculadoAoProfessor) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario, nivelDeGraduacao, disciplinaMinistrada, qtdAluno, qtdTurma);
        this.vinculadoAoProfessor = vinculadoAoProfessor;
    }
    public void reembolsoDespesas(){

    }
}
