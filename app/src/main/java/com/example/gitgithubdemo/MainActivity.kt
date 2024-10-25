package com.example.gitgithubdemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Commit - Commit when you do your changes and then you save that changes.
         * Revert Commit - when you do commit but later you realize, it was wrong changes, then you can revert back commit.
         * Checkout - when you want to switch between all your commits. as you checkout then HEAD will point to that commit on your checkout.
         * Stash - stash is when you did changes but you dont want to commit it and keep this changes as it is, and want to switch to another commit
         *          then you can stash it, it will be save and when you back to that previous commit then you can unStash it.
         */

        println("This Is Contained in my Second Commit")

        println("This is Master Branch Commit")
    }
}