package be.vdab.javainfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class Java {
    private record Progremmertaal(int gemaaktInJaar,String ontwerper){

    }
    @GetMapping("java")
    Progremmertaal javataal(){
        return new Progremmertaal(1995,"James Gosling");
    }

}
