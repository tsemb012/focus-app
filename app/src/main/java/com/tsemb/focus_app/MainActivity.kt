package com.tsemb.focus_app

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
import com.tsemb.focus_app.ui.theme.FocusappTheme

//テスト

//TODO Bitriseの導入
    //TODO コードサイズと複雑性分析
    //TODO Danger
        //TODO githubApps
    //TODO klint
    //TODO detekt
    //TODO リリースの自動化
    // TODO セキュリティスキャン

//TODO コードラビットの導入

//TODO GithubActionsを導入
//TODO Asanaでのプロジェクト管理
//TODO SonarQube

//TODO マルチモジュール化
//TODO ライブラリ管理を修正
//TODO
//TODO Hiltの導入
//TODO KMP化
//TODO テストコード
//TODO ADHD
//TODO Ci/CD
//TODO コミット自動化



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FocusappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
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
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FocusappTheme {
        Greeting("Android")
    }
}