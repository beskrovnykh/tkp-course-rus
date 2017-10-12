import org.junit.Assert;
import org.junit.Test;

/**
 *      Задание: переменные в Java
 *
 *      Шаг 1: Выбрать метод (например, numbersDoNotNeedQuotes на 30-ой строке),
 *          затем нажать на зеленую кнопку (Run...) или
 *            сочетание клавиш для запуска теста ->  для PC в Eclipse: Ctrl+F11, для Mac в Eclipse: Command+Fn+F11
 *      Шаг 2: Убедиться, что задание с тестом не проходит
 *      Шаг 3: Для того чтобы пройти задание, необходимо вместо ___ написать правильный ответ
 *      Шаг 4: После того как тест пройден, повторить вслух то, что вы только что узнали
 *      Шаг 5: Перейти к следующему заданию
 *      ВАЖНО: Ничего кроме подчеркивания ___ менять не нужно!
 **/
public class DeepDive02Variables {

    @Test
    public void youCanReadVariables() throws Exception {
        int numberOfDesserts = 5;
        Assert.assertEquals(numberOfDesserts, ____);
    }

    @Test
    public void youCanSaveVariables() throws Exception {
        int number = ____;
        Assert.assertEquals(10, number);
    }

    @Test
    public void youCanDoMathWithVariables() throws Exception {
        int ____ = 3 + 4;
        Assert.assertEquals(7, numberOfBooks);
    }

    @Test
    public void youCanChangeVariables() throws Exception {
        int milk = 6;
        addChocolate();
        milk = 10;
        Assert.assertEquals(milk, ____);
    }

    @Test
    public void variablesAreSnotStuck() throws Exception {
        int boogers = 4;
        blowNose();
        boogers = ____;
        Assert.assertEquals(0, boogers);
    }

    @Test
    public void youCanAddToAVariable() throws Exception {
        int age = 11;
        celebrateBirthday();
        age += ____;
        Assert.assertEquals(12, age);
    }

    @Test
    public void youCanAddInMultipleWays() throws Exception {
        int bakersDozen = 12;
        bakersDozen = bakersDozen + ____;
        Assert.assertEquals(13, bakersDozen);
    }

    @Test
    public void youCanAddOneInOneMoreWay() throws Exception {
        int bearsInABed = 3;
        andTheLittleOneSaid("I'm lonely, come back here");
        bearsInABed++;
        Assert.assertEquals(bearsInABed, ____);
    }

    @Test
    public void youCanSubtractFromAVariable() throws Exception {
        int amountOfHomework = 3;
        amountOfHomework -= ____;
        Assert.assertEquals(0, amountOfHomework);
    }

    @Test
    public void youCanSubtractOneInOneMoreWay() throws Exception {
        int bottlesOfBeerOnTheWall = 99;
        bottlesOfBeerOnTheWall--;
        Assert.assertEquals(bottlesOfBeerOnTheWall, ____);
    }

    @Test
    public void youCanMultiplyVariables() throws Exception {
        int volumeOfMyVoice = 2;
        int volumeMyMomHears = volumeOfMyVoice * 5;
        Assert.assertEquals(____, volumeMyMomHears);
    }

    @Test
    public void youCanDivideVariables() throws Exception {
        int inches = 36;
        int feet = ____ / 12;
        Assert.assertEquals(3, feet);
    }

    @Test
    public void variablesOnlyExistWithinTheMethod() throws Exception {
        String xmasList = "bike";
        dreamBigger(); // Метод dreamBigger находится чуть ниже
        Assert.assertEquals(xmasList, ___);
    }

    private void dreamBigger() {
        String xmasList = "hippopotamus";
    }

    @Test
    public void methodsCanReturnValues() throws Exception {
        String bedPost = prepareForBed(); // Метод prepareForBed чуть находится ниже
        Assert.assertEquals(bedPost, ___);
    }

    public String prepareForBed() {
        return "gum";
    }

    /**
     * Следующий код нельзя менять, он нужен для того, чтобы тесты работали
     */
    public String ___ = "Вам нужно вписать вместо ___ правильный ответ";
    public int ____ = 1;
    public int numberOfBooks;

    public String ___() {
        return ___;
    }

    private void addChocolate() {
    }

    private void celebrateBirthday() {
    }

    private void blowNose() {
    }

    private void andTheLittleOneSaid(String string) {
    }
}