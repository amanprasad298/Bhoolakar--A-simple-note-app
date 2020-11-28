package com.example.bhoolakar_asimpleremimder

import androidx.lifecycle.LiveData

class NoteRepository(private val noteDao: NoteDao) {

    val allNotes: LiveData<List<Notes>> = noteDao.getAllNotes()

    suspend fun insert(note: Notes){
        noteDao.insert(note)
    }

    suspend fun delete(note: Notes){
        noteDao.delete(note)
    }

}