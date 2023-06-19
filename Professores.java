package Universidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professores extends Funcionarios {
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int qtdAluno;
    private int qtdTurma;

    private List<Turma>listaturma;

    public Professores(String nome, int cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int qtdAluno, int qtdTurma) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAluno = qtdAluno;
        this.qtdTurma = qtdTurma;
        this.listaturma = new ArrayList<>();
    }

    @Override
    public double aumentoSalario() {
        return (getSalario()*0.1+getSalario());
    }
    void adicionaTurma(){
        System.out.println("Insira quantas turmas quer adicionar no professor 1: ");
        int turma = new Scanner(System.in).nextInt();
        this.qtdTurma = turma + this.qtdTurma;
        System.out.println("A quantidade de turma que o professor 1 tem  é: " + this.qtdTurma);

    }
    public void adicionarTurma(Turma turma) {
        listaturma.add(turma);
    }
    public void imprimirTurma() {
        for (Turma listar:listaturma) {
            System.out.println("O nome da turma é: " + listar.getNomeTurma() + "\nA quantidade de aluno nessa turma é: " + listar.getQtoTurmaaluno());

        }
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAluno() {
        return qtdAluno;
    }

    public void setQtdAluno(int qtdAluno) {
        this.qtdAluno = qtdAluno;
    }

    public int getQtdTurma() {
        return qtdTurma;
    }

    public void setQtdTurma(int qtdTurma) {
        this.qtdTurma = qtdTurma;
    }

    @Override
    public String toString() {
        return "Função Professor: {" +
                " Nome: " + getNome() + " \' CPF: " + getCpf() + " \' N° de Registro: " + getNumeroDeRegistro()
                + "\''Orgão de Lotação: " + getOrgaoDeLotacao() + "\' Salario: " + getSalario() +
                "Nivel De Graduacao: " + nivelDeGraduacao +
                " \' Disciplina Ministrada: " + disciplinaMinistrada +
                " \' Quantidade de aluno: " + qtdAluno +
                " \' Quantidade de Turma=" + qtdTurma +
                '}';
    }
}
