package eu.ekansh.wishlistapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.invalidateGroupsWithKey
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation(
    viewModel: WishViewModel = viewModel(),
    navController: NavHostController= rememberNavController()
){
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route){
            HomeView(navController= navController,viewModel=viewModel)
        }

        composable(Screen.AddScreen.route + "/{id}",
                arguments = listOf(
                    navArgument("id"){
                        type = NavType.LongType
                        nullable = false
                        defaultValue = 0L
                    }
                )
            ){

            val id = if(it.arguments != null) it.arguments!!.getLong("id") else 0L
            AddEditDetailView(id=id, viewModel= viewModel, navController = navController)
        }
    }

}