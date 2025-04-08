/**
 *Crie uma classe que represente um medicamento em uma farmácia. O medicamento possui um nome,
princípio ativo e preço de custo. Em seguida construa os seguintes métodos:
* Método para criar um medicamento informando todos os seus dados; (get e set)
* Método para criar um medicamento informando somente o nome do medicamento e o preço de
custo. Neste caso o princípio ativo tem o mesmo nome do medicamento.
* Método para calcular o preço de venda de um medicamento. Para isso receber como argumento o
percentual de lucro da farmácia e aplicar ao preço de custo do medicamento.
* Método para calcular o preço de venda de um medicamento considerando um lucro de 30%.
 */
public class Medicamento
{
    private String nome;
    private String principioAtivo;
    float precoCusto;
  
    public Medicamento(String nome, String principioAtivo, float precoCusto)
    {
       this.nome = nome;
       this.principioAtivo = principioAtivo;
       this.precoCusto = precoCusto;
    }
    
    
      public float precoVenda (int porcentual){
        //float precoVenda;
        //precoVenda = this.precoCusto + (this.precoCusto * (porcentual/100));  
        //System.out.println ("O preco de venda é igual a:" + precoVenda);
        //outra opçao abaixo
        return this.precoCusto + (this.precoCusto * (porcentual/100)); 
    }
    
    public float precoVenda(){
        return this.precoVenda(30);
    }

    //criando outro construtor para um segundo metodo
    public Medicamento (String nome, float precoCusto){
        this(nome, nome, precoCusto); //usa o this sem o ponto
    }
    
    void setNome (String nome){
        this.nome = nome;
    }
    
    void setPrincipioAtivo (String principioAtivo){
        this.principioAtivo = principioAtivo;
    }
    
    void setPrecoCusto (float precoCusto){
        this.precoCusto = precoCusto;
    }
    
    String getNome (){
        return this.nome;
    }
    
    String getPrincipioAtivo(){
        return this.principioAtivo;
    }
    
    void getPrecoCusto(float custo){
        this.precoCusto = custo;
        System.out.println("Preço custo igual a : " + this.precoCusto);
    }
}