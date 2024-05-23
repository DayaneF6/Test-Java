/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacad.basicobemfeito;

/**
 *
 * @author aluno
 */
public class Pessoa {
    
    public Pessoa (String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;       
    }
    
    private String nome, endereco;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }
    
    public void imprimirInformacoes(){
        System.out.println("nome: " + nome + ", endereco: " + endereco + " idade: " + idade);
    }
}
