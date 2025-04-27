
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
    private String nome;
    private int codigo;
    private int duracaoCurso;
    private float valorTotal;
    private int anoCriacao;
    
    //Criação de um curso com todos os dados necessários;
    public Curso(String nome, int codigo, int duracaoCurso, float valorTotal, int anoCriacao)
    {
        this.nome = nome;
        this.codigo = codigo;
        this.duracaoCurso = duracaoCurso;
        this.valorTotal = valorTotal;
        this.anoCriacao = anoCriacao;
    }
    
    //Criação de um curso sem informar a duração. Neste caso o default são 8 semestres;
    public Curso(String nome, int codigo,float valorTotal, int anoCriacao){
         this(nome, codigo, 8, valorTotal, anoCriacao);
    }

    //Metódo para calcular o valor da mensalidade de um aluno, considerando que o valor
    //é fíxo, ou seja, o valor total do curso pode ser pago em parcelas mensais.
     float calculaMensalidade (){
        int meses = this.duracaoCurso * 6;
        return this.valorTotal / meses;
    }

    public void setNome(String nome){this.nome = nome;}
    public void setCodigo(int codigo){this.codigo = codigo;}
    public void setDuracao(int duracao){this.duracao = duracao;}
    public void setAnoCriacao(int anoCriacao){this.anoCriacao = anoCriacao;}
    public void setValorTotal(float valorTotal){this.valorTotal=valorTotal;}
    
    public String getNome(){return this.nome;}
    public int getCodigo(){return this.codigo;}
    public int getDuracao(){return this.duracao;}
    public int getAnoCriacao(){return this.anoCriacao;}
    public float getValorTotal(){return this.valorTotal;}
    
}
