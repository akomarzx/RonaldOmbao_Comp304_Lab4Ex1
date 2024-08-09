package com.example.excercise1.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.excercise1.fragment.HomeTypeToolBarFragment
import com.example.excercise1.R
import com.example.excercise1.data.AttractionType
import com.example.excercise1.fragment.HouseListFragment

class TownhouseHomeTypeActivity : AppCompatActivity() {

    public var attractionType : AttractionType = AttractionType.Townhouse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_townhouse_home_type)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()

        // Create HomeTypeToolBarFragment and set arguments
        val homeTypeToolBarFragment = HomeTypeToolBarFragment()
        val homeTypeToolbarBundle = Bundle()
        homeTypeToolbarBundle.putString("title", getString(R.string.home_menu_townhouse))
        homeTypeToolBarFragment.arguments = homeTypeToolbarBundle

        // Add HomeTypeToolBarFragment to fragmentContainerView
        mFragmentTransaction.add(R.id.fragmentContainerView, homeTypeToolBarFragment)

        // Create HouseListFragment and set arguments
        val houseListFragment = HouseListFragment()
        val houseListBundle = Bundle()
        houseListBundle.putString("type", AttractionType.Townhouse.name)
        houseListFragment.arguments = houseListBundle

        // Replace fragmentContainer_house_list with HouseListFragment
        mFragmentTransaction.replace(R.id.fragmentContainer_house_list, houseListFragment)

        // Commit the transaction
        mFragmentTransaction.commit()

    }
}