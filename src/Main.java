import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

     Essencias e = new Essencias();

        System.out.printf("Oque cada cor representa:     %sCiano: métodos da classe super     %sMagenta: métodos da classe filha     %s%s Preto: métodos da classe neta %s\n",e.CIANO,e.MAGENTA,e.SWHITE,e.PRETO,e.RESETAR);

//  Classe pessoa
        Pessoa pessoaExemplo = new Pessoa("LuCas caYres porto",123456789101L,LocalDate.of(2010,2,2),new Endereco("Avenida Miguel Ignácio Curi",111,"Itaquera","Néo Química Arena"));
        e.separador();
        System.out.printf("%60s\n","Classe Pessoa");
        e.separador();
        System.out.println(pessoaExemplo);
        System.out.printf("%sNome: %s%s\n",e.MAGENTA,pessoaExemplo.getNome(),e.RESETAR);
        if(pessoaExemplo.colocarMaiuscula()){
         System.out.printf("%sNome corrigido com sucesso!!!\nNome corrigido:%s %s %s\n",e.VERDE,e.AMARELO,pessoaExemplo.getNome(),e.RESETAR);
        }
        else{
          System.out.printf("%sEste nome não precisou de alteração, ja estava correto.%s\n",e.VERMELHO,e.RESETAR);
        }


//  Classe funcionario
     e.separador();
     System.out.printf("%65s\n","Classe Funcionario");
     e.separador();
     Funcionario funcionarioExemplo = new Funcionario("marceLo ModoLo",26352873829L,LocalDate.of(1967,8,7),new Endereco("Praça Roberto Gomes Pedrosa",1,"Morumbi","Morumbis"),LocalDate.of(2021,01,7),3400);
     System.out.println(funcionarioExemplo);
     if(funcionarioExemplo.colocarMaiuscula()){
      System.out.printf("%sNome corrigido com sucesso!!!\nNome corrigido:%s %s %s\n",e.VERDE,e.AMARELO,funcionarioExemplo.getNome(),e.RESETAR);
     }
     else{
      System.out.printf("%sEste nome não precisou de alteração, ja estava correto.%s\n",e.VERMELHO,e.RESETAR);
     }


        System.out.printf("%sCpf: %d\n%sData admissão: %s%s\n",e.CIANO,funcionarioExemplo.getCpf(),e.MAGENTA,funcionarioExemplo.getAdmissao(),e.RESETAR);

//  Classe aluno
        e.separador();
        System.out.printf("%59s\n","Classe Aluno");
        e.separador();
        Aluno alunoExemplo = new Aluno("Vinicius Cayres Porto",23457692832L,LocalDate.of(2005,01,02),new Endereco("Irineu José Bordon",335,"Vila Jaguara","Instituto J&F"),20250252,"Germinare Bussines");
        System.out.println(alunoExemplo);
        if(alunoExemplo.colocarMaiuscula()){
            System.out.printf("%sNome corrigido com sucesso!!!\nNome corrigido:%s %s %s\n",e.VERDE,e.AMARELO,alunoExemplo.getNome(),e.RESETAR);
        }
        else{
            System.out.printf("%sEste nome não precisou de alteração, ja estava correto.%s\n",e.VERMELHO,e.RESETAR);
        }
        System.out.printf("%sNascimeto: %s\n%sCurso: %s%s\n",e.CIANO,alunoExemplo.getDataNascimento(),e.MAGENTA,alunoExemplo.getCurso(),e.RESETAR);

//  Classe Gestor
        e.separador();
        System.out.printf("%60s\n","Classe Gestor");
        e.separador();
        Gestor gestorExemplo = new Gestor("Ricardo Cirillo Junior",12345678900L,LocalDate.of(2009,9,29),new Endereco("Palestra Itália",200,"Água Branca","Allianz Parque"),LocalDate.of(2025,1,29),10000,10,LocalDate.of(2025,5,27));
        System.out.println(gestorExemplo);
        if(gestorExemplo.colocarMaiuscula()){
            System.out.printf("%sNome corrigido com sucesso!!!\nNome corrigido:%s %s %s\n",e.VERDE,e.AMARELO,gestorExemplo.getNome(),e.RESETAR);
        }
        else{
            System.out.printf("%sEste nome não precisou de alteração, ja estava correto.%s\n",e.VERMELHO,e.RESETAR);
        }
        System.out.printf("%sBairro: %s\n%sSalario: %.2f\n%s%s Departamento: %d %s%s\n",e.CIANO,gestorExemplo.getEndereco().getBairro(),e.MAGENTA,gestorExemplo.getSalario(),e.SWHITE,e.PRETO,gestorExemplo.getDepartamento(),e.RESETAR,e.SRESET);

// Classe Vendedor
        Vendedor vendedorExemplo = new Vendedor("MaurIcio FErnAndo cayres porTo",83759402639L,LocalDate.of(1998,06,27),new Endereco("Rua Princesa Isabel","Vila Belmiro","Estadio do Santos"),LocalDate.of(2019,02,28),10000,1.15,10,7000);
        e.separador();
        System.out.printf("%62s\n","Classe Vendedor");
        e.separador();
        System.out.println(vendedorExemplo);
        if(vendedorExemplo.colocarMaiuscula()){
            System.out.printf("%sNome corrigido com sucesso!!!\nNome corrigido:%s %s %s\n",e.VERDE,e.AMARELO,vendedorExemplo.getNome(),e.RESETAR);
        }
        else{
            System.out.printf("%sEste nome não precisou de alteração, ja estava correto.%s\n",e.VERMELHO,e.RESETAR);
        }
        System.out.printf("%sComplemento: %s\n%sAdmissão: %s\n%s%s Quantidade de Vendas: %d %s%s\n",e.CIANO,vendedorExemplo.getEndereco().getComplemento(),e.MAGENTA,vendedorExemplo.getAdmissao(),e.SWHITE,e.PRETO,vendedorExemplo.getQuantidadeVendas(),e.RESETAR,e.SRESET);

    }
}
