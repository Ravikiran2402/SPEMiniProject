package spe.scientificcalc;

import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {
    private final Calculator myCalc = new Calculator();
    private HttpResponse answer = new HttpResponse();

    @GetMapping("/root")
    public HttpResponse computeRoot(@RequestParam double n) {
        answer.setOutput(myCalc.squareRoot(n));
        return answer;
    }

    @GetMapping("/factorial")
    public HttpResponse computeFactorial(@RequestParam int n) {
        answer.setOutput(myCalc.factorial(n));
        return answer;
    }

    @GetMapping("/log")
    public HttpResponse computeLog(@RequestParam double n) {
        answer.setOutput(myCalc.naturalLog(n));
        return answer;
    }

    @GetMapping("/power")
    public HttpResponse computePower(@RequestParam double b, @RequestParam double e) {
        answer.setOutput(myCalc.power(b,e));
        return answer;
    }
}
