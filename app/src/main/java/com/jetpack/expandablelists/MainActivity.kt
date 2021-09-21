package com.jetpack.expandablelists

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.jetpack.expandablelists.ui.theme.ExpandableListsTheme
import com.jetpack.expandablelists.viewmodel.ExpandableViewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<ExpandableViewModel>()

    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpandableListsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ExpandableScreen(viewModel)
                }
            }
        }
    }
}