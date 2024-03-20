package com.compose.ecgcomposewidget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.compose.ecgcomposewidget.core.GraphEcgWidget
import com.compose.ecgcomposewidget.core.GraphMode

class MainActivity : ComponentActivity() {

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {

    val configuration = LocalConfiguration.current
    val screenWidthDp = configuration.screenWidthDp.dp
    val screenHeightDp = configuration.screenHeightDp.dp

    Column(
        modifier = Modifier
            .padding(horizontal = 0.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        GraphEcgWidget(screenWidthDp, screenHeightDp/6, 200, GraphMode.flowing)
        Spacer(modifier = Modifier.height(16.dp))
        GraphEcgWidget(screenWidthDp, screenHeightDp/6, 128, GraphMode.overlay)
        Spacer(modifier = Modifier.height(16.dp))
        GraphEcgWidget(screenWidthDp, screenHeightDp/6, 160, GraphMode.flowing)
        Spacer(modifier = Modifier.height(16.dp))
        GraphEcgWidget(screenWidthDp, screenHeightDp/6, 140, GraphMode.overlay)
        Spacer(modifier = Modifier.height(16.dp))
        GraphEcgWidget(screenWidthDp, screenHeightDp/6, 240, GraphMode.flowing)
    }
}
