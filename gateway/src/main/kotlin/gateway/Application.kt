package gateway

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("gateway")
                .mainClass(Application.javaClass)
                .start()
    }
}