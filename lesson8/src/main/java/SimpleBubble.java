import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
/**
 *      Задание: SimpleBubble
 *          Заменить комментарии ниже инструкциями на языке Java
 *
 *      Словарь:
 *          Bubble - пузырь
 *          Program window - окно программы
 *          Clear - очистить
 *          Listener - слушатель
 *
 **/
public class SimpleBubble implements MouseLeftClickListener {
  public SimpleBubble() {
    //    Создать объект ProgramWindow под названием "Мои пузыри" и сделать его полем класса --#1.1
    //    Раскомментировать строку ниже -- #1.2
    //    programWindow.setWindowVisible(true);
    //    Сделать так, чтобы объект класса SimpleBubble мог прослушивать событие нажатия левой кнопки мыши --#2.2
    //    Вызвать метод prepareColorPalette (см. ниже) --#7.1
    //
    //    ------------- Метод prepareColorPalette --#7.2
    //         Добавить цвет purple в цветовой круг --#2.3
    //         Добавить цвет light steel blue в цветовой круг --#4
    //         Добавить цвет blue в цветовой круг --#5
    //         Добавить цвет dark blue в цветовой круг --#6
    //    ------------- Конец метода prepareColorPalette --#7.3
  }
  @Override
  public void onLeftMouseClick(int x, int y) {
    //     Вызвать createBubble (см. ниже) --#8.1
    //     ------------- Метод createBubble --#8.2
    //     Удалить все пузыри из окна программы --#9
    //     Создать целочисленную переменную radius, которой присвоить случайное число между 10 и 50 --(HINT: использовать NumberUtils) --#2.5
    //     Создать круг с радиусом radius и следующим цветом в цветовом колесе --#2.1
    //     Переместить центр круга в текущие координаты мыши в программном окне --#3
    //     Добавить круг в программное окно --#2.4
    //    ------------- Конец метода createBubble --#8.3
  }
  public static void main(String[] args) {
    new SimpleBubble();
  }
}