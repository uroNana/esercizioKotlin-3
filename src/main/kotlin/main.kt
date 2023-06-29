//Write sealed class for a type User that uses data classes for different types: Email, Facebook,
// Google. They need to each have an id, and optionally password or email.
// Use them in a when inside a method to return a printable value as String.

sealed class User(open val id: String) {
}

data class EmailUser(override val id: String, val email: String): User (id)

data class FacebookUser(override val id: String, val password: String): User (id)

data class GoogleUser(override val id: String, val email: String, val password: String): User (id)



fun log(user: User) = when(user) {
        is EmailUser -> println("$user")
        is FacebookUser -> println("$user")
        is GoogleUser -> println("$user")
}


fun main() {
    val user1 = EmailUser("uroNana", "mirianamartinelli97@libero.it")
    val user2 = GoogleUser("Miriana", "mirianamartinelli97@libero.it", "0000")
    log(user1)
    log(user2)
}