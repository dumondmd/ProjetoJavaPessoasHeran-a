
package projetopessoas;


public class ProjetoPessoas {

  
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cladio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        p1.setIdade(20);
        p2.setIdade(25);
        p3.setIdade(30);
        p4.setIdade(35);
        
        
        p2.setCurso("Informatica");
        p3.setSalario((float)2000.00);
        p4.setSetor("Estoque");
        
       
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }

    
    
}
