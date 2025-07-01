package javaHeranca;

public class Escola {
	public static void main(String[] args) {
		Aluno aluno01 = new Aluno(null, null, null);
		aluno01.nome = "Marco";
		aluno01.cpf = "78952345602";
		aluno01.telefone="986852152";
		aluno01.matricula="123";
		
		System.out.printf("%s %s %s %s \n", aluno01.nome, aluno01.cpf, aluno01.telefone, aluno01.matricula);
		
		Funcionario funcionario1 = new Funcionario(null, null, null);
		funcionario1.nome = "Mayara";
		funcionario1.cpf = "85694578630";
		funcionario1.telefone="986548752";
		funcionario1.cargo="Diretora";
		funcionario1.salario=8595;
		
		System.out.printf("%s %s %s %s %f", funcionario1.nome, funcionario1.cpf, funcionario1.telefone, funcionario1.cargo, funcionario1.salario);
		
		
		Professor professor1 = new Professor(null, null, null);
		professor1.nome="Viviane";
		professor1.cpf="57862345810";
		professor1.telefone="986854728";
		professor1.salario=1800;
		professor1.disciplina="Artes";
	}
	
}
