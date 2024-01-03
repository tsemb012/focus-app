package com.tsemb.focusapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tsemb.focusapp.ui.theme.FocusappTheme

// DONE Bitriseの導入
// DONE コードサイズと複雑性分析
// DONE Danger
// DONE detekt
// TODO detekt Bitriseに入れる。
// TODO リリースの自動化
// TODO DeployGateに出す
// TODO GooglePlayConsoleから出すように
// TODO テスト導入
// TODO コードラビットの導入
// TODO ライブラリ管理を修正
// TODO マルチモジュール化
// TODO コミット自動化
// TODO Hiltの導入
// TODO KMP化

// TODO GithubActionsを導入
// TODO Asanaでのプロジェクト管理
// TODO SonarQube

// TODO ADHD
// TODO Ci/CD

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FocusappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FocusappTheme {
        Greeting("Android")
    }
}
