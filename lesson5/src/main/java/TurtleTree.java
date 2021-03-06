
import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;

/**
 *      Задание:
 *          Заменить комментарии ниже инструкциями на языке Java
 *
 *      Словарь:
 *          Branch - ветвь
 *          Adjust - регулировать
 *          Shorter - более короткая
 *          Lower - нижняя
 **/
public class TurtleTree {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    Tortoise.show();
    //    Сделать так, чтобы черепашка передвигалась как можно быстрее --#10
    //    Сделать фон окна черным  --#21
    //    Задать значение переменной length = 60 --#1.2
    //    Вызвать метод drawBranch(recipe below) --#2.1
    //
    //    ------------- Метод drawBranch --#2.2
    //        Если текущее значение переменной length больше чем ноль, выполнить следующие действия (вплоть до окончания метода) --#5
    //        Вызвать метод adjustColor (см. ниже) --#15.1
    //        ------------- Метод adjustColor --#15.2
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    //            Ветвь длиной 10 имеет цвет lime --#20
    //            Ветвь длиной 20 имеет цвет forest green --#19
    //            Ветвь длиной 30 имеет цвет dark green --#18
    //            Ветвь длиной 40 имеет цвет olive --#17
    //            Ветвь длиной 50 имеет цвет sienna --#14
    //            Ветвь длиной 60 имеет цвет saddle brown (TIP: сохранить цвета в хэш-таблице 'colors')--#13 
    //            Использовать значение переменной length из хэш-таблицы 'colors', для того чтобы задать перу нужный цвет --#21
    //        ------------- Конец метода adjustColor --#15.3
    //
    //        Переместить черепашку на значение переменной length --#1.1
    //        Вызвать метод drawLowerBranches (см. ниже) --#6.1
    //
    //        ------------- Метод drawLowerBranches --#6.2
    //            Повернуть черепашку на угол, равный 30 градусов по часовой стрелке --#3
    //            Вызвать метод drawShorterBranch (см. ниже) --#8.1
    //
    //            ------------- Метод drawShorterBranch --#8.2
    //            Вызвать метод drawBranch (на 10 пикселей короче) --#4
    //            ------------- Конец метода drawShorterBranch --#8.3
    //
    //            Повернуть черепашку на 60 градусов против часовой стрелке --#7
    //            Вызвать метод drawShorterBranch --#9
    //            Повернуть черепашку на 30 градусов по часовой стрелке --#12
    //            Вызвать метод adjustColor --#16
    //            Переместить черепашку на значение переменной length в обратном направлении --#11
    //        ------------- Конец метода drawLowerBranches --#6.3
    //
	// ------------- Конец метода drawBranch --#2.3
	}
}