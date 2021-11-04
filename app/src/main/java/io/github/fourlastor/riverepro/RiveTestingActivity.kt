package io.github.fourlastor.riverepro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.rive.runtime.kotlin.core.Alignment
import io.github.fourlastor.riverepro.databinding.ActivityRiveTestingBinding

/** Sandbox to test Rive animations. */
class RiveTestingActivity : AppCompatActivity() {

  private lateinit var binding: ActivityRiveTestingBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    hideActionBar()
    binding = ActivityRiveTestingBinding.inflate(layoutInflater)

    setContentView(binding.root)

    binding.animationView.setRiveResource(
      resId = R.raw.off_road_car_blog,
      alignment = Alignment.CENTER,
    )
  }

  private fun hideActionBar() {
    supportActionBar?.run {
      // make sure bar is hidden
      setBackgroundDrawable(null)
      setDisplayShowCustomEnabled(false)
      setDisplayShowTitleEnabled(false)
      setDisplayUseLogoEnabled(false)
      setDisplayShowHomeEnabled(false)
      setDisplayHomeAsUpEnabled(false)
      elevation = 0f
      hide()
    }
  }
}
