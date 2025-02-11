package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02.S04T01N02OrtegaValeroDaniel.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda (@RequestParam(value="nom",defaultValue="UNKNOWN")String nom){

        return "Hola, "  + nom + ". Estàs executant un projecte Gradle" ;

    }
    @GetMapping (value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2 (@PathVariable(required=false)String nom){

        return "Hola, "  + nom + ". Estàs executant un projecte Gradle" ;

    }

}


