package com.oss.perfmon.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.oss.perfmon.ui.screen.HomeScreen
import com.oss.perfmon.ui.screen.MonitorScreen
import com.oss.perfmon.ui.screen.ResmonScreen
import com.oss.perfmon.ui.screen.SystemScreen

object Routes {
    const val HOME = "home"
    const val MONITOR = "monitor"
    const val RESMON = "resmon"
    const val SYSTEM = "system"
}

@Composable
fun PerfMonNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = Routes.HOME,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        composable(Routes.HOME) { HomeScreen(navController) }
        composable(Routes.MONITOR) { MonitorScreen(navController) }
        composable(Routes.RESMON) { ResmonScreen(navController) }
        composable(Routes.SYSTEM) { SystemScreen(navController) }
    }
}
