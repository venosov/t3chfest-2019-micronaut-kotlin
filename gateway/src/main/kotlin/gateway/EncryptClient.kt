package gateway

import io.micronaut.http.client.annotation.Client

@Client(id = "encrypt-service")
interface EncryptClient : EncryptOperations
