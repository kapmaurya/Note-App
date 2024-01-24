package com.example.note.data

import com.example.note.model.Note

class NoteDataSource {
    fun loadNotes(): List<Note>{
        return listOf(
           Note(title = "A Good Day", description = "Good"),
            Note(title = "A Bad Day", description = "Bad")

        )
    }
}