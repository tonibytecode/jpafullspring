using System;
using System.Collections.Generic;
using System.Text;

namespace testConsole
{
	class Carro : Vehiculo
	{

		public Carro() {
			tipo = "Carro";
		}

		public override void CargarCombustible()
		{
			combustible = "Gasolina";
		}

		public override void Acelerar()
		{
			velocidadActual += 40;
			MostrarInformacion();
		}





	}
}
