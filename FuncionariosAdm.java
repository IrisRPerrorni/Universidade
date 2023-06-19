package Universidade;

public  class FuncionariosAdm extends Funcionarios {

    String funcaoAdm;
    String senioridade;

    public FuncionariosAdm(String nome, int cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    @Override
    public double aumentoSalario() {
        return (getSalario()*0.1+getSalario());
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public String toString() {
        return "Função Funcionarios Administrativos {" + " Nome: " + getNome() + " \' CPF: " + getCpf()
                + " \' N° de Registro: " + getNumeroDeRegistro()
                + "\''Orgão de Lotação: " + getOrgaoDeLotacao() + "\' Salario: " + getSalario() +
                "Função Administrativa:" + funcaoAdm +
                " \' senioridade: " + senioridade + '\'' +
                '}';
    }
}


