package encrypt.service

import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import javax.inject.Inject


@MicronautTest
class EncryptControllerTest {
    @Inject
    lateinit var client: EncryptClient

    @Test
    fun testHello() {
        assertTrue(client.encrypt("hola").block().text.startsWith("aloh"))
    }
}