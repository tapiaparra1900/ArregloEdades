public class Arreglo1{
	public static void main(String[] args){
//declarar variable 
	int i, acumula=0;
	double prom=0;
//crear arreglo e iniciarlo en una sola linea 
	int[] edades = {25,30,19,22,20};

	for (i=0;i<=4;i++){
	System.out.print("Valor : "+edades[i]);
	System.out.println("Posicion : " +i);
//acumula detades
	acumula=acumula+edades[i];
		
}
//imprime total
	System.out.println("Total: " +acumula);
//calcula prom
	prom=acumula/i;
	System.out.println("El promedio es : " +prom);	
}
}
