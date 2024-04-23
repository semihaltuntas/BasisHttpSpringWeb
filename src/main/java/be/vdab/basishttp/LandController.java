package be.vdab.basishttp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class LandController {
    @GetMapping("land")
    String onsLand() {
        return "Belgie";
    }
    private record Persoon(String voornaam,String familienaam,int aantalKinderen){
    }
    @GetMapping("koning")
    Persoon onzeKoning(){
        return new Persoon("Filip","van Belgie",4);
    }
}
