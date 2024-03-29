package com.example.note.model

import android.icu.text.CaseMap.Title
import java.time.LocalDateTime
import java.util.Date
import java.util.UUID

data class Note(
    val id: UUID=UUID.randomUUID(),
    val title: String,
    val description :String,
    val entryDate:LocalDateTime=LocalDateTime.now()
          )
