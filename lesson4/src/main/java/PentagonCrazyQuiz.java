import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonCrazyQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonQuizAdapter;

/**
 *      Задание:
 *          Заменить комментарии ниже инструкциями на языке Java так,
 *              чтобы все тесты проходили успешно
 *
 *      Словарь:
 *          Lime - лайм
 *          Sew - шить
 *          Stitch - стежок
 **/
public class PentagonCrazyQuiz extends PentagonQuizAdapter {
  public void question1() {
    //  вызвать метод createAStitch (см. ниже)
    //  ------------- Метод createAStitch
    //  Переместить черепашку на 6 пикселей
    //  ------------- Конец метода createAStitch
  }
  @Override
  public void question2() {
      //  Проделать следующие действия 76 раз
      //      Вызвать метод sewAStitch
      //  Конец повторений
  }

  @Override
  public void question3() {
    //  Добавить цвет лайма в палитру (цветовой круг)
  }

  @Override
  public void question4() {
    //  Добавить красный цвет в палитру (цветовой круг)
  }

  public static void main(String[] args) {
    new PentagonCrazyQuizGrader().grade(new PentagonCrazyQuiz());
  }
}
