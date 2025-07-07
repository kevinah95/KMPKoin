package io.github.kevinah95

import androidx.compose.ui.window.ComposeUIViewController
import io.github.kevinah95.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = { initKoin() }) { App() }