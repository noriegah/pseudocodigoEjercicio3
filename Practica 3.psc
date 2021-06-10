Algoritmo factorial
	Escribir "Ingrese un número"
	Leer num
	facto=1
	Si num>=0 Entonces
		Para i=1 Hasta num Con Paso 1 Hacer
			facto=facto*i
		FinPara
		Escribir "El factorial de " num " es " facto
	SiNo
		Escribir num " No tiene factorial"
	FinSi
FinAlgoritmo
