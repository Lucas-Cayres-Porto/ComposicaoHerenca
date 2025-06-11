public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String complemento;

    public Endereco(String rua, int numero, String bairro, String complemento){
        this.rua=rua;
        this.numero=numero;
        this.bairro=bairro;
        this.complemento=complemento;
    }
    public Endereco(String rua, int numero, String bairro){
        this.rua=rua;
        this.numero=numero;
        this.bairro=bairro;
    }
    public Endereco(String rua, String bairro, String complemento){
        this.rua=rua;
        this.bairro=bairro;
        this.complemento=complemento;
    }
    public Endereco(String rua, String bairro){
        this.rua=rua;
        this.bairro=bairro;
    }

    public String getRua(){
        return this.rua;
    }
    public int getNumero(){
        return this.numero;
    }
    public String getBairro(){
        return this.bairro;
    }
    public String getComplemento(){
        return this.complemento;
    }
    public void setRua(String rua){
        this.rua=rua;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setBairro(String bairro){
        this.bairro=bairro;
    }
    public void setComplemento(String complemento){
        this.complemento=complemento;
    }
    public String toString(){
        return "Rua: "+this.rua+"\nNúmero: "+this.numero+"\nBairro: "+this.bairro+"\nComplemento: "+this.complemento;
    }
}
