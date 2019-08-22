using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace WebServicesCore.Controllers
{
	/* FIELDS TABLE: 
	 * 
	   [CodEmpleado]
      ,[Login]
      ,[Nombre]
      ,[rol]

	 */
	[Route("api/[controller]")]
    [ApiController]
    public class UsuarioController : ControllerBase
    {

		[HttpGet]
		public IEnumerable<string> Get()
		{
			return new string[] { "value1", "value2" };
		}
		[HttpGet("{id}")]
		public string Get(int id)
		{
			return "valueGET";
		}
		[HttpPost]
		public bool Post(string value)
		{
			
				return false;
			
			
		}
		[HttpPut("{id}")]
		public bool Put(int id, [FromBody]string value)
		{
			return true;
		}


		[HttpDelete("{id}")]
		public bool Delete(int id)
		{
			if (id == 1)
				return true;
			else
				return false;
		}

	}

}


