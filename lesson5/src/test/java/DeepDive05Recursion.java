

import java.awt.Color;
import java.awt.Cursor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DeepDive05Recursion {
    /**
     *      Задание:
     *
     *      Шаг 1: Выбрать метод затем нажать на зеленую кнопку (Run...) или
     *            сочетание клавиш для запуска теста ->  для PC в Eclipse: Ctrl+F11, для Mac в Eclipse: Command+Fn+F11
     *      Шаг 2: Убедиться, что задание с тестом не проходит
     *      Шаг 3: Для того чтобы пройти задание, необходимо вместо ___ написать правильный ответ
     *      Шаг 4: После того как тест пройден, повторить вслух то, что вы только что узнали
     *      Шаг 5: Перейти к следующему заданию
     *      ВАЖНО: Ничего кроме подчеркивания ___ менять не нужно!
     **/
	@Test
	public void changeThePointerToAHand() throws Exception {
		Tortoise.getBackgroundWindow().___();
		Assert.assertEquals(getCursor(), Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}

	@Test
	public void getTheWindow() throws Exception {
		Tortoise.___().setCursor(Cursor.CROSSHAIR_CURSOR);
		Assert.assertEquals(getCursor(), Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
	}

	@Test
	public void setColorUsingKey() throws Exception {
		HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
		colors.put(10, PenColors.Greens.Lime);
		colors.put(____, PenColors.Greens.DarkGreen);
		Assert.assertEquals(PenColors.Greens.DarkGreen, colors.get(20));
	}

	@Test
	public void findTheGreenKey() throws Exception {
		HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
		colors.put(20, PenColors.Greens.DarkGreen);
		colors.put(30, PenColors.Greens.Green);
		Assert.assertEquals(PenColors.Greens.Green, colors.get(___));
	}

	@Test
	public void findTheColorForTheBananaKey() throws Exception {
		HashMap<String, Color> colors = new HashMap<String, Color>();
		colors.put("banana", PenColors.Yellows.Yellow);
		colors.put("apple", PenColors.Reds.Red);
		Assert.assertEquals(_______, colors.get("banana"));
	}

	@Test
	public void findTheNumberPositionOfTheWorld() throws Exception {
		List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
		String result = messages.get(____);
		Assert.assertEquals("World!", result);
	}

	@Test
	public void getWhatsLast() throws Exception {
		List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
		String result = messages.get(4);
		Assert.assertEquals(___, result);
	}

	@Test
	public void whatIsLastNow() throws Exception {
		List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
		messages.set(4, ___);
		String result = messages.get(4);
		Assert.assertEquals("The rest of them", result);
	}

	@Test
	public void putAQuarterAtTheEnd() throws Exception {
		int[] coins = { 1, 5, 10, ____ };
		Assert.assertEquals(25, coins[3]);
	}

	@Test
	public void getThirdCoin() throws Exception {
		int[] coins = { 1, 5, 10, 25 };
		Assert.assertEquals(10, coins[____]);
	}

	@Test
	public void whichCoinIsSecond() throws Exception {
		int[] coins = { 1, 5, 10, 25 };
		Assert.assertEquals(____, coins[1]);
	}

	@Test
	public void putAFiftyCentPieceFirst() throws Exception {
		int[] coins = { 1, 5, 10, 25 };
		coins[0] = ____;
		Assert.assertEquals(50, coins[0]);
	}

	/**
	 * Следующий код не нужно менять, он нужен для того, чтобы тесты работали
	 */
	public boolean _____ = false;
	public boolean ______ = true;
	public String ___ = "Вам нужно вписать вместо ___ правильный ответ";
	public int ____ = 0;
	public Color _______;

	public String ___() {
		return ___;
	}

	private Cursor getCursor() {
		return Tortoise.getBackgroundWindow().getCanvas().getCursor();
	}
}