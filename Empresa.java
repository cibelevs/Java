import java.util.ArrayList;

/**
 * Escreva uma descrição da classe Empresa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Empresa
{
    private String nome;
    private ArrayList<App> appsEmp;
    private ArrayList<Usuario> usuEmp;
    
    public Empresa(String nome){
        this.nome = nome;
        appsEmp = new ArrayList<App>();
        usuEmp = new ArrayList<Usuario>();
    }
    public String maisUsuarios(){
        int maior=0;
        String nomeMaior = null;
        for (App umApp: appsEmp)
           if (maior < umApp.getListaUsu().size()){
              maior = umApp.getListaUsu().size();
              nomeMaior = umApp.getNome();
            }
        return nomeMaior;
    }
    
    public boolean diminuirConta(Usuario usu){
        //pega a lista de apps do usuario
        for (App appUsu: usu.getListaApp())
            //para cada app do usuario, verifica se existe algum app da empresa que possa ser substituido
            //pega todos os apps da empresa para porder verificar
            for (App appEmp: this.appsEmp)
               if (appUsu.substitui(appEmp))
                  return true;
        return false;          
    }
    public void addUsuario(Usuario usu){
        usuEmp.add(usu);
    }
    public void addApp(App app){
        appsEmp.add(app);
    }
}
