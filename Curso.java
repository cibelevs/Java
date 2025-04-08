
/**
 *Um curso de uma faculdade é representado por um código, nome, 
 *duração (em semestres), valor total do curso e ano de criação
 *do curso. Construa uma classe curso com os seguintes métodos:
 *Criação de um curso com todos os dados necessários;
 *Criação de um curso sem informar a duração. Neste caso o default são 8 semestres;
 *Metódo para calcular o valor da mensalidade de um aluno, considerando que o valor
 *é fíxo, ou seja, o valor total do curso pode ser pago em parcelas mensais.
 */
public class Curso
{
    private int codigo;
    private int duracaoCurso;
    private float valorTotal;
    private int anoCriacao;
    
    //Criação de um curso com todos os dados necessários;
    public Curso(int codigo, int duracaoCurso, float valorTotal, int anoCriacao)
    {
        this.codigo = codigo;
        this.duracaoCurso = duracaoCurso;
        this.valorTotal = valorTotal;
        this.anoCriacao = anoCriacao;
    }
    
    //Criação de um curso sem informar a duração. Neste caso o default são 8 semestres;
    public Curso(int codigo,float valorTotal, int anoCriacao){
         this(codigo, 8, valorTotal, anoCriacao);
    }

    //Metódo para calcular o valor da mensalidade de um aluno, considerando que o valor
    //é fíxo, ou seja, o valor total do curso pode ser pago em parcelas mensais.
     float calculaMensalidade (){
        int meses = this.duracaoCurso * 6;
        return this.valorTotal / meses;
    }
    
}
