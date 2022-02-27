package com.codingdojo.hellohuman.ControladorHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControladorHuman {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String paginaInicio(){
		return "Hola humano";
	}
	
	@RequestMapping(value="/nombre", method= RequestMethod.GET)
	public String paginaNombre(@RequestParam(value="nombre") String nombre) {
		String respuesta="";
		respuesta += "<div>Hola "+nombre+"</div>";
		
		return respuesta;
	}
	@RequestMapping(value="/nombre/apellido", method= RequestMethod.GET)
	public String paginaApellido(@RequestParam(value="nombre") String nombre,
			                     @RequestParam(value="apellido") String apellido) {
		String respuesta="";
		respuesta += "<div>Hola "+nombre+ " " + apellido+"</div>";
		
		return respuesta;
	}
	@RequestMapping(value="/nombre/apellido/veces", method= RequestMethod.GET)
	public String paginaRepetir(@RequestParam(value="nombre") String nombre,
			                     @RequestParam(value="apellido") String apellido,
			                     @RequestParam(value="veces") int veces) {
		String respuesta="";
		for(int i = 0; i < veces; i++) {
			respuesta += "<div>Hola "+nombre+ " " + apellido+"</div>";
		}
		
		return respuesta;
	}
}
