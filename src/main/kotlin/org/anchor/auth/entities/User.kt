package  org.anchor.auth.entities

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.Version

@Entity
@Table(name = "user")
class User(
    @Id
    val id: Long,
    var username: String, // use nickname to identify user.
    var email: String,
    // password is hashed and salted.
    var password: String,
    val uid: String,
    @Version
    var version: Long? = null,

    var profile_url: String? = null
)