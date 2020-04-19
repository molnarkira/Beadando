package szoftech.beadando.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import szoftech.beadando.entity.Konyv;
import szoftech.beadando.repository.KonyvRepository;

@Controller
public class KonyvController {

    @Autowired
    private KonyvRepository konyvRepository;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public  String saveKonyv(@RequestParam String konyv_author,
                             @RequestParam String konyv_title,
                             @RequestParam int konyv_year,
                             @RequestParam String konyv_description){

        Konyv newKonyv = new Konyv();
        newKonyv.setAuthor(konyv_author);
        newKonyv.setTitle(konyv_title);
        newKonyv.setYear(konyv_year);
        newKonyv.setDescription(konyv_description);

        konyvRepository.save(newKonyv);

        return "redirect:";
    }
}
