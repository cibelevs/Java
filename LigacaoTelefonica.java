
public class LigacaoTelefonica
{
   private int numeroOrigem;
   private String localidade;
   private int numeroDestino;
   private float valorTotal;
   
   //agora as outras duas variáveis serão instâncias de 'Tempo'
    Tempo momentoInicio;
    Tempo momentoFinal;
    
    public LigacaoTelefonica(int numeroOrigem, String localidade, 
    int numeroDestino, Tempo momentoInicio){
        this.numeroOrigem = numeroOrigem;
        this.localidade = localidade;
        this.numeroDestino = numeroDestino;
        this.momentoInicio = momentoInicio;
    }
    
    void setNumeroOrigem (int numero){
        this.numeroOrigem = numero;
    }

    void setLocalidade (String local){
        this.localidade = local;
    }
    
    void setNumeroDestino (int destino){
        this.numeroDestino = destino;
    }
    
    void setValorTotal (float total){
        this.valorTotal = total;
    }

    void setMomentoInicio(Tempo incio){
        this.momentoInicio = incio;
    }
    
    int getNumeroOrigem (){
        return this.numeroOrigem;
    }
    
    String getLocalidade(){
        return this.localidade;
    } 
    
    int getNumeroDestino (){
        return this.numeroDestino;
    }
    
    float getValorTotal(){
        return this.valorTotal;
    }
    
    Tempo getMomentoInicio(){
        return this.momentoInicio;
    }
    
    float calcTotal(Tempo momentoFinal){
        //converte o tempo inicial em minutos
        int in = this.momentoInicio.conversao(this.momentoInicio.getHora(),
        this.momentoInicio.getMinuto(), this.momentoInicio.getSegundo());
        
        //converte o tempo final em minutos 
        int fim = momentoFinal.conversao(momentoFinal.getHora(),
        momentoFinal.getMinuto() ,momentoFinal.getSegundo()); 
        
        //retorna os minutos totais da ligaçao
        return this.momentoInicio.calcDiferenca(in, fim);
    }
   
    //String localidade (int num)
}
