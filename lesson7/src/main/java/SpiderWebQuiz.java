import org.teachingkidsprogramming.recipes.quizzes.graders.SpiderQuiz;
import org.teachingkidsprogramming.recipes.quizzes.graders.SpiderWebQuizGrader;

public class SpiderWebQuiz extends SpiderQuiz {
    /**
     *      Задание: Заменить комментарии ниже инструкциями на языке Java так,
     *          чтобы все тесты проходили успешно
     *
     *      Внимание: Методы, которые мы создаем в этом уроке не являются статическими
     *      Это значит, что слово static перед названием методов писать не нужно.
     **/
    @Override
    public void question1() {
        // Повторить следующие действие number кол-во раз, где number - это название переменной
            // Вызвать метод circle
        // Конец повторений
    }

    public void question2() {
        // Создать, а затем вызвать метод (не статический) под названием circleAround, который
        // Повторяет следующие действия три раза
            // Вызвать метод adjust()
            // Вызвать метод question1
        // Конец повторений
    }

    public void question3() {
        // Создать, а затем вызвать метод под названием grow, который
        // Изменяет значение переменной length, умножая его на 2.5
    }

    public void question4() {
        // Создать, а затем вызвать метод под названием shrink, который
        // Изменяет значение переменной length, уменьшая его на 9
    }

    public void question5() {
        // Создать, а затем вызвать метод под названием expand, который
        // Изменяет значение переменной number, увеличивая его на 12
    }

    public static void main(String[] args) {
        new SpiderWebQuizGrader().grade(new SpiderWebQuiz());
    }
}