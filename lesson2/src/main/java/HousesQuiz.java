import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

/**
 *      Задание:
 *          Заменить комментарии ниже инструкциями на языке Java так,
 *              чтобы 6 из 6 тестов проходили успешно.
 **/
public class HousesQuiz extends HousesQuizAdapter {
    @SuppressWarnings("unused")
    public void questions1Thru6() {
        //   Задание 1
        //   Вызвать small (см. ниже)
        //   ------------- Метод small
        length = 7;
        //   ------------- Конец метода small
        //
        //   Задание 2
        //   Вызвать medium (см. ниже)
        //   ------------- Метод medium
        //      Задать значение переменной length равное 21
        //   ------------- Конец метода medium
        //
        //   Задание 3
        //   Вызвать large (см. ниже)
        //   ------------- Метод large
        //      Задать значение переменной length равное 63
        //   ------------- Конец метода large
        //
        //   Задание 4
        //   Вызвать moveTheLength (см. ниже)
        //   ------------- Метод moveTheLength
        //      Переместить черепашку на расстояние, равное текущему значению переменной length
        //   ------------- Конец метода moveTheLength
        //
        //   Задание 5
        //   Вызвать turnTheCorner (см. ниже)
        //   ------------- Метод turnTheCorner
        //      Повернуть черепашку на угол, равный 1/3 от 360 градусов, налево
        //   ------------- Конец метода turnTheCorner
        //
        //   Question6
        //   Вызвать drawASide (см. ниже)
        //   ------------- Метод drawASide
        //      Вызвать метод moveTheLength
        //      Вызвать метод turnTheCorner
        //   ------------- Конец метода drawASide
    }
    public static void main(String[] args) {
        new HousesQuizGrader().grade(new HousesQuiz());
    }
}
