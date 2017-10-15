import org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuizGrader;

/**
 *      Задание:
 *          Заменить комментарии ниже инструкциями на языке Java так,
 *              чтобы все тесты проходили успешно
 **/
public class HiLowQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuiz {
    @Override
    public void question1() {
        //  Если координата y черепашки равна 115
        //  Повернуть черепашку на 63 градусов по часовой стрелке
    }

    @Override
    public void question2() {
        //  Если координата x черепашки меньше чем координата y черепашки
        //  Повернуть черепашку на 54 градуса против часовой стрелки
        //  Иначе повернуть черепашку на 22 градуса по часовой стрелке
    }

    @Override
    public void question3() {
        //  Показать пользователю сообщение "elcomeway omehay!"
    }

    @Override
    public void question4() {
        //  Если координата y черепашки больше чем 50
        //  Повернуть черепашку на 177 градусов против часовой стрелки
    }

    public static void main(String[] args) {
        new HiLowQuizGrader().grade(new HiLowQuiz());
    }
}
