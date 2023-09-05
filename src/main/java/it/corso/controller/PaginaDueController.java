package it.corso.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// localhost:8080/due
@Controller
@RequestMapping("/due")
public class PaginaDueController
{
	@GetMapping
	public String getPage(
			@RequestParam("nome") String nome,
			@RequestParam("eta") int eta,
			Model model)
	{
		model.addAttribute("nome", nome);
		model.addAttribute("eta", eta);
		return "pagina-due";
	}
}