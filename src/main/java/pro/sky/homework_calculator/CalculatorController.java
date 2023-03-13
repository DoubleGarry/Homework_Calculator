package pro.sky.homework_calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalcService calcService;

    public CalculatorController(CalcService calcService){
        this.calcService = calcService;
    }
    @GetMapping
    public String hello(){
        return calcService.hello();
    }
}
