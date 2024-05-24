package fpoly.namth.asm_kot104

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fpoly.namth.asm_kot104.ui.screen.Home
import fpoly.namth.asm_kot104.ui.screen.LoginScreen
import fpoly.namth.asm_kot104.ui.screen.HomeScreen
import fpoly.namth.asm_kot104.ui.screen.ProductDetail
import fpoly.namth.asm_kot104.ui.screen.SignupScreen
import fpoly.namth.asm_kot104.ui.theme.ASM_KOT104Theme
import fpoly.namth.asm_kot104.ui.screen.Wellcome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ASM_KOT104Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navControl = rememberNavController()

                    NavHost(
                        navController = navControl,
                        startDestination = "splash"
                    ) {
                        composable("splash") {
                            Wellcome(navControl)
                        }
                        composable("login") {
                            LoginScreen(navControl)
                        }
                        composable("sign") {
                            SignupScreen(navControl)
                        }

                        composable("home") {
                            HomeScreen(navControl)
                        }
                        composable(Screens.ProductDetail.screen) {
                            ProductDetail()
                        }



                    }
                }
            }
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ASM_KOT104Theme {
            val navControl = rememberNavController()
            HomeScreen(navControl)
        }
    }
}