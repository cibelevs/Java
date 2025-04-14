
public class Tempo
{
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tempo(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    int getHora(){
        return this.hora;
    }
    
    int getMinuto(){
        return this.minuto;
    }
    
    int getSegundo(){
        return this.segundo;
    }
    
    int conversao(int hora, int minuto, int segundo){
        int total;
        total = hora * 60 + minuto;
        if( segundo > 0){
            total += 1;
        }
        return total;
    }

    int calcDiferenca (int inicio, int fim){
        int diferenca; 
        diferenca = fim - inicio;
        return diferenca;
    }
    
    
    }
   
