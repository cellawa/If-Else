package classesdeJava;

public class ClassesDeJava {

	
	//Condi��es l�gica com if e 

	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno aprovado " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno Recupera��o " + media);
		} else {
			System.out.println("Aluno reprovado " + media);
		}

		
	//Operadores tern�rioss s�o para micro valida��es
		
		String saidaResultado;
		saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media  <= 69) ? "Aluno Recupera��o" : "Reprovado";
		System.out.println(saidaResultado);
	}
}
