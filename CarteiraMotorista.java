
/**
 *  //Em um sistema para o Detran, a carteira de motorista é representada por um número, 
    //CPF do proprietário, tipo (A, B ou AB), data de validade, data de expedição, pontos e situação (Valida, apreendida, vencida). 
    //Quando uma pessoa passa no exame do Detran, uma nova carteira é emitida com os dados do seu proprietário. 
    //Neste momento o proprietário não possui nenhum ponto na carteira. A medida que o tempo passa, se o proprietário fizer
    //alguma infração, ele recebe pontos que são acumulados em sua carteira. Caso ele ultrapasse 20 pontos sua carteira é apreendida.
    //Esporadicamente, os pontos são zerados. Implemente em Java uma classe que represente uma carteira. Forneça métodos para criar
    //uma carteira, acrescentar pontos, consultar o saldo de pontos, zerar a carteira, apreender a carteira, verificar se esta está válida
 */
import java.time.LocalDate;
public class CarteiraMotorista
{
    int cpf;
    char tipoCarteira;
    int dataValidade;
    int dataExpedicao;
    int pontos;
    String situacao;
    
    public CarteiraMotorista(int cpf, char tipoCarteira, int dataValidade, int dataExpedicao, int pontos, String situacao)
    {
        this.cpf = cpf;
        this.tipoCarteira = tipoCarteira;
        this.dataValidade = dataValidade;
        this.dataExpedicao = dataExpedicao;
        this.pontos = pontos;
        this.situacao = situacao;
    }
    
    void setTipoCarteira(char letra){
        this.tipoCarteira = letra;
    }
    
    char getTipoCarteira(){
        return this.tipoCarteira;
    }
    
    void setPontos(int num){
        this.pontos = num;
    }
    
    int getPontos(){
        return this.pontos;
    }

    void setSituacao (String carteira){
        this.situacao = carteira;
    }
    
    String getSituacao (){
        return this.situacao;
    }
    
    
    void cometeInfracao (int infracao){
        this.setPontos(infracao);
        if (this.pontos >= 20){
            this.situacao = "APREENDIDA";
        }
    }
    
    void zeraPontos (){
        this.setPontos(0);
        System.out.println(this.pontos);
    }

}
