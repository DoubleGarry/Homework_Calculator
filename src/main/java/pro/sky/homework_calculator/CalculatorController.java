package pro.sky.homework_calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalcService calcService;

    public CalculatorController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String hello() {
        return calcService.hello();
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + "+" + num2 + "=" + calcService.addition(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + "-" + num2 + "=" + calcService.subtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + "x" + num2 + "=" + calcService.multiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == 0 || num2 == 0) {
            return "На ноль делить нельзя";
        } else {
        return num1 + "/" + num2 + "=" + calcService.division(num1, num2);
        }
    }
}
