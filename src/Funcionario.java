import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private LocalDate admissao;
    private double salario;
    public Funcionario(String nome,long cpf, LocalDate dataNascimento, Endereco endereco,LocalDate admissao,double salario){
        super(nome,cpf,dataNascimento,endereco);
        this.admissao=admissao;
        this.salario=salario;
    }
    public LocalDate getAdmissao(){
        return admissao;
    }
    public double getSalario(){
        return salario;
    }
    public String toString(){
        return super.toString()+"\nAdmissão: "+this.admissao+"\nSalário: "+this.salario;
    }

    public void aumentarSalario(double percetualAumento){
        this.salario*=(percetualAumento/100);
    }


}
