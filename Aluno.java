
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (Cibele Vale Sacramento) 
 * @version (31/03/2025)
 */
public class Aluno
{
    //declarando atributos
    int matricula, anoIngresso, nDisciplinas;
    String nome;
    String curso;
    
    //Método para criar um aluno com matricula, nome, ano de ingresso e curso.
    public Aluno(int matricula, int anoIngresso, int nDisciplinas, String nome, String curso)
    {
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
        this.nDisciplinas = nDisciplinas;
        this.nome = nome;
        this.curso = curso;
    }
    
    //- Método para calcular o tempo (em anos) de permanência do aluno na faculdade. 
    //Para isso receber como argumento o ano atual e calcular há quantos anos o aluno 
    //já está na faculdade considerando seu ano de ingresso.
    
    void calculaPermanencia(int anoAtual){
        int tempoNaFaculdade = anoAtual - this.anoIngresso;
        System.out.println("Tempo de estudo na faculdade:" +  tempoNaFaculdade);
    }

    //- Método para calcular a mensalidade do aluno considerando R$ 150,00 por disciplina matriculada.
    void calculaMensalidade(){
        float mensalidade = this.nDisciplinas * 150;
        System.out.println("Valor total da mensalidade: " + mensalidade);
    }
}
