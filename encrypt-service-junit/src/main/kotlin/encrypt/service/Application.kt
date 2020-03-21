package encrypt.service

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("encrypt.service")
                .mainClass(Application.javaClass)
                .start()
    }
}