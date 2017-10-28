import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class KnottedRing {
  public static void main(String[] args) {
    Tortoise.show();
    //      Сделать так, чтобы черепашка перемещалась как можно быстрее --#4
    createColorPalette();
    //          Проделать следующие действия 30 раз --#10.1
    //              Задать цвет пера, которым рисует черепашка, равным следующему цвету в палитре (цветовом круге) --#5
    //              Вызвать метод drawOctagonWithOverlap (см. ниже) --#8.0
    //              ------------- Метода drawOctagonWithOverlap --#7.1
    //                  Проделать следующие действия 8 + 1 раз --#3.1
    //                        Переместить черепашку на расстояние, равное 110 пикселям --#1
    //                        Повернуть черепашку на угол, равный 1/8 от 360 градусов по часовой стрелке --#2
    //                  Конец повторений --#3.2
    //              ------------- Конец метода drawOctagonWithOverlap --#7.2
    //       Повернуть черепашку на угол, равный 1/30 от 360 градусов по часовой стрелке --#9
    //       Повернуть черепашку еще на 5 градусов по часовой стрелке --#11
    //       Конец повторений --#10.2
  }

  private static void createColorPalette() {
    ColorWheel.addColor(PenColors.Pinks.HotPink);
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Pinks.Fuchsia);
    ColorWheel.addColor(PenColors.Reds.OrangeRed);
    ColorWheel.addColor(PenColors.Pinks.DeepPink);
    ColorWheel.addColor(PenColors.Reds.MediumVioletRed);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.Tomato);
  }
}
