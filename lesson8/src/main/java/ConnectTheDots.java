import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;

/**
 *      Задание: ConnectTheDots
 *          Заменить комментарии ниже инструкциями на языке Java
 *
 *      Словарь:
 *          Dot - точка
 *          Transparency - прозрачность
 *
 **/
public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener {
  public static void main(String[] args){
    new ConnectTheDots();
  }
  public ConnectTheDots() {
    setUpTheWindow();
    prepareColorPalette();
    // Сделать так, чтобы объект класса ConnectTheDots мог прослушивать событие нажатия на левую кнопку мыши в окне с черепашкой --#1
    // Сделать так, чтобы объект класса ConnectTheDots мог прослушивать событие нажатия на правую кнопку мыши в окне с черепашкой --#20.2
  }
  @Override
  public void onLeftMouseClick(int x, int y) {
    //    Вызвать метод addDot с параметрами x и y (см. ниже) --#5
    //    ------------- Метод addDot --#6
    //        Вызвать метод createCircle с параметрами x и y (см. ниже) --#2
    //        ------------- Метод createCircle --#3.0
    //           Создать круг с радиусом 11 и следующим цветом в цветовом колесе
    //           Сделать так, чтобы круг был на 60% непрозрачным
    //           Переместить круг circle так, чтобы его центр совпадал с текущими координатами мыши (x,y)
    //           Добавить круг в окно с черепашкой
    //        ------------- Конец метода createCircle --#3.1
    //    Переместить черепашку в точку с координатами (x,y) --#4
    //    ------------- Конец метода addDot
    //    Раскомментировать следующую строчку, чтобы вывести на экране текст "Нажмите правую кнопку, чтобы очистить экран" в точке с координатами (100, 100) --#8
    //    new Text("Нажмите правую кнопку, чтобы очистить экран").setTopLeft(100, 100).addTo(Tortoise.getBackgroundWindow());
  }
  @Override
  public void onRightMouseClick(int x, int y) {
    //    Очистить экран  --(HINT: Использовать класс Tortoise) --#7
  }
  private static void prepareColorPalette() {
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Greens.Green);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Pinks.Pink);
    ColorWheel.addColor(PenColors.Greens.Teal);
  }
  private void setUpTheWindow() {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.hide();
  }
}