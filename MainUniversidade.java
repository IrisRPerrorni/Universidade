package Universidade;



import java.util.ArrayList;
import java.util.List;

public class MainUniversidade {
    public static void main(String[] args) {
        List<Funcionarios> funcionarios = new ArrayList<>();

        Professores professor1 = new Professores("José Bonifácio" , 100058742 , 152 , "Educação" , 5000.0 ,"Pos Graduação","Matemática" , 80 , 3);
        Professores professor2 = new Professores("Maria A Silva" , 123054472 , 157 , "Educação" , 3000.0 ,"Ens.Superior","Ingles" , 60 , 2);
        Professores professor3 = new Professores("Elis Chopenhar" , 1587898 , 159 , "Educação" , 2500.0 , "Magisterio" , "Arte" , 50 , 1);

        Coordenadores cordenador1 = new Coordenadores("Mariana de Souza" , 458741236 , 180 , "Educacão" , 7000.0 , "José Bonifácio , Maria A Silva");
        Coordenadores cordenador2 = new Coordenadores("Heitor dos Santos" , 854789236 , 182 , "Educacão" , 6000.0 , "Elis Chopenhar");

        FuncionariosAdm funcionariosAdm1 = new FuncionariosAdm("Emanoel" , 158964753 , 198 , "Administrativa" , 2000.0 , " Almoxarife " , "Nivel 2" );

        funcionarios.add(professor2);
        funcionarios.add(professor3);

        funcionarios.add(cordenador1);
        funcionarios.add(cordenador2);

        funcionarios.add(funcionariosAdm1);

        for (Funcionarios listar: funcionarios) {
            System.out.println(listar);

        }
        System.out.println("\n____________________Cálculo aumento Salário____________\n");
        System.out.println(" O salario do " + professor1.getNome() + " após o reajuste é R$: "
                + professor1.aumentoSalario());
        System.out.println(" O salario do " + professor2.getNome() + " após o reajuste é R$: "
                + professor2.aumentoSalario());
        System.out.println(" O salario do " + professor3.getNome() + " após o reajuste é R$: "
                + professor3.aumentoSalario());
        System.out.println(" O salario do " + cordenador1.getNome() + " após o reajuste é R$: "
                + cordenador1.aumentoSalario());
        System.out.println(" O salario do " + cordenador2.getNome() + " após o reajuste é R$: "
                + cordenador2.aumentoSalario());
        System.out.println(" O salario do " + funcionariosAdm1.getNome() + " após o reajuste é R$: "
                + funcionariosAdm1.aumentoSalario());

        System.out.println("_____________teste adiciona turma_________");
        professor1.adicionaTurma();

        System.out.println("_____________teste adiciona professor_________");
        cordenador2.adicionaProfessor();

        System.out.println("\n_____________teste adicionar nome turma _________\n");


        Turma turma1 = new Turma("2°anoB" ,30 );
        professor1.adicionarTurma(turma1);
        professor1.imprimirTurma();




    }
}
