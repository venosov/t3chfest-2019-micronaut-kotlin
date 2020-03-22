package gateway

import io.micronaut.retry.annotation.Fallback
import reactor.core.publisher.Mono

@Fallback
class EncryptFallback : EncryptOperations {
    override fun encrypt(text: String): Mono<MyMessage> {
        return Mono.just(MyMessage("Fallback!"))
    }
}
