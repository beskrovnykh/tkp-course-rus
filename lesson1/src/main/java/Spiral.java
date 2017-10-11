import org.teachingextensions.logo.utils.EventUtils.MessageBox;

/**
 *      Задание: Спираль
 *          Заменить комментарии ниже инструкциями на языке Java
 *
 *      Словарь:
 *          Spiral - спираль
 *          Tortoise - черепашка
 *          Show - показать
 *          Add - добавить
 *          Blue Violet - сине-фиолетовый
 *          Violet - фиолетовый
 *          Purple - пурпурный
 *          Color Wheel - палитра (цветовое колесо)
 *          Next - следующий
 *          Move - переместить
 *          Turn - повернуть
 *          Color - цвет
 *          Pen - перо
 **/
public class Spiral {
    public static void main(String[] args) {
        //  Показать черепашку --#1
        //  Сделать так, чтобы черепашка передвигалась как можно быстрее --#4
        //  Добавить сине-фиолетовый цвет в палитру --(HINT: использовать объект ColorWheel, сине-фиолетовый цвет находится в группе Purples) --#7
        //  Добавить фиолетовый цвет в палитру --(HINT: фиолетовый цвет находится в группе Purples) --#8
        //  Добавить пурпурный цвет в палитру --(HINT: пурпурный цвет находится в группе Purples) --#9
        //  Повторить следующие действия 75 раз --(HINT: i - номер повторения)--#3.1
        try {
            //  Поменять цвет линии, которой рисует черепашка, на следующий цвет в палитре --#6
            //  Переместить черепашку на расстояние, равное 5 * i --#5
            //  Повернуть черепашку на 1/3 от 360 градусов вправо --#2
        } catch (RuntimeException re) {
            MessageBox.showMessage("Полегче: " + re);
        }
        //  Конец повторений --#3.2
    }
}