package io.github.kevinah95

import androidx.lifecycle.ViewModel
import io.github.kevinah95.data.UserRepository

class UserViewModel(
    private val repository: UserRepository,
    val platform: Platform
) : ViewModel() {

    fun sayHello(name: String): String {
        val foundUser = repository.findUser(name)
        return foundUser?.let { "Hello '$it' from ${platform.name}" } ?: "User '$name' not found!"
    }
}