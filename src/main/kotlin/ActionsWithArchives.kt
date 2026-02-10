class ActionsWithArchives : NavigationAndInput() {
    private val archives: MutableList<Archive> = mutableListOf()

    fun createArchive() {
        println("Введите имя архива.")
        val name = checkNameOrContentInput()
        archives.add(Archive(name))
        println("Вы создали архив '$name'.")
    }

    fun showArchives() {
        if (archives.isEmpty()) {
            println("Вы еще не создали ни одного архива.")
        } else {
            val menuItems = archives.map { it.name }
            showMenu(Screens.SHOW_ARCHIVES_AND_CHOOSE_ONE, menuItems) { index ->
                openArchive(archives[index - 1])
            }
        }
    }

    fun openArchive(archive: Archive) {
        val menuItems = listOf("Создать заметку", "Показать созданные заметки",)
        showMenu(Screens.NOTES_MENU, menuItems) { input ->
            when (input) {
                1 -> archive.createNote()
                2 -> archive.showNotes()
            }
        }
    }
}