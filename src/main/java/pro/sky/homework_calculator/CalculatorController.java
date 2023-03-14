package pro.sky.homework_calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalcService calcService;

    public CalculatorController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return calcService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public int addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.addition(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public int sudtration(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.subtration(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public int multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.multiplication(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public int division(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.division(num1, num2);
    }
}
