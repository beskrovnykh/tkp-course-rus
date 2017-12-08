import java.util.ArrayList;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

/**
 *      Задание:
 *          Заменить комментарии ниже инструкциями на языке Java
 *
 *      Словарь:
 *          Clone - клонировать
 *          Turtle - черепашка
 *          Array - массив
 *          List - список
 *          Length - длина
 *
 **/
@SuppressWarnings("unused")
public class CloneTurtles {
  // Раскомментируйте следующие две строки, чтобы создать контейнер (список) из черепашек --#1
  // public ArrayList<Turtle> turtles = new ArrayList<Turtle>();
  // public MultiTurtleWindow window = new MultiTurtleWindow();
  //
  public CloneTurtles() {
    showSomeTurtles();
  }
  //
  private void showSomeTurtles() {
    // Повторить следующие действия 3 раза (использовать цикл for с переменной i) --#4.1
      // Создать новую переменную myTurtle тип Turtle --#2.1
      // Добавьте созданную переменную в контейнер turtles --#2.2
    // Конец повторений --#4.2
    //
    // Создать переменную numberOfTurtles типа int и задать начальное значение этой переменной, равное количеству элементов в списке turtles (длине списка) --#3.1
    // Раскомментируйте следующие 2 строчки для того, чтобы показать кол-во черепашек на экране --#3.2
    // new Text("В контейнере turtles содержится " + numberOfTurtles + " черепашек").setTopLeft(50, 50)
    //    .setPenColor(PenColors.Yellows.Gold).addTo(window);
    //
    // Используя цикл foreach для контейнера (списка) повторить следующие действия --#5.1
      // Добавить и показать черепашку на экране --#5.3
    // Конец повторений --#5.2
    //
    // Выполнить следующие действия 3 раза (использовать цикл for с переменной i)   --#6.1
      // Взять i-ую черепашку из списка turtles и задать ей координату X, равную i*100 + 350 --#6.3
      // Взять i-ую черепашку из списка turtles и задать ей координату Y, равную i*100 + 100 --#6.4
    // Конец повторений --#6.2
    //
    // Используя foreach для списка turtles выполнить следующие действия  --#7.1
      // Установить ширину пера для каждой черепашки равную 10 -- #7.3
      // Установить скорость для каждой черепашки равную 9 --#7.4
      // Сделать так, чтобы каждая черепашка нарисовала звезду размером 100 --#7.5
    // Конец повторений --#7.2
  }
  //
  public static void main(String[] args) {
    new CloneTurtles();
  }
}