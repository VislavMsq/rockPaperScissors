import javax.swing.JOptionPane;

public class RockPaperScissors {

    public static void main(String[] args) {

        String[] options = { "Камень", "Ножницы", "Бумага" };

        while (true) {
            // Запрос хода первого игрока
            String human1Input = JOptionPane.showInputDialog(null, "Игрок 1: Камень, Ножницы или Бумага?", "Камень, Ножницы, Бумага");
            // Запрос хода второго игрока
            String human2Input = JOptionPane.showInputDialog(null, "Игрок 2: Камень, Ножницы или Бумага?", "Камень, Ножницы, Бумага");

            // Проверка на ничью
            if (human1Input.equals(human2Input)) {
                JOptionPane.showMessageDialog(null, "Ничья!");
                continue;
            }

            // Проверка выигрышных комбинаций
            if ((human1Input.equals("Камень") && human2Input.equals("Ножницы"))
                    || (human1Input.equals("Ножницы") && human2Input.equals("Бумага"))
                    || (human1Input.equals("Бумага") && human2Input.equals("Камень"))) {
                JOptionPane.showMessageDialog(null, "Игрок 1 победил!");
            } else {
                JOptionPane.showMessageDialog(null, "Игрок 2 победил!");
            }

            // Запрос на повтор игры
            int playAgain = JOptionPane.showConfirmDialog(null, "Сыграть еще раз?", "Камень, Ножницы, Бумага", JOptionPane.YES_NO_OPTION);
            if (playAgain != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
}





