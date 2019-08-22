using System;
using System.Collections.Generic;
using System.Text;

namespace testConsole
{
	public abstract class Vehiculo
	{
		public int velocidadActual;
		public string tipo;
		public string combustible;

		public virtual void Acelerar() {
			velocidadActual += 10;
			MostrarInformacion();
		}

		public void Frenar() {
			velocidadActual = 0;
			MostrarInformacion();
		}

		public abstract void CargarCombustible();

		protected void MostrarInformacion() {

			Console.WriteLine(string.Format("Velocidad del {0} a {1} es de {2} KM/h ", tipo, combustible, velocidadActual));
			Console.ReadLine();
		}

	}
}
