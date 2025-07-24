package io.github.kevinah95.di

import io.github.kevinah95.PlayerSDK
import io.github.kevinah95.UserViewModel
import io.github.kevinah95.getPlatform
import io.github.kevinah95.data.UserRepository
import io.github.kevinah95.data.UserRepositoryImpl
import io.github.kevinah95.db.DriverFactory
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    singleOf(::UserRepositoryImpl) { bind<UserRepository>() }
    viewModelOf(::UserViewModel)
    factory { getPlatform(this) }
    factory { DriverFactory(this) }
    single<PlayerSDK> { PlayerSDK(get()) }
}