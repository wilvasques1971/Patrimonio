package https.github.com.wilvasques1971.Patrimonio.git.Patrimonio.controller;


import https.github.com.wilvasques1971.Patrimonio.git.Patrimonio.model.Patrimonio;
import https.github.com.wilvasques1971.Patrimonio.git.Patrimonio.service.PatrimonioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@RequestMapping("/patrimonios")

public class PatrimonioController {

    @Autowired

    private PatrimonioService service;
    //listar todos os patrimonios

    @GetMapping
    public String listar(Model model){
        model.addAttribute("ListarPatrimonios", service.listarTodos());
        return "Listar";
    }

    // formulario para novo patrimonio

    @GetMapping("/novo")

    public  String novoFormulario(Model model){
        model.addAttribute("patrimonio",new Patrimonio());
        return "formulario";
    }

    // formulario para editar patrimonio existente

    @GetMapping("/editar/{id}")

    public String editarFormulario(@PathVariable("id") Long id, Model model){
        Optional<Patrimonio> patrimonio = service.BuscarPorId(id);

        if (patrimonio.isPresent()){
            model.addAttribute("patrimonio", patrimonio.get());
            return "formulario";
        }
        return "redrect:/patrimonios";
    }
    //Salvar/atualizar patrimonio
    @PostMapping ("/salvar")
    public String salvar(@ModelAttribute ("patrimonio")Patrimonio patrimonio){
        service.Salvar(patrimonio);
        return "redirect:/patrimonios";
    }
    // Excluir patrimonio
    @GetMapping("/excluir/{id}")

    public  String excluir(@PathVariable("id") Long id){
        service.Deletar(id);
        return "redirect:/patrimonios";
    }

}