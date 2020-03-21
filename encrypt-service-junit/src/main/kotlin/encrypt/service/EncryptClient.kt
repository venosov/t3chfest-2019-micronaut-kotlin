package encrypt.service

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import reactor.core.publisher.Mono

@Client("/")
interface EncryptClient {
    @Get("/encrypt/{text}")
    fun encrypt(text: String): Mono<MyMessage>
}
