package io.github.kevinah95

import androidx.lifecycle.ViewModel
import io.github.kevinah95.data.UserRepository

class UserViewModel(
    private val repository: UserRepository,
    val platform: Platform,
    private val sdk: PlayerSDK
) : ViewModel() {

    suspend fun sayHello(name: String): String {
        val foundUser = repository.findUser(name)
        val players = sdk.getPlayers()

        return foundUser?.let { "Hello '$it' from ${platform.name} ${players.first()}" } ?: "User '$name' not found!"
    }
}