package Universidade;

import java.util.List;
import java.util.Scanner;

public class Coordenadores extends Funcionarios {

    private String ProfessoresSupervisionados;
    private List<Professores> professoresList;


    public Coordenadores(String nome, int cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, String professoresSupervisionados) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        ProfessoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public double aumentoSalario() {
        return (getSalario()*0.05+getSalario());
    }
    void adicionaProfessor() {
        System.out.println("Insira o professor que quer adicionar no cordenador 2: ");
        String prof = new Scanner(System.in).nextLine();
        System.out.println(prof);
    }

    public String getProfessoresSupervisionados() {
        return ProfessoresSupervisionados;
    }

    public void setProfessoresSupervisionados(String professoresSupervisionados) {
        ProfessoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public String toString() {
        return "Função Coordenadores{" + " Nome: " + getNome() + " \' CPF: " + getCpf() + " \' N° de Registro: "
                + getNumeroDeRegistro()
                + " \''Orgão de Lotação: " + getOrgaoDeLotacao() + " \' Salario: " + getSalario() +
                " \' Professores Supervisionados:" + ProfessoresSupervisionados + '\'' +
                '}';
    }
}
