/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacad.basicobemfeito;

/**
 *
 * @author aluno
 */
 public class Gato extends Animal{
     String nome, cor;

    public Gato(int idade, String nome, String cor) {
        super(idade);
        this.cor = cor;
        this.nome = nome;
    }
     
     @Override
     public void fazerBarulho() {
         System.out.println("miau! e o som que o gatinho " + nome + " faz");
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

     @Override
    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

     @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String nomedoAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
     
     
 }
