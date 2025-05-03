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



Considere o seguinte cenário e responda às questões:

A empresa FitLife está desenvolvendo um sistema para gerenciamento de academias e alunos. A empresa administra várias unidades de academia, e cada unidade possui vários alunos matriculados. Cada aluno possui um nome, um CPF, e uma data de matrícula.

As academias oferecem planos de treino, e cada plano de treino possui um nome, uma duração (em semanas), uma intensidade (leve, moderada ou intensa) e um custo mensal. Cada aluno pode estar inscrito em um ou mais planos de treino, e os planos também mantêm o registro de quais alunos estão inscritos neles.

Você foi contratado para construir o sistema que representa esse cenário.

Questões
1.0 ponto
(1) Construa o modelo de classes UML que represente as entidades do sistema descrito.

1.0 ponto
(2) Implemente em Java as classes definidas no modelo UML, com atributos e construtores adequados. Considere que todos os atributos têm os seus respectivos métodos get e set.

0.5 ponto
(3) Implemente um construtor alternativo que permita criar um plano de treino gratuito, sem custo mensal.

0.5 ponto
(4) Construa um método que permita verificar se um plano de treino pode substituir outro, considerando que isso é possível se a duração for igual ou superior e a intensidade for igual ou menor.

2.0 pontos
(5) Construa um método para calcular quanto um aluno gasta mensalmente com seus planos de treino.

2.5 pontos
(6) Crie um método que permita sugerir ao aluno uma forma de economizar, verificando se existe algum plano alternativo com intensidade semelhante e custo menor.

2.5 pontos
(7) Implemente um método para identificar qual plano de treino possui o maior número de alunos inscritos.
