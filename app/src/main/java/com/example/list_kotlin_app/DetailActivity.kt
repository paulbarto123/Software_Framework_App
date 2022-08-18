package com.example.list_kotlin_app

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.list_kotlin_app.databinding.ActivityDetailBinding


@SuppressLint("SetJavaScriptEnabled")
class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_HERO = "extra_hero"

    }

    private lateinit var handler : Handler
    private lateinit var detailBinding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        setContentView(detailBinding.root)
        handler = Handler(Looper.getMainLooper())
        supportActionBar?.title = "Detail Framework"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if(isConnect()){
            handler.postDelayed({

                val data = intent.getParcelableExtra<Hero>(EXTRA_HERO)

                when(data?.name){
                    "Spring Framework" -> setBackground(R.color.spring_secondary, R.color.spring)
                    "Grails" -> setBackground(R.color.grails_secondary, R.color.grails)
                    "Code Igniter" -> setBackground(R.color.code_igniter_secondary, R.color.code_igniter)
                    "Ionic" -> setBackground(R.color.ionic_secondary, R.color.ionic)
                    "Laravel" -> setBackground(R.color.laravel_secondary, R.color.laravel)
                    "Flutter" -> setBackground(R.color.flutter_secondary, R.color.flutter)
                    "Angular Js" -> setBackground(R.color.angular_secondary, R.color.angular)
                    "React Native" -> setBackground(R.color.react_secondary, R.color.react)
                    "Vue js" -> setBackground(R.color.vue_js_secondary, R.color.vue_js)
                    "Xamarin" -> setBackground(R.color.xamarin_secondary, R.color.react)
                    else -> setBackground(R.color.xamarin_secondary, R.color.react)
                }

                Glide.with(this@DetailActivity)
                    .load(data?.photo)
                    .into(detailBinding.ivPhoto)


                with(detailBinding){
                    tvName.text = data?.name
                    tvDetail.text = data?.detail
                    tvProgrammingLanguage.text = data?.programming_language
                    tvDevelopers.text = data?.developers
                    tvReleaseDate.text = data?.release_date

                }
                detailBinding.progress.visibility = View.GONE

            }, 0)

        }else{
            Toast.makeText(this, "Device tidak terhubung dengan internet", Toast.LENGTH_LONG).show()
        }
    }



    private fun setBackground(background: Int, colorText: Int ){
        with(detailBinding){
            vBackground.setBackgroundResource(background)
            tvName.setBackgroundResource(colorText)
        }
    }


    private fun isConnect() : Boolean{
        val connect : ConnectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        return  connect.activeNetworkInfo != null && connect.activeNetworkInfo!!.isConnected
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}