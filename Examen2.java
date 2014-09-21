import java.util.Scanner;
public class Examen2 {

	//Devuelve el valor de "arreglo" en la posicion "i"
				//2.5pts
				int DevuelveValor(int arreglo[],int i)
				{
					
				 int mi_arreglo[];
						mi_arreglo= new int[3];
						mi_arreglo[0]=10; 
						mi_arreglo[1]=20;
						mi_arreglo[2]=30;
						
						int i = 0;
						while (1<mi_arreglo.length); 
						{
							System.out.print(mi_arreglo[1] );
							i=i+1;
						}

						return -1;
					
				}

				//Si el promedio de todos los valores de "notas" es mayor a 60, devuelve verdadero de lo contrario falso
				//2.5pts
				static boolean alumnoAprobo(int notas[])
				{
	                        	int suma = 0;
	                         	int promedio = 0;
		
	                            	for(int a = 0; a < notas.length; a++)
	                      	{
		                      	suma = suma + notas[a];
	                        	}
	  	
		                        promedio = suma / 3;
		
		                        if(promedio >= 60)
	                         	{
		                    	return true;
	                        	}
	                         	return false;
                          	} 
	
					
				
				
				
				//Devuelve el valor de mi_arreglo en la posicion [x][y]
				//2.5pts
				static int obtenerValorBidi(int mi_arreglo[][], int x, int y)
				{
		                 return 
			              	mi_arreglo[x][y];
                       	}
			
				
				
				//Devuelve la cantidad de veces que "valor" existe en "arreglo"
				//2.5pts
				static int cuantosExisten(int arreglo[][], int valor)
				{
					
					return -1;
				}
				
				//Realizar la siguiente funcion recursiva
				//recursiva1(n) = recursiva1(n-1) - recursiva1(n-2)
				//Dados los siguientes caso base
				//recursiva1(0)=10
				//recursiva1(1)=20
				//2.5pts
				static int recursiva1 (int n)
				{
					 int result;
		             if (n == 0)
		             { 
		                result = 10;
		             }
		             if (n == 1)
		             {
		                result = 20;
		             }else 
		             {
		                result = recursiva1(n-1) - recursiva1(n-2);
		             }
					return result;
				}
				
				//Realizar la siguiente funcion recursiva
				//recursiva2(n) = recursiva2(n-1) + recursiva2(n-2) * recursiva2(n-3)
				//Dados los siguientes caso base
				//recursiva2(0)=10
				//recursiva2(1)=20
				//recursiva2(2)=30
				//2.5pts
				static int recursiva2 (int n)
				{
					int result;
					if (n == 0)
					{
						result = 10;
					}
					if (n == 1)
					{
						result = 20;
					}
					if (n == 2)
					{
						result = 30;
					}else
						
						result = recursiva2(n-1) + recursiva2(n-2) * recursiva2(n-3);
					
				
					return result;
					}
				
				
				

	}


