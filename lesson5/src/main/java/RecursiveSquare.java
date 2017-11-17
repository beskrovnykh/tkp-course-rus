

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

/**
 *      Задание:
 *          Заменить комментарии ниже инструкциями на языке Java
 *
 *      Словарь:
 *          Set pen up - приподнять перо
 *          Set pen down - опустить перо
 *          Move back - вернуться
 *          Make - создать
 *          Recursion - рекурсия
 **/
public class RecursiveSquare {
	public static void main(String[] args) throws Exception {
		Tortoise.show();
		Tortoise.getBackgroundWindow().setBackground(PenColors.Greens.DarkGreen);
		Tortoise.setPenColor(PenColors.Yellows.Gold);
		//
		// Сделать так, чтобы черепашка передвигалась как можно быстрее --#8
		// Задать переменной length значение 100.0 --#1.1
		double length = 50.0;
		// Вызвать метод MakeASquare с аргументом length (см. ниже) --#11.4
		//
		// ------------- Метод makeASquare --#11.1
		// Если значение переменной length больше чем 10 --#10.2
		// Вызвать метод moveToTheSquareStart с аргументом length --#4.3
		//
		// ------------- Метод moveToTheSquareStart --#4.1
		// Приподнять перо, которым рисует черепашка --#1.2
		// Переместить черепашку на расстояние, равное значению переменной length разделенному на 2 --#1.3
		// Повернуть черепашку на 90 градусов против часовой стрелки --#2.1
		// Переместить черепашку на расстояние, равное значению переменной length разделенному на 2 --#2.2
		// Повернуть черепашку на 180 градусов по часовой стрелке --#3.1
		// Опустить перо, которым рисует черепашка --#3.2
		// ------------- Конец метода moveToTheSquareStart --#4.2
		//
		// Проделать следующие действия 4 раза --#7.1
		// 		Передвинуть черепашку на расстояние, равное значению переменной length --#6.2
		// 		Вызвать метод MakeASquare с аргументом length, разделенным на 1.7 (см. ниже) --#11.3
		// 		Если счетчик процесса меньше чем 3 --(HINT: использовать 'i') --#9
		// 		Повернуть черепашку на 90 градусов по часовой стрелке --#6.1
		// Конец повторений --#7.2
		//
		// Вызвать метод MoveBackToCenter с аргументом length (см. ниже)--#5.3
		// Create the moveBackToCenter recipe --#5.1
		Tortoise.setPenUp();
		Tortoise.turn(90);
		Tortoise.move(length / 2);
		Tortoise.turn(90);
		Tortoise.move(length / 2);
		Tortoise.turn(180);
		Tortoise.setPenDown();
		//
		//
		// Конец метода moveBackToCenter --#5.2
		//
		// Задать переменной length значение, равное значению переменной length, умноженному на 2 --#10.1
		//
		// ------------- Конец метода makeASquare --#11.2
	}
}
