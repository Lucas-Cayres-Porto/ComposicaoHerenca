import java.time.LocalDate;

public class Gestor extends Funcionario{
    private int departamento;
    private LocalDate promocaoGestor;
    public Gestor(String nome, long cpf, LocalDate nascimento, Endereco endereco, LocalDate admissao, double salario, int departamento, LocalDate promocaoGestor){
        super(nome,cpf,nascimento,endereco,admissao,salario);
        this.departamento=departamento;
        this.promocaoGestor=promocaoGestor;
    }
    public int getDepartamento(){
        return this.departamento;
    }
    public LocalDate getPromocaoGestor(){
        return this.promocaoGestor;
    }
    public void setDepartamento(int departamento){
        this.departamento=departamento;
    }

    public String toString(){
        return super.toString()+"\nDepartamento: "+this.departamento+"\nPromoção Gestor: "+this.promocaoGestor;
    }
}
