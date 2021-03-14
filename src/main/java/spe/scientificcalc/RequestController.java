package spe.scientificcalc;

import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {
    private final Calculator myCalc = new Calculator();
    private HttpResponse answer = new HttpResponse();

    @GetMapping("/root")
    public HttpResponse computeRoot(@RequestParam double n) {
        try {
            answer.setOutput(myCalc.squareRoot(n));
            answer.setStatus(0);
        }
        catch(Exception e) {
            answer.setStatus(-1);
            answer.setMessage("Invalid Operation on given input");
        }
        finally{
            return answer;
        }        
    }

    @GetMapping("/factorial")
    public HttpResponse computeFactorial(@RequestParam double n) {
        try {
            answer.setOutput(myCalc.factorial(n));
            answer.setStatus(0);
        }
        catch(Exception e) {
            answer.setStatus(-1);
            answer.setMessage("Invalid Operation on given input");
        }
        finally{
            return answer;
        }
    }

    @GetMapping("/log")
    public HttpResponse computeLog(@RequestParam double n) {
        try {
            answer.setOutput(myCalc.naturalLog(n));
            answer.setStatus(0);
        }
        catch(Exception e) {
            answer.setStatus(-1);
            answer.setMessage("Invalid Operation on given input");
        }
        finally{
            return answer;
        }
    }

    @GetMapping("/power")
    public HttpResponse computePower(@RequestParam double b, @RequestParam double e) {
        try {
            answer.setOutput(myCalc.power(b,e));
            answer.setStatus(0);
        }
        catch(Exception x) {
            answer.setStatus(-1);
            answer.setMessage("Division by zero !!");
        }
        finally{
            return answer;
        }
    }
}
