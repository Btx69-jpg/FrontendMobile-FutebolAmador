package com.example.amfootball.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.amfootball.data.local.SessionManager
import com.example.amfootball.navigation.Objects.Pages.CrudTeamRoutes


@Composable
//fun HomePageScreen(currentUser: User?){
fun HomePageScreen(globalNavController: NavHostController, sessionManager: SessionManager) {
    Column {
        //NavigatonDrawerNavBarHomePage()
        Text(text = "AMFootball", modifier = Modifier.padding(8.dp))
        Text(text = "Bem-vindo ${sessionManager.getUserProfile()?.name ?: "Convidado"}", modifier = Modifier.padding(8.dp))
        Button(
            onClick = {
                globalNavController.navigate(route = CrudTeamRoutes.CREATE_TEAM)
            }
        ) {
            Text(text = "Criar equipa")
        }
    }
}


/*
@Preview(showBackground = true)
@Composable
fun PreviewHomePage() {
    HomePageScreen(globalNavController = rememberNavController(), sessionManager = SessionManager())
}

*/