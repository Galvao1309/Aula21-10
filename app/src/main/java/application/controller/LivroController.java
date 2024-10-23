package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import application.repository.EditoraRepository;
import application.repository.GeneroRepository;
import application.repository.LivroRepository;

@Controller
@RequestMapping(value = {"/livros", "/"})
public class LivroController {
    @Autowired
    private LivroRepository livroRepo;
    @Autowired
    private GeneroRepository generoRepo;
    @Autowired
    private EditoraRepository editoraRepo;

    @RequestMapping("/insert")
    public String insert(Model ui) {
        ui.addAttribute("generos", generoRepo.findAll());
        ui.addAttribute("editoras", editoraRepo.findAll());
        return "livros/insert";
    }

    public String insert(
        @RequestParam("titulo") String titulo,
        @RequestParam("genero") long idGenero,
        @RequestParam("editora") long idEditora
    ) {

@RequestMapping(vale = {"/list" , ""})
public String List(Mol ui){
    ui.addAttribute("livros", livroRepo.findAll());
    return " livros/list";

    @RequestMapping("delete")
    public String delete (@RequestParam("id") long id, Model ui) {
        Optional<Livro> sultado = livro.findById(id);

        id(resultdo.isPresent()) {
            ui.addAttribute("livros", reultado.get());
            return " livros/delete";
        }
    }
}
        return "redirect:/livros/list(";
    }
        @RequestMapping(value = "/delete", method = RequestMethod.POST)
        public String delete (@RequestParam("id") long id) {
            livroRepo.deleteBy/Id(id);
            return "redirect: /livros/list";
            
        }
}