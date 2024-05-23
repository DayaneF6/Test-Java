/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacad.basicobemfeito;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main (String[] arg){
       Cachorro cachorro = new Cachorro(18, "moca", "caramelo");
       Gato gato = new Gato(5, "isis", "preto");
       
       System.out.println(" DADOS cachorro: ");
       cachorro.fazerBarulho();
       
       System.out.println(" DADOS gato: ");
       gato.fazerBarulho();
     }
     
public void Atividade(){
     
    Pessoa pessoa1 = new Pessoa("Dayane", 20, "Centro");
    
    //pessoa1.setNome("Dayane");
    //pessoa1.setIdade(20);
    //pessoa1.setEndereco("Federal");
    
    System.out.println("DADOS: ");
    pessoa1.imprimirInformacoes();
}
}
