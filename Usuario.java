import java.util.ArrayList;

/**
 * Escreva uma descrição da classe Usuario aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Usuario
{
    private String nome, telefone,foto;
    private ArrayList<App> apps;
    
    public Usuario(String nome, String telefone, String foto){
        this.nome = nome;
        this.telefone = telefone;
        this.foto = foto;
        this.apps = new ArrayList<App>();
    }
    public float gasto(){
        float total = 0;
        for (App meuApp: apps)
           total+=meuApp.getPreco();
        return total;
    }
    public ArrayList<App> getListaApp(){
        return this.apps;
    }
    public void addApp(App app){
        apps.add(app);
    }
}
