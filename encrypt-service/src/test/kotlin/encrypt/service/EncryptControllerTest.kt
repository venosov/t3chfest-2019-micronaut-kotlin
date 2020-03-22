package encrypt.service

import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Test
import reactor.test.StepVerifier
import javax.inject.Inject


@MicronautTest
class EncryptControllerTest {
    @Inject
    private lateinit var client: EncryptClient
    @Inject
    private lateinit var embeddedServer: EmbeddedServer

    @Test
    fun testEncrypt() {
        val expected = MyMessage("aloh -> ${embeddedServer.port}")
        val myMessage = client.encrypt("hola")
        StepVerifier.create(myMessage)
                .expectNext(expected)
                .expectComplete()
                .verify()
    }
}