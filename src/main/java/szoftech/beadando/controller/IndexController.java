package szoftech.beadando.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import szoftech.beadando.entity.Konyv;
import szoftech.beadando.repository.KonyvRepository;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private KonyvRepository konyvRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){

        List<Konyv> konyvek = konyvRepository.findAll();
        model.addAttribute("konyvek", konyvek);

        return "index";
    }
}
