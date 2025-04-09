
/**
 * Uma loja de roupas possui um nome de fantasia, uma razão social, um número de cnpj, um dígito do 
 * cnpj, um valor de faturamento e uma área em m2. Construa uma classe loja conforme descrição acima
 * e forneça os seguintes métodos:
 * Método que permita criar uma loja informando o nome de fantasia, a razão social, o cnpj e o digito do cnpj;
 * Método que permita criar uma loja informando o nome de fantasia, o cnpj e o digito do cnpj, o valor do
 * faturamento e publico alvo. Neste caso considere que a razão social é igual ao nome de fantasia;
 * Método que permita verificar se uma loja tem faturamento superior ao de outra loja;
 * Método que permita calcular o valor do aluguel de uma loja. Sabe-se que o aluguel custa R$50,00 por m2.
 */
public class LojaRoupas
{
    private String nomeFantasia, razaoSocial, publicoAlvo;
    private int numeroCnpj, digitoCnpj;
    private float valorFaturamento, area;
    
    
    // Método que permita criar uma loja informando o nome de fantasia, a razão social, o cnpj e o digito do cnpj;
       public LojaRoupas(String nomeFantasia, String razaoSocial, int numeroCnpj, int digitoCnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.numeroCnpj = numeroCnpj;
        this.digitoCnpj = digitoCnpj;
        
    }

    //Método que permita criar uma loja informando o nome de fantasia, o cnpj e o digito do cnpj, o valor do
    //faturamento e publico alvo. Neste caso considere que a razão social é igual ao nome de fantasia
    public LojaRoupas (String nomeFantasia, int numeroCnpj, int digitoCnpj, float valorFaturamento, String publicoAlvo){
        this(nomeFantasia, nomeFantasia, numeroCnpj, digitoCnpj);
        this.valorFaturamento = valorFaturamento;
        this.publicoAlvo = publicoAlvo;
    }

    //Método que permita verificar se uma loja tem faturamento superior ao de outra loja
    boolean verificaFaturamento (float lojaDois){
        if (this.valorFaturamento < lojaDois)
        return true;
        else return false;
    }
    
    // Método que permita calcular o valor do aluguel de uma loja. Sabe-se que o aluguel custa R$50,00 por m2.
    float calculaAluguel (){
        return 50 * this.area; //tirei o get e coloquei apenas a area 
        //pesquisar sobre qual é o melhor colocar aquii, o get ou o set
    }
    
    //Metodos de get
    String getNomeFantasia(){
        return this.nomeFantasia;
    }
    
    String getRazaoSocial(){
        return this.razaoSocial;
    }
    
    int getNumeroCnpj(){
        return this.numeroCnpj;
    }
    
    int getDigitoCnpj(){
        return this.digitoCnpj;
    }
    
    float getValorFatoramento(){
        return this.valorFaturamento;
    }
    
    float getArea(){
        return this.area;
    }
    
    //Metodos set
    void setNomeFantasia(String nome){
        this.nomeFantasia = nome;
    }
    
    void setRazaoSocial(String razao){
        this.razaoSocial = razao;
    }
    
    void setNumeroCpnj (int numero){
        this.numeroCnpj = numero;
    }
    
    void setDigitoCnpj(int digito){
        this.digitoCnpj = digito;
    }
    
    void setValorFatoramento(float valor){
        this.valorFaturamento = valor;
    }
    
    void setArea(float arear){
        this.area = arear;
    }
    
     
    
}
