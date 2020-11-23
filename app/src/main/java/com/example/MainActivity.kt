package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.bejson.pojo.ColloerBean
import com.example.logic.network.Appservice
import com.example.test1.R
import com.example.logic.network.ServiceCreater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
      val addSer = ServiceCreater.create(Appservice::class.java)

      button1.setOnClickListener {


            addSer.getData(SWApplication.Token).enqueue(object : retrofit2.Callback<ColloerBean> {
                override fun onResponse(
                    call: retrofit2.Call<ColloerBean>,
                    response: retrofit2.Response<ColloerBean>
                ) {
                    val a = response.body()

                    if (a != null) {
                        Log.d("MainActivity", "${a.status}")
                        Log.d("MainActivity", "${a.api_version}")
                        Log.d("MainActivity", a.toString())
                    } else {
                        Log.d("MainActivity", "???????")
                    }
                }

                override fun onFailure(call: retrofit2.Call<ColloerBean>, t: Throwable) {
                    t.printStackTrace()
                }

            })
        }*/

      /* button2.setOnClickListener {
           Toast.makeText(this, "${SWApplication.context}", Toast.LENGTH_SHORT).show()
       }*/
/*
      Httttps.sendHttpRequest("https://api.caiyunapp.com/v2.5/{ckIblIFfPUfO8Ego}/{121.6544,25.1552}/realtime.json", object : Callback {
          override fun onFailure(call: Call, e: IOException) {
              e.printStackTrace()
          }

          override fun onResponse(call: Call, response: Response) {
              var responseData = response.body()?.string()
              Log.d("MainActivity", "$responseData")
          }
      })
*/

      /*
       val w = GGGssontest()
       button1.setOnClickListener {
           Toast.makeText(this, "${w.status + w.query}", Toast.LENGTH_LONG).show()
       }*/

  }
}
