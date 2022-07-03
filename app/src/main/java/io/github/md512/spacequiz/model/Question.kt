package io.github.md512.spacequiz.model

import androidx.annotation.StringRes

data class Question (@StringRes val question: Int,
                     @StringRes val a1: Int,
                     @StringRes val a2: Int,
                     @StringRes val correctAnswer: Int){
}