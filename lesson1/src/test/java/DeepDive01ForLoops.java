import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.TortoiseUtils;
/**
 *      Задание: циклы в Java
 *
 *      Шаг 1: Выбрать метод (например, numbersDoNotNeedQuotes на 24-ой строке),
 *          затем нажать на зеленую кнопку (Run...) или
 *            сочетание клавиш для запуска теста ->  для PC в Eclipse: Ctrl+F11, для Mac в Eclipse: Command+Fn+F11
 *      Шаг 2: Убедиться, что задание с тестом не проходит
 *      Шаг 3: Для того чтобы пройти задание, необходимо вместо ___ написать правильный ответ
 *      Шаг 4: После того как тест пройден, повторить вслух то, что вы только что узнали
 *      Шаг 5: Перейти к следующему заданию
 *      ВАЖНО: Ничего кроме подчеркивания ___ менять не нужно!
 **/
public class DeepDive01ForLoops {
    @Test
    public void numbersDoNotNeedQuotes() {
        Assert.assertEquals(42, ____);
    }

    @Test
    public void defaultWidthForTheTortoise() throws Exception {
        Assert.assertEquals(Tortoise.getPenWidth(), ____);
    }

    @Test
    public void stringsNeedQuotes() throws Exception {
        Assert.assertEquals("Green", ___);
    }

    @Test
    public void stringsCanIncludeSpaces() throws Exception {
        Assert.assertEquals("This is a string", ___);
    }

    @Test
    public void stringsCanIncludeRussian() throws Exception {
        Assert.assertEquals("Привет", ___);
    }

    @Test
    public void changingThePenWidthTo5() throws Exception {
        Tortoise.setPenWidth(____);
        Assert.assertEquals(5, Tortoise.getPenWidth());
    }

    @Test
    public void movingTheTortoise100Pixels() throws Exception {
        int start = Tortoise.getY();
        Tortoise.move(____);
        Assert.assertEquals(Tortoise.getY(), start - 100);
    }

    @Test
    public void theTortoiseTurns21() throws Exception {
        Tortoise.turn(____);
        Assert.assertEquals(21.0, Tortoise.getAngle(), 0.01);
    }

    @Test
    public void theTortoiseTurns15Twice() throws Exception {
        Tortoise.turn(____);
        Tortoise.turn(____);
        Assert.assertEquals(30.0, Tortoise.getAngle(), 0.01);
    }

    @Test
    public void howFastCanTheTortoiseGo() throws Exception {
        Tortoise.setSpeed(____);
        Assert.assertEquals(topSpeed, Tortoise.getSpeed());
        // Подсказка: посмотреть документацию к методу setSpeed
    }

    @Test
    public void assigningVariables() throws Exception {
        int myFavoriteNumber = 101;
        Assert.assertEquals(myFavoriteNumber, ____);
    }

    @Test
    public void combiningNumbers() throws Exception {
        int age = 3 + 4;
        Assert.assertEquals(age, ____);
    }

    @Test
    public void combiningText() throws Exception {
        String name = "Peter" + " " + "Pan";
        Assert.assertEquals(name, ___);
    }

    @Test
    public void combiningTextAndNumbers() throws Exception {
        String name = "Henry The " + 8;
        Assert.assertEquals(name, ___);
    }

    @Test
    public void textIsTextEvenWhenItsNumbers() throws Exception {
        String age = "3" + "4";
        Assert.assertEquals(age, ___);
    }

    @Test
    public void combiningTextInALoop() throws Exception {
        String sound = "A";
        for (int i = 0; i < 3; i++) {
            sound += "H";
        }
        Assert.assertEquals(sound, ___);
    }

    @Test
    public void forLoopsEndAtTheEnd() throws Exception {
        String numbers = "# ";
        for (int i = 0; i < ____; i++) {
            numbers += i;
            preventInfiniteLoops();
        }
        Assert.assertEquals("# 012345", numbers);
    }

    @Test
    public void forLoopsCanStartAnywhere() throws Exception {
        String answer = "Потому что ";
        for (int i = ____; i < 10; i++) {
            answer += i;
            preventInfiniteLoops();
        }
        // Вопрос: почему 7 самое страшное число?
        Assert.assertEquals("Потому что 789", answer);
    }

    @Test
    public void forLoopsCanSkip() throws Exception {
        String numbers = "# ";
        for (int i = 1; i < 20; i += ____) {
            numbers = numbers + i + ",";
            preventInfiniteLoops();
        }
        Assert.assertEquals("# 1,3,5,7,9,11,13,15,17,19,", numbers);
    }

    @Test
    public void forLoopsCanSkipUpAndDown() throws Exception {
        String numbers = "# ";
        for (int i = 20; 0 < i && i < 40; i += ____) {
            numbers = numbers + i + ",";
            preventInfiniteLoops();
        }
        Assert.assertEquals("# 20,17,14,11,8,5,2,", numbers);
    }

    @Test
    public void forLoopsCanGoBackwards() throws Exception {
        String numbers = "Обратно: ";
        for (int i = 9; i >= 1; i += ____) {
            numbers += i;
            preventInfiniteLoops();
        }
        Assert.assertEquals("Обратно: 987654321", numbers);
    }

    @Test
    public void semicolonsMessUpForLoops() throws Exception {
        String sound = "A";
        for (int i = 0; i < 13; i++) ;
        {
            sound += "H";
        }
        Assert.assertEquals(sound, ___);
    }

    /**
     * Следующий код нельзя менять, он нужен для того, чтобы тесты работали
     */
    public String ___ = "Вам нужно вписать вместо ___ правильный ответ";
    public int ____ = 1;
    int topSpeed = 10;
    int counter = 0;

    @Before
    public void init() {
        TortoiseUtils.resetTurtle();
        Tortoise.setSpeed(Turtle.TEST_SPEED);
    }

    private void preventInfiniteLoops() {
        if (counter++ > 100) {
            throw new RuntimeException("Вы только что создали бесконечный цикл");
        }
    }
}
