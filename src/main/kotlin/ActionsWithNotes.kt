class ActionsWithNotes : NavigationAndInput() {
    fun createNote(archive: Archive) {
        println("Введите имя заметки.")
        val name = checkNameOrContentInput()
        println("Введите текст заметки.")
        val content = checkNameOrContentInput()
        archive.notes.add(Note(name, content))
        println("Вы создали заметку '$name'.")
    }

    fun showNotes(archive: Archive) {
        if (archive.notes.isEmpty()) {
            println("Вы еще не создали ни одной заметки в данном архиве.")
        } else {
            val menuItems = archive.notes.map { it.name }
            showMenu(Screens.SHOW_NOTES_AND_CHOOSE_ONE, menuItems) { index ->
                archive.notes[index - 1].showNoteContent()
            }
        }
    }
}