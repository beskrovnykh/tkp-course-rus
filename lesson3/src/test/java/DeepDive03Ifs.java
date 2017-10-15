import org.junit.Assert;
import org.junit.Test;

/**
 *      Задание: условные операторы в Java
 *
 *      Шаг 1: Выбрать метод затем нажать на зеленую кнопку (Run...) или
 *            сочетание клавиш для запуска теста ->  для PC в Eclipse: Ctrl+F11, для Mac в Eclipse: Command+Fn+F11
 *      Шаг 2: Убедиться, что задание с тестом не проходит
 *      Шаг 3: Для того чтобы пройти задание, необходимо вместо ___ написать правильный ответ
 *      Шаг 4: После того как тест пройден, повторить вслух то, что вы только что узнали
 *      Шаг 5: Перейти к следующему заданию
 *      ВАЖНО: Ничего кроме подчеркивания ___ менять не нужно!
 **/
@SuppressWarnings("unused")
public class DeepDive03Ifs {
    @Test
    public void doesABear() throws Exception {
        String bearPoopPlace = "";
        if (true) {
            bearPoopPlace = "woods";
        }
        Assert.assertEquals("woods", bearPoopPlace);
    }

    @Test
    public void neverEverEver() throws Exception {
        String dessert = "chocolate";
        if (false) {
            dessert = "ketchup";
        }
        Assert.assertEquals("chocolate", dessert);
    }

    @Test
    public void notEverEverEver() throws Exception {
        String dessert = "chocolate";
        if (!true) {
            dessert = "ketchup";
        }
        Assert.assertEquals("chocolate", dessert);
    }

    @Test
    public void isThePopeCatholic() throws Exception {
        String pope = "";
        if (true) {
            pope = "Catholic";
        }
        Assert.assertEquals("Catholic", pope);
    }

    @Test
    public void trueOrFalse() throws Exception {
        String animal = "cat";
        boolean elephant = true;
        if (elephant) {
            animal = "flat " + animal;
        }
        Assert.assertEquals("flat cat", animal);
    }

    @Test
    public void letSleepingBabiesLie() throws Exception {
        String babySounds = "";
        boolean sleeping = false;
        if (sleeping) {
            babySounds = "zzzzzzzzzzzz";
        } else {
            babySounds = "waaaaaahhh!";
        }
        Assert.assertEquals("waaaaaahhh!", babySounds);
    }

    @Test
    public void howCoachThinks() throws Exception {
        String coachSays = "try harder";
        int percentEffort = 110;
        if (percentEffort == 110) {
            coachSays = "good job";
        }
        Assert.assertEquals("good job", coachSays);
    }

    @Test
    public void lessThan() throws Exception {
        String modeOfTransportation = "";
        int age = 15;
        if (age < 16) {
            modeOfTransportation = "keep walking";
        } else {
            modeOfTransportation = "drive away";
        }
        Assert.assertEquals("keep walking", modeOfTransportation);
    }

    @Test
    public void greaterThan() throws Exception {
        String kidSays = "";
        int numberOfIceCreams = 5;
        if (numberOfIceCreams > 4) {
            kidSays = "I think I'm gonna barf";
        } else {
            kidSays = "More ice cream!";
        }
        Assert.assertEquals("I think I'm gonna barf", kidSays);
    }

    @Test
    public void notEqual() throws Exception {
        String playerSays = "";
        int cards = 52;
        if (cards != 52) {
            playerSays = "Not playing with a full deck!";
        } else {
            playerSays = "Game on!";
        }
        Assert.assertEquals("Game on!", playerSays);
    }

    @Test
    public void equalsForStrings() throws Exception {
        String knockKnock = "";
        String whosThere = "bananas";
        if (whosThere.equals("bananas")) {
            knockKnock = "Who's there?";
        } else if (whosThere.equals("orange")) {
            knockKnock = "Orange you glad I didn't say bananas?";
        }
        Assert.assertEquals("Who's there?", knockKnock);
    }

    @Test
    public void thisAndThat() throws Exception {
        String time = "";
        int score = 4;
        int years = 7;
        if (score == 4 && years == 7) {
            time = "Presidential";
        }
        Assert.assertEquals("Presidential", time);
    }

    @Test
    public void theBeginningOrEnd() throws Exception {
        String shoppingList = "";
        int age = 1;
        if (age <= 2 || 90 <= age) {
            shoppingList = "diapers";
        }
        Assert.assertEquals("diapers", shoppingList);
    }

    @Test
    public void ifInHighSchool() throws Exception {
        String status = "";
        int age = 16;
        if (age <= 15) {
            status = "smarty";
        } else if (age > 19) {
            status = "dummy";
        } else {
            status = "normal";
        }
        Assert.assertEquals("normal", status);
    }

    @Test
    public void nestedIfOrPigsInABlanket() throws Exception {
        String status = "";
        String animal = "PIG";
        boolean isWinningKarate = false;
        if (animal.equalsIgnoreCase("pig")) {
            if (isWinningKarate) {
                status = "pork chop";
            } else {
                status = "hambulance";
            }
        }
        Assert.assertEquals("hambulance", status);
    }

    @Test
    public void semicolonsMessUpIfStatements() throws Exception {
        String dessert = "chocolate";
        if (false)
            ;
        {
            dessert = "ketchup";
        }
        Assert.assertEquals("ketchup", dessert);
    }

    /**
     * Следующий код нельзя менять, он нужен для того, чтобы тесты работали
     */
    public boolean _____ = false;
    public boolean ______ = true;
    public String ___ = "Вам нужно вписать вместо ___ правильный ответ";
    public Integer ____ = null;

    public String ___() {
        return ___;
    }
}
