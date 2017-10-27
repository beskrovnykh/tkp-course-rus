import java.awt.Color;

import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DigiFlower {
    public static void main(String[] args) {
    //    Показать черепашку --#1
    //    Сделать так, чтобы черепашка передвигалась как можно быстрее --#7
    //    Сделать так, чтобы цвет фона экрана был цвета серебра  --#8
    //    Увеличить толщину линии пера черепашки на 3 пикселя --#15
    //    Вызвать метод createColorPalette (см. ниже) --#9.1
    //    Проделать следующие действия 15 раз --#13.1
    //      drawOctogon (см. ниже) --#10.1
    //      Повернуть черепашку на угол, равный 1/15 от 360 градусов по часовой стрелке --#12
    //    Конец повторений --#14.2
    //    ------------- Метод createColorPalette --#9.2
    Color color1 = PenColors.Reds.Red;
    Color color2 = PenColors.Oranges.DarkOrange;
    Color color3 = PenColors.Yellows.Gold;
    Color color4 = PenColors.Yellows.Yellow;
    ColorWheel.addColor(color1);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color1);
    //    ------------- Конец метода createColorPalette --#9.3
    //
    //    ------------- Метод drawOctogon --#10.2
    //    Проделать следующие действия 8 раз --#6.1
    //      Задать цвет пера, которым рисует черепашка, равным следующему цвету в палитре (цветовом круге) --#4
    //      Переместить черепашку на 50 пикселей --#2
    //      Повернуть черепашку на 1/8 от 360 градусов по часовой стрелке --#5
    //    Конец повторений --#6.2
    //    ------------- Конец метода drawOctogon --#10.3
    }
}
