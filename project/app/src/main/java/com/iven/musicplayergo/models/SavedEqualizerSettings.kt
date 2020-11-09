package com.iven.musicplayergo.models

data class SavedEqualizerSettings(
        val preset: Int,
        val bandsSettings: List<Short>?,
        val bassBoost: Short,
        val virtualizer: Short,
)