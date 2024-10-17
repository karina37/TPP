/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Ap
 * Unless required by applicable lawache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	  https://www.apache.org/licenses/LICENSE-2.0
 * or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculatorTests {

    @Test
    public void testExpressionSuccess() {
        // Тест, що проходить
        Expression exp = new ExpressionBuilder("1+1").build();
        double result = exp.evaluate();
        assertEquals(2, result, "Обчислення виразу '1+1' повинно дати результат 2");
    }
    
    /*@Test
    public void testExpressionFailure() {
        // Тест, що завжди буде провалюватись
        Expression exp = new ExpressionBuilder("5-1").build();
        double result = exp.evaluate();
        assertEquals(2, result, "Обчислення виразу '5-1' повинно дати результат 2 (але це неправда)");
    } */
    
}