package io.github.kevinah95.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import io.github.kevinah95.Database
import org.koin.core.scope.Scope


actual class DriverFactory actual constructor(scope: Scope) {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(Database.Schema, "test.db")
    }
}