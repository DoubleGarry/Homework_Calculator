package pro.sky.homework_calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
}
