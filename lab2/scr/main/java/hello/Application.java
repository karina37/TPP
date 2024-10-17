package hello; 
 
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
 
import net.objecthunter.exp4j.Expression; 
import net.objecthunter.exp4j.ExpressionBuilder; 
import org.springframework.web.bind.annotation.*; 
 
@SpringBootApplication 
@RestController 
public class Application { 
 
 @RequestMapping("/") 
 public String home() { 
        return "<html>" + 
                "<h1>Калькулятор</h1>" + 
                "<form action='/calculate' method='post'>" + 
                "Введіть вираз: <input type='text' name='expression'/>" + 
                "<button type='submit'>Обчислити</button>" + 
                "</form>" + 
    "<p>Результат: <span id='result'></span></p>" + 
    "</html>"; 
    } 
 @PostMapping("/calculate") 
    public String calculate(@RequestParam String expression) { 
        try { 
            Expression exp = new ExpressionBuilder(expression).build(); 
            double result = exp.evaluate(); 
            return "<html>" + 
                    "<h1>Калькулятор</h1>" + 
                    "<form action='/calculate' method='post'>" + 
                    "Введіть вираз: <input type='text' name='expression'/>" + 
                    "<button type='submit'>Обчислити</button>" + 
                    "</form>" + 
                    "<p>Результат: <span id='result'>" + result + "</span></p>" + 
                    "</html>"; 
        } catch (Exception e) { 
            return "<html>" + 
                    "<h1>Калькулятор</h1>" + 
                    "<form action='/calculate' method='post'>" + 
                    "Введіть вираз: <input type='text' name='expression'/>" + 
                    "<button type='submit'>Обчислити</button>" + 
                    "</form>" + 
                    "<p style='color:red;'>Помилка в обчисленні виразу</p>" + 
                    "</html>"; 
        } 
    } 
 
    public static void main(String[] args) { 
        SpringApplication.run(Application.class, args); 
    } 
 
}
