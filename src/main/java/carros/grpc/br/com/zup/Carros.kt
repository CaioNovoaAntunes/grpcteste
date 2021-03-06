package carros.grpc.br.com.zup

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Carro(
    @field:NotBlank
    @Column(nullable = false)
    val modelo: String,
    @field:NotBlank
    @Column(nullable = false)
    val placa: String
) {
    @Id
    @GeneratedValue
    var id: Long? = null
}