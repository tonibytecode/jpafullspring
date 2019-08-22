using System;
using System.Collections.Generic;
using System.Text;

namespace testConsole
{
	class Camion : Vehiculo
	{
		//Constructor
		public Camion()
		{
			//Código para construir el camión
			tipo = "Camión";
		}

		public override void CargarCombustible()
		{
			combustible = "Diesel";
		}
	}
}
