enum class Screens {
    ARCHIVES_MENU,
    SHOW_ARCHIVES_AND_CHOOSE_ONE,
    NOTES_MENU,
    SHOW_NOTES_AND_CHOOSE_ONE,
    PARTICULAR_NOTE;

    fun getInstruction() =
        when (this) {
            ARCHIVES_MENU -> "Сейчас вы можете создать новые или просмотреть существующие архивы."
            SHOW_ARCHIVES_AND_CHOOSE_ONE -> "Вывожу список доступных архивов."
            NOTES_MENU -> "Сейчас вы можете создать новые или просмотреть существующие заметки данного архива."
            SHOW_NOTES_AND_CHOOSE_ONE -> "Вывожу список доступных заметок."
            PARTICULAR_NOTE -> "Вы открыли выбранную заметку."
        }
}