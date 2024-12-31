package org.anchor.auth.entities

import org.anchor.auth.entities.User
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "session")
class Session(
    @Id
    val sessionId: String,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    val user: User,

    var ipAddress: String,
    var userAgent: String,
    val createdAt: LocalDateTime,
    val expiresAt: LocalDateTime
)