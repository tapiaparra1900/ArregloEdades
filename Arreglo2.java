import java.util.Scanner;

public class Arreglo2{
	public static void main(String[] args){
//declarar variable 
	int i,j, acumula=0, prom=0, aux=0, auxPos=0;
//declarar arreglo
	int[] edades = new int[5];
	Scanner Entrada = new Scanner(System.in);
//crear arreglo e iniciarlo en una sola linea 
	

	for (i=0;i<=4;i++)
		{
	System.out.print("Ingresa Valor : ");
	edades [i]=Entrada.nextInt();
		}
//imprimir valores 
	for (j=0;j<=4;j++){
	System.out.print("Valor : "+edades[j]);
	System.out.println("Posicion : " +j);
//acumula detades
	acumula=acumula+edades[j];
	//busca mayor
	if (edades[j]> aux){ 
	aux =  edades [j];
	auxPos=j;	
	}
		
}
//imprime total
	System.out.println("Total: " +acumula);
//calcula prom
	prom=acumula/j;
	System.out.println("El Valor mayor es  : " +aux);	
	System.out.println("La posicion del valor mayor es  : " +auxPos);	
}
}