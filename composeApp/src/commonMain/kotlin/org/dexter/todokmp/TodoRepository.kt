package org.dexter.todokmp

class TodoRepository {
    fun getTodos(): List<TodoItem> {
        return listOf(
            TodoItem("1", "Estudar KMP", isDone = true),
            TodoItem("2", "Implementar Todo List"),
            TodoItem("3", "Testar no Android/iOS/Desktop")
        )
    }
}
