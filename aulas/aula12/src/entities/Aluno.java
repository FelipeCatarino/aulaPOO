package aula12.src.entities;

public class Aluno{
    private String aluno;
    private int id;

    public String getAluno(){
        return aluno;
    }
    public int getId(){
        return id;
    }

    public void setAluno(String nome){
        this.aluno = nome;
    }
    public void setAluno(int id){
        this.id = id;
    }

}