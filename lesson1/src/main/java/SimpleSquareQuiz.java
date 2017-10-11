import org.teachingkidsprogramming.recipes.quizzes.graders.SimpleSquareQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.SquareQuiz;

/**
 *      Задание:
 *          Ответить на вопросы
 *
 *      Словарь:
 *          Tortoise - черепашка
 *          Set - установить (задать)
 *          Move - переместиться
 *          Turn - повернуть
 *          Width - толщина
 *          Yellow - желтый
 *          Color - цвет
 *          Pen - перо
 **/
public class SimpleSquareQuiz implements SquareQuiz {
    public void question1() {
        //  Переместить черепашку на 110 пикселей
    }

    public void question2() {
        //  Повернуть черепашку на угол, равный 1/5 от 360 градусов, вправо
    }

    public void question3() {
        //  Поменять цвет линии пера, которым рисует черепашка, на желтый
    }

    public void question4() {
        //  Задать толщину линии, которую рисует черепашка, равную 5 пикселям
    }

    public static void main(String[] args) {
        new SimpleSquareQuizGrader().grade(new SimpleSquareQuiz());
    }
}
