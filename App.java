import java.util.ArrayList;

/**
 * Escreva uma descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class App
{
    private String nome, objetivo;
    private int tamanho;
    private float preco;
    private ArrayList<Usuario> listaUsu;
    
    public App(String nome, String objetivo, int tamanho, float preco){
        this.nome = nome;
        this.objetivo = objetivo;
        this.preco = preco;
        listaUsu = new ArrayList<Usuario>();
    }

    public App(String nome, String objetivo, int tamanho){
        this(nome, objetivo, tamanho,0);
    }
    public void addUsuario(Usuario usu){
        listaUsu.add(usu);
    }
    public boolean substitui(App outro){
      return (this.objetivo.equals(outro.getObjetivo()) && this.preco>outro.getPreco()); 
    }
    public String getObjetivo(){
        return this.objetivo;
    }
    public float getPreco(){
        return this.preco;
    }
    public String getNome(){
        return this.getNome();
    }
    public ArrayList<Usuario> getListaUsu(){
        return this.listaUsu;
    }
}

