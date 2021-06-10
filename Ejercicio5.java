import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String args[]){
		Scanner sca = new Scanner(System.in);
		int edad = 0;
		int n = 0;
		int numeroh = 0;
		int numerom = 0;
		String sexo;
		System.out.println("Numero de personas a ingresar");
		n = sca.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Edad:"+(i+1));
			edad = sca.nextInt();
			System.out.println("Sexo (M/F): ");
			sexo = sca.next();
			if (edad<18 && sexo.equals("M")) {
				numeroh += 1;
			}
			if (edad>18 && sexo.equals("F")) {
				numerom += 1;
			}
		}
		System.out.println("Hombres menores de edad "+numeroh);
		System.out.println("Mujeres mayores de edad "+numerom);
	}


}

