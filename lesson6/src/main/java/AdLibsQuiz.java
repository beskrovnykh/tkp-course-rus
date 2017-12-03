import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingkidsprogramming.recipes.quizzes.graders.AdLibsQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.AdLibsQuizGrader;

/**
 *      Задание:
 *          Заменить комментарии ниже инструкциями на языке Java так,
 *              чтобы все тесты проходили успешно
 *
 *      Словарь:
 *          Pieces - куски
 *          Template - шаблон
 *          Letter - буква
 *          Model - модель
 *          Middle - средний
 *          Word - слово
 *
 **/
public class AdLibsQuiz extends AdLibsQuizAdapter {
	@Override
	public void question1(String letter1, String letter3) {
		// Задать значение переменной word1, равной letter1 + 'o' + letter3
	}

	@Override
	public void question2(String letter1) {
		// Добавить строку letter1 в конец строки word2
	}

	@Override
	public void question3(String templateText, Object model) {
		// Используя класс Parser связать шаблон и модель, результат записать в переменную word3
		word3 = Parser.parse(templateText, model);
	}

	@Override
	public void question4(Pieces pieces) {
		// Задать значение переменной template4 шаблону, который будет порождать строку 'g' + pieces.middle + 'e'
	}

	public static void main(String[] args) {
		new AdLibsQuizGrader().grade(new AdLibsQuiz());
	}
}