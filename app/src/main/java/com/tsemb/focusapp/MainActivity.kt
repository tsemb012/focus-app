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
// DONE detekt Bitrise に入れる。
  //DONE Danger と AndroidLint, detekt のログを出力する。
//DONE READMEの配置
  //DONE READMEに配置する内容を考える
  //DONE 問題点を指摘するように修正　→　detektと指摘される多すぎるのでいらない　→　

// TODO コードラビットの導入
// TODO 管理を行う
// TODO DeployGateに出す
    //TODO qa/* の
// TODO GithubActionsでタスク管理を自動化


// TODO リリースの自動化
    // TODO 正規リリースできる環境を整える
    // TODO GooglePlayConsoleから出すように

// TODO テスト導入
// TODO ライブラリ管理を修正
// TODO マルチモジュール化
// TODO コミット自動化
// TODO Hiltの導入
// TODO KMP化

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
