package com.codingnomads.mentor_portal_api.entities.data

import com.codingnomads.mentor_portal_api.entities.business.User

data class UserRow (
    val id: Int,
    val firstName: String,
    val lastName: String,
    val roleCode: Int,
    val statusCode: Int,
    val timezoneOffset: String
    ) {
    companion object {
        fun fromEntity(user: User) = UserRow(
            id = user.id,
            firstName = user.firstName,
            lastName = user.lastName,
            roleCode = user.roleCode,
            statusCode = user.statusCode,
            timezoneOffset = user.timezoneOffset
        )
    }
}