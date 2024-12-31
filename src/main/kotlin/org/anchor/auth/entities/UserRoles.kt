package org.anchor.auth.entities

import java.time.LocalDateTime
import javax.persistence.*


// ingz 今そのりくべつを使ってスキーマを生成しています

@Entity
@Table(name = "user_roles")
class UserRoles(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    val user: User,

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    val role: Role,

    val assignedAt: LocalDateTime
)