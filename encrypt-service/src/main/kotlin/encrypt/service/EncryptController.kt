package encrypt.service

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.tracing.annotation.NewSpan
import io.micronaut.tracing.annotation.SpanTag
import reactor.core.publisher.Mono

@Controller("/")
open class EncryptController(private val encryptionService: EncryptionService) {
    @NewSpan
    @Get("/encrypt/{text}")
    open fun encrypt(@SpanTag("plainText") text: String): Mono<MyMessage> {
        return encryptionService.encrypt(text)
    }

}
