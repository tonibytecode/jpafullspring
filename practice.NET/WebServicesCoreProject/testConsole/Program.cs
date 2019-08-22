using System;
using System.Collections.Generic;
using System.Linq;

namespace testConsole
{
	class Program
	{
		static void Main(string[] args)
		{
			//Console.WriteLine("Hello World!");
			//Carro c1 = new Carro();
			//Camion c2 = new Camion();
			//c1.Acelerar();
			//c1.Frenar();
			//c2.Acelerar();
			//c2.Frenar();

			int[] array;
			array = new int[] { 5,4,3,1,2,3};
			
			List<int> lista = new List<int>();

			for (int i = 0; i < array.Length; i++)
				lista.Add(array[i]);

			foreach(var item in lista)
				Console.WriteLine(item);
		
			List<string> listaString = new List<string>();
			listaString = lista.ConvertAll<string>(delegate (int i)
			{
				return i.ToString();
			});

			foreach(var item in listaString)
				Console.WriteLine(item.GetType());

			foreach (var arr in array)
			{ Console.WriteLine("enteros array: " + arr);
				
			}
			Console.WriteLine ("suma de arrays con linq " + array.Sum());
			Console.WriteLine("Max num de arrays con linq " + array.Max());
			Console.WriteLine("Min num de arrays con linq " + array.Min());
			String cadena = "Im Some One Text";

			cadena = cadena.Remove(4);
			Console.WriteLine( "nueva cadena rmvd " +  cadena);
			cadena = "Im Some One Text";
			
			Console.WriteLine("substring: " + cadena.Substring(2, 5));




			Console.ReadLine();

			
		}
	}
}
