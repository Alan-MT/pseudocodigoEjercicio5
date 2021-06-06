Algoritmo Ejercicio5
	Definir N, NumeroH, NumeroM, edad Como Entero
	Definir sexo Como Caracter
	Escribir "Numero de personas a ingresar"
	Leer N
	Para i<-1 Hasta N Con Paso 1 Hacer
		Escribir "Edad:" ,i
		Leer edad
		Escribir "Sexo (M/F): "
		leer sexo
		Si edad<18 Y sexo = "M" Entonces
			NumeroH <- NumeroH+1
		Fin Si
		Si edad>18 Y sexo = "F" Entonces
			NumeroM <- NumeroM+1
		Fin Si
	Fin Para
	Escribir "Hombres emnos de edad ",NumeroH
	Escribir "Mujeres mayores de edad ",NumeroM
	
FinAlgoritmo
