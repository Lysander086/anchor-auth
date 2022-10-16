package com.richdataco.pub.authorization.entity

import lombok.Data
import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Data
@Entity
@Table(name = "oauth_client_details")
class OAuthClientDetails(
    @Id
    @Column(name = "CLIENT_ID", nullable = false)
    private val clientId: String,

    @Column(name = "CLIENT_SECRET")
    private val clientSecret: String,

    @Column(name = "AUTHORITIES")
    private val authorities: String,

    @Column(name = "ACCESS_TOKEN_VALIDITY")
    private val accessTokenValidity: Int,

    @Column(name = "REFRESH_TOKEN_VALIDITY")
    private val refreshTokenValidity: Int,

    @Column(name = "ADDITIONAL_INFORMATION")
    private val additionalInformation: String,
)