package eu.ekansh.wishlistapp

import android.content.Context
import androidx.room.Room
import eu.ekansh.wishlistapp.data.WishDatabase
import eu.ekansh.wishlistapp.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(database.wishDao())
    }

    fun provide(context: Context) {
        database = Room.databaseBuilder(context,WishDatabase::class.java,"wishList.db").build()

    }
}