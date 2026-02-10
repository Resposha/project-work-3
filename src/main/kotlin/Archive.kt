class Archive(val name: String) : NavigationAndInput() {
    private val notes: MutableList<Note> = mutableListOf()

    fun createNote() {
        println("Введите имя заметки.")
        val name = checkNameOrContentInput()
        println("Введите текст заметки.")
        val content = checkNameOrContentInput()
        notes.add(Note(name, content))
        println("Вы создали заметку '$name'.")
    }

    fun showNotes() {
        if (notes.isEmpty()) {
            println("Вы еще не создали ни одной заметки в данном архиве.")
        } else {
            val menuItems = notes.map { it.name }
            showMenu(Screens.SHOW_NOTES_AND_CHOOSE_ONE, menuItems) { index ->
                notes[index - 1].showNoteContent()
            }
        }
    }
}
