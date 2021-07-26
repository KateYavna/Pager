package com.example.pager

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pages = arrayListOf<Page>(
            Page(
                resources.getString(R.string.by1), resources.getString(R.string.mult_by_one),
                BitmapFactory.decodeResource(resources, R.drawable.sea1)
            ),
            Page(
                resources.getString(R.string.by2), resources.getString(R.string.mult_by_two),
                BitmapFactory.decodeResource(resources, R.drawable.sea2)
            ),
            Page(
                resources.getString(R.string.by3), resources.getString(R.string.mult_by_three),
                BitmapFactory.decodeResource(resources, R.drawable.sea3)
            ),
            Page(
                resources.getString(R.string.by4), resources.getString(R.string.mult_by_four),
                BitmapFactory.decodeResource(resources, R.drawable.sea4)
            ),
            Page(
                resources.getString(R.string.by5), resources.getString(R.string.mult_by_five),
                BitmapFactory.decodeResource(resources, R.drawable.sea5)
            ),
            Page(
                resources.getString(R.string.by6), resources.getString(R.string.mult_by_six),
                BitmapFactory.decodeResource(resources, R.drawable.sea6)
            ),
            Page(
                resources.getString(R.string.by7), resources.getString(R.string.mult_by_seven),
                BitmapFactory.decodeResource(resources, R.drawable.sea7)
            ),
            Page(
                resources.getString(R.string.by8), resources.getString(R.string.mult_by_eight),
                BitmapFactory.decodeResource(resources, R.drawable.sea8)
            ),
            Page(
                resources.getString(R.string.by9), resources.getString(R.string.mult_by_nine),
                BitmapFactory.decodeResource(resources, R.drawable.sea9)
            ),
            Page(
                resources.getString(R.string.by10), resources.getString(R.string.mult_by_ten),
                BitmapFactory.decodeResource(resources, R.drawable.sea10)
            )
        )

        vpViewPager.adapter = PagesAdapter(pages,supportFragmentManager)
    }
}