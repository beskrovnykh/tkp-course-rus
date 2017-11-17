import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizGrader;

/**
 *      Задание:
 *          Заменить комментарии ниже инструкциями на языке Java так,
 *              чтобы все тесты проходили успешно
 *
 *      Словарь:
 *          Put - положить
 *          Turn - повернуть
 *          Decrease - уменьшить
 *          Ninety - девяносто
 *          Angles - углы
 **/
public class TreeQuiz extends TreeQuizAdapter {
	public void questions1To4() {
		// Вопрос 1
		// Вызвать метод doubleLength (см. ниже)
		// ------------- Метод doubleLength
		// увеличить в два раза значение переменной length
		// ------------- Конец метода doubleLength
		//
		// Вопрос 2
		// decreaseTurn (см. ниже)
		// ------------- Метод decreaseTurn
		// уменьшить значение переменной turn на 1
		// ------------- Конец метода decreaseTurn
		//
		// Вопрос 3
		// setNinety (см. ниже)
		// ------------- Метод setNinety
		// задать угол поворота, равный 90 градусам, HINT: Использовать angles.put(key,value) и переменную turn
		// ------------- Конец метода setNinety
		//
		// Вопрос 4
		// angleFive (см. ниже)
		// ------------- Метод angleFive
		// сделать пятый угол равным 36 градусам, HINT: Использовать angles.put(key,value)
		// ------------- Конец метода angleFive
	}

	public static void main(String[] args) {
		new TreeQuizGrader().grade(new TreeQuiz());
	}
}