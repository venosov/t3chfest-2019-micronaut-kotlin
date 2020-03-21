package encrypt.service

import io.micronaut.context.ApplicationContext
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class EncryptControllerSpec : Spek({
    describe("HelloController Suite") {
        var embeddedServer: EmbeddedServer = ApplicationContext.run(EmbeddedServer::class.java)
        val encryptClient = embeddedServer.applicationContext.getBean(EncryptClient::class.java)

        it("test /hello responds Hello World") {
            assertTrue {
                encryptClient.encrypt("hola").block().text.startsWith("aloh")
            }
        }

        afterGroup {
            embeddedServer.close()
        }
    }
})
