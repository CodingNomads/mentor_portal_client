package com.codingnomads.mentor_portal_api.entity.business

data class StudentPostPayload(
    /**
     * user fields
     */
    val id: Int? = null,
    val firstName: String,
    val lastName: String,
    val bio: String,
    val timezoneOffset: String,
    /**
     * contact fields
     */
    val email: String,
    val telephone: String,
    val location: String,
    val forumUsername: String,
    val slackUsername: String,
//    /**
//     * security fields
//     */
//    val username: String,
//    val passwordHash: String,
//    val isAdmin: Boolean,
    /**
     * config
     */
    val courseTrack: String,
    val mentorshipOption: String,
    val assignedMentors: MentorData? = null
)