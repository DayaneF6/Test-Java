/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacad.basicobemfeito;

/**
 *
 * @author aluno
 */
abstract class Animal {
    int idade;
    
 public Animal (int idade){
    this.idade = idade;
 }
   
public abstract void fazerBarulho();
public abstract String nomedoAnimal();

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



}
