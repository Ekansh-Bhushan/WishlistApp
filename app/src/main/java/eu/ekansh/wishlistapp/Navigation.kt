package eu.ekansh.wishlistapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.invalidateGroupsWithKey
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(
    viewModel: WishViewModel = viewModel(),
    navController: NavHostController= rememberNavController()
){
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route){
            HomeView(navController= navController,viewModel=viewModel)
        }

        composable(Screen.AddScreen.route){
            AddEditDetailView(id=0L, viewModel= viewModel, navController = navController)
        }
    }

}