class MainScreen : NavigationAndInput() {
    private val action = ActionsWithArchives()

    fun start() {
        println("Добро пожаловать в приложение 'Заметки'!")
        println("Здесь вы можете создавать и просматривать архивы и заметки.")
        val menuItems = listOf("Создать архив", "Показать созданные архивы")
        showMenu(Screens.ARCHIVES_MENU, menuItems) { input ->
            when (input) {
                1 -> action.createArchive()
                2 -> action.showArchives()
            }
        }
    }
}