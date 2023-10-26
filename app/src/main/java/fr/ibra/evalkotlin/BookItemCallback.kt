package fr.ibra.evalkotlin

interface BookItemCallback {
    fun onCellClick(book:Items)
    fun onSaveBook(book:Items)
}