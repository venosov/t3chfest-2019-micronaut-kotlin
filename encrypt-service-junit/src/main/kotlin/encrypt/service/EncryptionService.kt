package encrypt.service

import io.micronaut.runtime.server.EmbeddedServer
import reactor.core.publisher.Mono
import javax.inject.Singleton

@Singleton
class EncryptionService(private val embeddedServer: EmbeddedServer) {
    fun encrypt(text: String): Mono<MyMessage> {
        val encrypted = StringBuilder(text).reverse().toString()
        return Mono.just(MyMessage("$encrypted -> ${embeddedServer.port}"))
    }
}
