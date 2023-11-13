package com.example.infoapp

sealed class DrawerEvents{
    data class OnItemClick(val title: String, val index: Int): DrawerEvents()
}