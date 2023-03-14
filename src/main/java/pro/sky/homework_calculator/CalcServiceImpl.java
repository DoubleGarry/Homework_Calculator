package pro.sky.homework_calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public int addition(int num1, int num2) {
        return num1 + num2;
    }
    public int subtration(int num1, int num2) {
        return num1 - num2;
    }
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public int division(int num1, int num2) {
        return num1 / num2;
    }
}
