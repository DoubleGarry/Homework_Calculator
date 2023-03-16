package pro.sky.homework_calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public int addition(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public int subtraction(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public int multiplication(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public int division(Integer num1, Integer num2) {
        if (num1 == 0 || num2 == 0) {
            return Integer.parseInt("На ноль делить нельзя");
        } else {
            return (num1 / num2);
        }
    }
}
