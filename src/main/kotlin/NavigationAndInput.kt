import java.util.Scanner

open class NavigationAndInput {
    private val scanner = Scanner(System.`in`)

    fun checkNameOrContentInput(): String {
        var input: String
        do {
            input = scanner.nextLine()
            if (input.isBlank()) println("Это поле не может быть пустым. Пожалуйста, повторите попытку.")
        } while (input.isBlank())
        return input
    }

    fun showMenu(
        screenName: Screens,
        menuItems: List<String>,
        doAction: (Int) -> Unit
    ) {
        while (true) {
            // Вывод инструкции для экрана
            println(screenName.getInstruction())

            // Вывод пунктов меню
            println("0. Выход")
            menuItems.forEachIndexed { index, value ->
                println("${index + 1}. $value")
            }

            // Запуск действия для выбранного пункта меню
            val input = scanner.nextLine()
            if (input.toIntOrNull() != null) {
                if (input.toInt() == 0) return
                if (input.toInt() < 0 || input.toInt() > menuItems.size) println("Команды под таким номером нет. Пожалуйста, повторите попытку.")
                if (input.toInt() > 0 && input.toInt() <= menuItems.size) doAction(input.toInt())
            } else {
                println("Неизвестная команда. Необходимо ввести число, соответствующее номеру нужной команды.")
            }
        }
    }
}