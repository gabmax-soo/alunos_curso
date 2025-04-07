package aplicacao;

import dominio.Alunos;
import dominio.Curso;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso curso = new Curso();
        int opcao;

        System.out.println(" PRÉ VESTIBULAR:  ");
        System.out.print("Curso: ");
        String nomeCurso = sc.nextLine();

        System.out.print("Código do curso: ");
        String codigo = sc.nextLine();

        Curso curso1 = new Curso(nomeCurso,codigo);

        do{
            System.out.println("1.Matricular Aluno");
            System.out.println("2.Remover Aluno");
            System.out.println("3.Listar alunos do curso");
            System.out.println("4.Sair");
            System.out.print("Escolha sua opção:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Nome do aluno:");
                    String nome = sc.nextLine();
                    System.out.print("Matricula:");
                    String matricula = sc.nextLine();
                    System.out.print("Idade:");
                    int idade = sc.nextInt();

                    Alunos aluno =  new Alunos(nome,matricula,idade);
                    curso.addAluno(new Alunos(nome,matricula,idade));
                break;
                case 2:
                    System.out.print("Digite a matricula do aluno que você deseja remover:");
                    String matricularemover = sc.nextLine();
                    curso.removerAluno(matricularemover);
                break;
                case 3:
                    curso.listar();
                break;

                case 4:
                    System.out.println("Saindo....");
                break;

                default:
                    System.out.println("Opção invalida!!!");
                break;
            }

        }while(opcao != 4);
    }
}
