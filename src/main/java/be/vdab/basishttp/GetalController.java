package be.vdab.basishttp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class GetalController {
    @GetMapping("geluk")
    int geluksGetal() {
        return 7;
    }

    @GetMapping("ongeluk")
    int ongeluksGetal() {
        return 666;
    }
}
