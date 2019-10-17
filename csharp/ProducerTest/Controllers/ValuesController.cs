using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace ProducerTest.Controllers
{
    [Route("api")]
    [ApiController]
    public class ValuesController : ControllerBase
    {
        [Route("")]
        public ActionResult<string> Index()
        {
            return "welcome" ;
        }

        [Route("test")]
        [HttpGet]
        public ActionResult<string> Get(string name)
        {
            return  "hello " + name;
        }

        
         
    }
}
