import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;
import org.teachingkidsprogramming.recipes.quizzes.graders.SimpleBubbleQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.SimpleBubbleQuizGrader;
/**
 *      Задание: Заменить комментарии ниже инструкциями на языке Java так,
 *          чтобы все тесты проходили успешно
 **/
public class SimpleBubbleQuiz extends SimpleBubbleQuizAdapter implements MouseLeftClickListener, MouseRightClickListener {
    @Override
    public void question1() {
        // код: сделать так, чтобы объект класса SimpleBubbleQuiz мог прослушивать события нажатия на левую кнопку мыши
        // действие: после запуска окна вы должны нажать на левую кнопку мыши
    }

    @Override
    public void question2() {
        // код: написать слово "Single!" желтым цветом в точке с  координатами (155, 135) --(HINT: использовать класс PenColors)
    }

    @Override
    public void question3() {
        // код: сделать так, чтобы объект класса SimpleBubbleQuiz мог прослушивать события нажатия на правую кнопку мыши
        // действие: вы должны кликнуть правой кнопкой в четвертый раз, чтобы правильно ответить на этот вопрос
    }

    @Override
    public void question4() {
        // код: написать "Home Run!" цвета lime green, поместить в точку с координатами (105, 235)
    }

    public static void main(String[] args) {
        new SimpleBubbleQuizGrader().grade(new SimpleBubbleQuiz());
    }

    @Override
    public void onLeftMouseClick(int x, int y) {
        if (counter < 3) {
            if (counter == 0) {
                this.answerQuestion1();
                question2();
                Text baseHit = new Text("Keep Running!");
                baseHit.setPenColor(PenColors.Oranges.Orange);
                baseHit.setTopLeft(105, 35).addTo(Tortoise.getBackgroundWindow());
            }
            drawNextBase();
            counter = counter + 1;
        }
    }

    @Override
    public void onRightMouseClick(int x, int y) {
        if (counter != 3) {
            return;
        }
        this.answerQuestion3();
        question4();
        drawNextBase();
    }
}