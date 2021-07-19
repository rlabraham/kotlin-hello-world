package com.kotlin.helloworld.service

import com.kotlin.helloworld.data.Message
import com.kotlin.helloworld.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message) {
        db.save(message)
    }
}