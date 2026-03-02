package eu.ekansh.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish_table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo("wish_title")
    val title : String = "",
    @ColumnInfo("wish_description")
    val description : String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An android Watch"),
        Wish(title = "Getting A job", description = "Private sector job"),
        Wish(title = "Clearing GATE CSIT", description = "SCoring Good marks"),
        Wish(title = "Become IES", description = "clear the ESE"),
        Wish(title = "Buy an PS6", description = "Play the GTA 6"),
    )
}