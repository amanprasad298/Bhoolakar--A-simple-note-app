package com.example.bhoolakar_asimpleremimder

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: Notes)

    @Delete
    suspend fun delete(note: Notes)

    @Query("Select * from note_table order by id ASC")
    fun getAllNotes(): LiveData<List<Notes>>


}