import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try
		{
			PrintWriter documento = new PrintWriter ("nombre_archivo");
			documento.write(contenido);
			documento.flush();
			//escribe cualquier valor pendiente del archivo segun el caso.
		}catch(Exception e)
		//Captura las excepciones.
		{
			e.printStackTrace();
			//printStackTrace( ) Se utiliza para imprimir el registro del stack donde se ha iniciado la excepción. 
			//http://profesores.fi-b.unam.mx/carlos/java/java_basico5_3.html
		}
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		try
		{
			PrintWriter documento = new PrintWriter("nombre_archivo");
			documento.write(contenido);
			documento.flush();
			//escribe cualquier valor pendiente del archivo segun el caso.
		}catch (Exception e)
		//Captura las excepciones.
			{
				e.printStackTrace();
				//printStackTrace( ) Se utiliza para imprimir el registro del stack donde se ha iniciado la excepción. 
				//http://profesores.fi-b.unam.mx/carlos/java/java_basico5_3.html
			}
	}

	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		int entero;
		//Se declara una variable tipo Int.
		try{
			//Scanner lee lo que se ingresa
			Scanner b = new Scanner(new File(nombre_archivo));
			//Lee la variable entero (Int)
			entero = b.nextInt();
			//Captura la variable y la devuelve en entero (Int).
			System.out.println(entero);
			//Imprime
			b.close();
			// retorna la variable asignada a entero.
			return entero;
		}catch (Exception e)
		{
			e.printStackTrace();
			//printStackTrace( ) Se utiliza para imprimir el registro del stack donde se ha iniciado la excepción. 
			//http://profesores.fi-b.unam.mx/carlos/java/java_basico5_3.html
		}
		return -1;
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		String letras;
		// Se declara una variable tipo String.
		
		try{
			//Scanner lee lo que se ingresa.
			Scanner b = new Scanner(new File(nombre_archivo));
			//Lee la variable letras (String)
			letras = b.next();
			//Captura la variable y la devuelve en letras (String).
			System.out.println(letras);
		    //Imprime
			b.close();
			// retorna la variable asignada a letras.
			return letras;
		}catch (Exception e)
		{
			e.printStackTrace();
			//printStackTrace( ) Se utiliza para imprimir el registro del stack donde se ha iniciado la excepción. 
			//http://profesores.fi-b.unam.mx/carlos/java/java_basico5_3.html
		}
		return " ";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		Double decimal;
		//Se declara una variable tipo double.
		
		try{
			//Scanner lee lo que se ingresa
			Scanner b = new Scanner(new File(nombre_archivo));
			//Lee la variable decimal (Double)
			decimal = b.nextDouble();
			//Captura la variable y la devuelve en decimal (Double)
			System.out.println(decimal);
			//Imprime
			b.close();
			// retorna la variable asignada a decimal
			return decimal;
		}catch (Exception e)
		{
			e.printStackTrace();
			//printStackTrace( ) Se utiliza para imprimir el registro del stack donde se ha iniciado la excepción. 
			//http://profesores.fi-b.unam.mx/carlos/java/java_basico5_3.html
		}
		return -1;
	}
	
	//Devuelve la cantidad de veces que buscada (dado) existe en el archivo con nombre nombre_archivo (dado)
	static int contar(String nombre_archivo, String buscada)
	{
		String letra;
		int contador = 0;
		//Iguala el contador a 0
		
		try{
			//Scanner lee lo que se ingresa.
			Scanner b = new Scanner(new File(nombre_archivo));
			// Crea un ciclo while para recorrer el archivo.
			while(b.hasNext())
				//hasNextInt  devuelve un booleano verificando si existe un siguiente entero, lo devolverá True si existe, de lo contrario lo devolverá False.
				//http://foro.noticias3d.com/vbulletin/showthread.php?t=382739
			{
		
			letra = b.next();
			//Se captura la variable y devuelve en String
			
			if(letra.equals(buscada)) contador = contador +1;
			//Equals se basa en una definición de igualdad que ha de estar establecida.
			//http://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=628:el-metodo-equals-en-java-diferencia-entre-igualdad-e-identidad-comparar-objetos-ejemplos-cu00662b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
			}
			// Imprime la variable asignada al contador para buscar que valor asignar.
			System.out.println(contador);
			// Imprime
			b.close();
			//retorna la variable asignada
			return contador;
			// intenta atrapar la excepcion si no encuentra un archivo
		}catch (Exception e){
			// Hace un trazo de errores a la variable e
			e.printStackTrace();
			//printStackTrace( ) Se utiliza para imprimir el registro del stack donde se ha iniciado la excepción. 
			//http://profesores.fi-b.unam.mx/carlos/java/java_basico5_3.html
		}
		// asigna un retorno en caso de que el try/catch no tenga efecto
		return -1;
	}
	
	//Devuelve el promedio de l
	//Nota: el archivo unicamente contiene enteros
	static int getPromedio(String nombre_archivo)
	{
		int suma=0;
	    int contador = 0;
		//Igualo las variables a 0
		
		try{
			//Scanner lee lo que se ingresa.
			Scanner b = new Scanner(new File(nombre_archivo));
			
			while(b.hasNextInt())
				//hasNextInt  devuelve un booleano verificando si existe un siguiente entero, lo devolverá True si existe, de lo contrario lo devolverá False.
				//http://foro.noticias3d.com/vbulletin/showthread.php?t=382739
				//Se crea un ciclo while para recorrer las variables dentro del archivo
			{
				suma = suma + b.nextInt();
				contador = contador + 1;
				//contador va  ser igual a contador mas 1.
			}
			int promedio = suma/contador;
			//promedio va a ser igual a la suma dividida entre el contador.
			System.out.println(promedio);
			//Imprime
			b.close();
			// retorna la variable asignada.
			return promedio;
			
		}catch (Exception e){
			
			e.printStackTrace();
			//printStackTrace( ) Se utiliza para imprimir el registro del stack donde se ha iniciado la excepción. 
			//http://profesores.fi-b.unam.mx/carlos/java/java_basico5_3.html

		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
