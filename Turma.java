package Universidade;

public class Turma {
    private String nomeTurma;
    private int qtoTurmaaluno;

    public Turma(String nomeTurma, int qtoTurmaaluno) {
        this.nomeTurma = nomeTurma;
        this.qtoTurmaaluno = qtoTurmaaluno;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getQtoTurmaaluno() {
        return qtoTurmaaluno;
    }

    public void setQtoTurmaaluno(int qtoTurmaaluno) {
        this.qtoTurmaaluno = qtoTurmaaluno;
    }
}
