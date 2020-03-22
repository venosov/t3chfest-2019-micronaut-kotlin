package gateway

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import reactor.core.publisher.Mono

@Controller("/api/\${api.version:v1}")
class GatewayController(private val encryptClient: EncryptClient) : EncryptOperations {
    @Get("/encrypt/{text}")
    override fun encrypt(text: String): Mono<MyMessage> {
        return encryptClient.encrypt(text)
    }
}
