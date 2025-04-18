
/**
 * Escreva uma descrição da classe Livros aqui.
 * 
 * @author (Cibele Vale) 
 * @version (31/03/25)
 * questao 2 (ate a parte 2)
 */
public class Livro
{
   String nome, autor;
   int ano, edicao;
   float preco;
   
   public Livro(int ano, int edicao, String nome, String autor, float preco){
    this.nome = nome;
    this.autor = autor;
    this.ano = ano;
    this.edicao= edicao;
    this.preco = preco;
    }
   
   void calculaVenda(float porcentual){
        float precoFinal = this.preco + (this.preco * porcentual/100);
        System.out.println("Preço final do produto: " + precoFinal);
    }
    
    
     void imprimeLivros(float porcentual){
        System.out.println("Nome do livro: " + this.nome);
        System.out.println("Nome do autor: " + this.autor);
        System.out.println("Ano lancamento do livro: " + this.ano);
        System.out.println("Nº Edição do livro: " + this.edicao);
        this.calculaVenda(porcentual);
    }
}
