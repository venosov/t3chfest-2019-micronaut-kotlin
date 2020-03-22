package gateway

import io.micronaut.http.client.annotation.Client

@Client(id = "encrypt-service-junit")
interface EncryptClient : EncryptOperations
