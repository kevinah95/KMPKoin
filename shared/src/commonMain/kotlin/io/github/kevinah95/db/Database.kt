package io.github.kevinah95.db

import io.github.kevinah95.Database
import io.github.kevinah95.data.HockeyPlayer
import io.github.kevinah95.data.PlayerQueries

internal class Database(databaseDriverFactory: DriverFactory) {
    val database = Database(databaseDriverFactory.createDriver())
    val playerQueries: PlayerQueries = database.playerQueries

    internal fun getAllPlayers(): List<HockeyPlayer> {
        return playerQueries.selectAll().executeAsList()
    }
}