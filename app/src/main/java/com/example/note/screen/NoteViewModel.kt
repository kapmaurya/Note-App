package com.example.note.screen

import androidx.lifecycle.ViewModel
import com.example.note.data.NoteDataSource
import com.example.note.model.Note

class NoteViewModel :ViewModel(){
   private var noteList= mutableListOf<Note>()

    init {
        noteList.addAll(NoteDataSource().loadNotes())
    }
    fun addNote(note:Note){
        noteList.add(note)
    }

    fun removeNote(note:Note){
        noteList.remove(note)
    }

    fun getAllNotes():List<Note>{
        return noteList
    }

}