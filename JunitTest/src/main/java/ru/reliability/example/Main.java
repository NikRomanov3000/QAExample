package ru.reliability.example;


import ru.reliability.example.services.*;
import ru.reliability.example.services.interfaces.IOService;

public class Main {

  public static void main(String[] args) {
    IOService closedConsoleIOService = new ClosedConsoleIOService();
    IOService openedConsoleIOService = new OpenedConsoleIOService(new ConsoleContext());

    closedConsoleIOService.out("Hello World");
    //openedConsoleIOService.out("Hello World 2");

/*
        CalculatorService calculatorService = new CalculatorServiceImpl(openedConsoleIOService);
        calculatorService.readTwoDigitsAndMultiply();
        openedConsoleIOService.out("---------------------------------------------------------");
        calculatorService.readTwoDigitsAndMultiply("Введите два числа и мы их перемножим!");
        openedConsoleIOService.out("---------------------------------------------------------");
        calculatorService.multiplyTwoDigits("Мы перемножили для вас два числа. Результат смотри ниже", 53, 42);
        openedConsoleIOService.out("---------------------------------------------------------");
*/
  }
}
