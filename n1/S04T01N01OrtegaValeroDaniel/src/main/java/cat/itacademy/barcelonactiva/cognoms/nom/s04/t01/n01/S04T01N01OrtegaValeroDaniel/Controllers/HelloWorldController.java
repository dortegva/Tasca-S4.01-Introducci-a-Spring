package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01OrtegaValeroDaniel.Controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda (@RequestParam(value="nom",defaultValue="UNKNOWN")String nom){

        return "Hola, "  + nom + ". Estàs executant un projecte Maven" ;

    }
    @GetMapping (value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2 (@PathVariable (required=false)String nom){

        return "Hola, "  + nom + ". Estàs executant un projecte Maven" ;

    }

}
