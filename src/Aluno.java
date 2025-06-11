import java.time.LocalDate;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, long cpf, LocalDate nascimento, Endereco endereco, int matricula, String curso){
        super(nome,cpf,nascimento,endereco);
        this.matricula=matricula;
        this.curso=curso;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }
    public String toString(){
        return super.toString()+"\nMatriculo: "+this.matricula+"\nCurso: "+this.curso;
    }

}
