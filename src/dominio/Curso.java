package dominio;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String codigo;
    private List<Alunos> alunos;

    public Curso (){
        this.alunos = new ArrayList<>();
    }

    public Curso(String nome,String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void addAluno(Alunos aluno){
        alunos.add(aluno);
    }

    public void listar(){
        if(alunos.isEmpty()){
            System.out.println("A lista está vazia!!!");
        }
        else{
            for(Alunos a: alunos){
                System.out.println(a);
            }
        }
    }

    public void removerAluno(String matricularemover){
        for (int i = 0; i <alunos.size() ; i++) {
            if(alunos.get(i).getMatricula().equals(matricularemover)){
                alunos.remove(i);
                System.out.println("Aluno removido com sucesso!!");
                return;
            }
        }
        System.out.println("ALuno não encontrado!!!");
    }


}
