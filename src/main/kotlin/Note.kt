class Note(val name: String, val content: String) {
    fun showNoteContent() {
        println(Screens.PARTICULAR_NOTE.getInstruction())
        println("Заметка '$name' содержит следующий текст: \n$content")
    }
}