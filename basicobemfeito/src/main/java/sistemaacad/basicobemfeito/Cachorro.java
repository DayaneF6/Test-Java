/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacad.basicobemfeito;

/**
 *
 * @author aluno
 */
public class Cachorro extends Animal{
    String apelido, raca;

    @Override
    public void fazerBarulho() {
         System.out.println("au au! e o som do cachorrinho " + apelido + " faz");
    }
    @Override
       public String nomedoAnimal(){
        return apelido;
    }
       public Cachorro (int idade, String apelido, String raca){
           super(idade);
           this.apelido = apelido;
           this.raca = raca;
       }

    public String getApelido() {
        return apelido;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }
       
       
}
