package io.github.kevinah95

import io.github.kevinah95.data.HockeyPlayer
import io.github.kevinah95.db.Database
import io.github.kevinah95.db.DriverFactory

class PlayerSDK(databaseDriverFactory: DriverFactory) {
    private val database = Database(databaseDriverFactory)

    fun getPlayers(): List<HockeyPlayer> {
        return database.getAllPlayers()
    }
}