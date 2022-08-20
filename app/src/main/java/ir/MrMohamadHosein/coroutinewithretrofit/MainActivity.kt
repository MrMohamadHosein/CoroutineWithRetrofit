package ir.MrMohamadHosein.coroutinewithretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import ir.MrMohamadHosein.coroutinewithretrofit.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiService = ApiServiceSingleton.apiService!!

        lifecycleScope.launchWhenCreated {

            Log.v("testLog" , Thread.currentThread().name)

            val data = apiService.getAllStudents()
            Log.v("testLog" , data.toString())

        }

    }
}