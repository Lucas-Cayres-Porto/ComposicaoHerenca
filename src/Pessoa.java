import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private long cpf;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Pessoa(String nome,long cpf, LocalDate dataNascimento, Endereco endereco){
        this.nome=nome;
        this.cpf=cpf;
        this.dataNascimento=dataNascimento;
        this.endereco=endereco;
    }

    public String getNome(){
        return this.nome;
    }
    public long getCpf(){
        return this.cpf;
    }
    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }
    public String toString(){
    return "Nome: "+this.nome+"\nCpf: "+this.cpf+"\nData nascimento: "+this.dataNascimento+"\n"+this.endereco;
    }
    public boolean colocarMaiuscula(){
//----------------------------------------------------------------
//                          Função errada
// ----------------------------------------------------------------
//        String  nomeOriginal = nome;
//        int contador = 0;
//        for (int i = 0; i < nomeOriginal.length();i++){
//            if (nomeOriginal.charAt(i) == ' '){
//                contador++;
//                System.out.println(contador);
//            }
//        }
//        if (contador>=1) {
//            this.nome = nomeOriginal.substring(0, 1).toUpperCase() + nomeOriginal.substring(1, nomeOriginal.indexOf(" ") + 1).toLowerCase();
//            int posicao = nomeOriginal.indexOf(" ");
//            for (int i = 0; i < contador; i++) {
//                this.nome += nomeOriginal.substring(posicao + 1, posicao + 2).toUpperCase();
//                System.out.println(nomeOriginal.substring(posicao, posicao + 1).toUpperCase());
//                if (nomeOriginal.indexOf(" ", posicao + 1) == -1) {
//                    this.nome += nomeOriginal.substring(posicao + 2, nomeOriginal.length());
//                } else {
//                    this.nome += nomeOriginal.substring(posicao + 2, nomeOriginal.indexOf(" ", posicao + 1) + 1);
//                    posicao = nomeOriginal.indexOf(" ", posicao + 1);
//                }
//            }
//        }
//        else {
//            this.nome = nomeOriginal.substring(0, 1).toUpperCase() + nomeOriginal.substring(1, nome.length()).toLowerCase();
//        }
//        if (this.nome.equals(nomeOriginal)){
//            return false;
//        }
//        else {
//            return true;
//        }

//  -----------------------------------------------------------------------------
//                              Correta
//  -----------------------------------------------------------------------------
        String nomeOriginal = this.nome;
        this.nome=this.nome.toLowerCase();
        String[] nomeSeparado = this.nome.split(" ");
        this.nome="";

        for (int i = 0; i < nomeSeparado.length; i++) {
            nomeSeparado[i]=nomeSeparado[i].substring(0,1).toUpperCase()+nomeSeparado[i].substring(1);
        }
        for (int i = 0; i < nomeSeparado.length; i++) {
            if (i!= nomeSeparado.length-1) {
                this.nome += nomeSeparado[i] + " ";
            }
            else {
                this.nome += nomeSeparado[i];
            }
        }
        if (this.nome.equals(nomeOriginal)){
            return false;
        }
        return true;
    }
}