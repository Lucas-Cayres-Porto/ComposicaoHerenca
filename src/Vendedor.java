import java.time.LocalDate;

public class Vendedor extends Funcionario{
    private double comissao;
    private int quantidadeVendas;
    private double valorVendido;
    public Vendedor(String nome, long cpf, LocalDate dataNascimento, Endereco endereco, LocalDate admissao, double salario, double comissao, int quantidadeVendas, double valorVendido){
        super(nome,cpf,dataNascimento,endereco,admissao,salario);
        this.comissao=comissao;
        this.quantidadeVendas=quantidadeVendas;
        this.valorVendido=valorVendido;
    }
    public double getComissao(){
        return this.comissao;
    }
    public int getQuantidadeVendas(){
        return this.quantidadeVendas;
    }
    public double getValorVendido(){
        return this.valorVendido;
    }
    public String toString(){
        return super.toString()+"\nComissão: "+this.comissao+"\nQuantidade de vendas: "+this.quantidadeVendas+"\nValor vendido: "+this.valorVendido;
    }
}
