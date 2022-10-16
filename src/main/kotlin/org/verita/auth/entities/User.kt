package  org.verita.auth.entities

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class User(
    @Id
    val id: Long,
    var username: String, // use nickname to identify user.
    var email: String,
    var password: String,
    val uniqueId: String,
)