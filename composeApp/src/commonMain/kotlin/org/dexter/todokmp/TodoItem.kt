package org.dexter.todokmp

data class TodoItem(
    val id: String,
    val title: String,
    val isDone: Boolean = false
)