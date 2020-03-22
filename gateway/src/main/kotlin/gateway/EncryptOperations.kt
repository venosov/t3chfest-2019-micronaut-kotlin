package gateway

import io.micronaut.http.annotation.Get
import reactor.core.publisher.Mono

interface EncryptOperations {
    @Get("/encrypt/{text}")
    fun encrypt(text: String): Mono<MyMessage>
}