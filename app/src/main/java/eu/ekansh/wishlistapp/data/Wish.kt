package eu.ekansh.wishlistapp.data

data class Wish(
    val id: Long = 0,
    val title : String = "",
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