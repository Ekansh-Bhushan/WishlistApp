package eu.ekansh.wishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao // Data Access Object
abstract class WishDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addWish(wishEntity : Wish)

    @Query("Select * from `wish_table`")
    abstract fun getAllWish() : Flow<List<Wish>>

    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)

    @Query("Select * from `wish_table` where id = :id")
    abstract fun getAWishById(id : Long) : Flow<Wish>
}