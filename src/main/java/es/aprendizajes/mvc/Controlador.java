package es.aprendizajes.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class Controlador {
	
	@RequestMapping
	public String muestraPaginaInicial() {
		return "paginaInicial";
	}
	
	@RequestMapping("/muestraPaginaFormulario")
	public String muestraPaginaFormulario() {
		return "paginaFormulario";
	}
	
	@RequestMapping("/muestraPaginaGracias")
	public String muestraPaginaGracias() {
		return "paginaGracias";
	}
	
	@RequestMapping("/muestraPaginaGraciasUsandoModel")
	public String muestraPaginaUsandoModel(HttpServletRequest request, Model modelo) {
		// Obtenemos texto del input
		String nombre = request.getParameter("nombrePersona");
		String textoAMostrar = "Has introducido el siguiente nombre: " + nombre;
		
		// Añadimos atributo al modelo
		modelo.addAttribute("textoAMostrar", textoAMostrar);
		
		// Devolvemos la pagina
		return "paginaGraciasUsandoModel";
	}
	
}
