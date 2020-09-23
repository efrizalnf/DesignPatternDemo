package kotlin.builder

import java.builderdemo.CustomerBuilder


data class CustomerBuilder(
        var id: Int = 0,
        var name: String = "",
        var email: String = "",
        var address: String = ""
) {


    fun build(): CustomerBuilder {
        return CustomerBuilder(
                id.toString(),
                name,
                email,
                address
        )
    }
}