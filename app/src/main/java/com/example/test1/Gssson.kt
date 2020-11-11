package com.example.test1

import com.google.gson.Gson

fun GGGssontest(): Weather {
    val jsjs =
        """
{"status":"ok",
"query":"北京",
"places":
	[{"name":"北京市",
	"location":{"lat":39000555,"lng":116.5555},
	"formatted_address":"中国北京市"},
	{"name":"北京市",
	"location":{"lat":39000555,"lng":116.5555},
	"formatted_address":"中国北京市"},
	{"name":"北京市",
	"location":{"lat":39000555,"lng":116.5555},
	"formatted_address":"中国北京市"}]}"""
    val jsjs2: String = """{"status":"ok","query":"北京"}"""


    val gsgs = Gson()
    val w = gsgs.fromJson(jsjs, Weather::class.java)
    return w

    /*  Toast.makeText(this, "$jsjs2", Toast.LENGTH_SHORT).show()
      val w2: Weather2 = Gson().fromJson(jsjs2, Weather2::class.java)
      Toast.makeText(this, "${w2.toString()}", Toast.LENGTH_SHORT).show()*/

    /* val json:String="""{
 "daily_forecast": [
     {
         "date": "2017-7-25",
         "cond": {
             "txt_d": "阵雨"
         },
         "tmp": {
             "max": "34",
             "min": "27"
         }
     },
     {
         "date": "2017-7-26",
         "cond": {
             "txt_d": "晴"
         },
         "tmp": {
             "max": "38",
             "min": "27"
         }
     }
 ]
}"""
     var weather:Weather=Gson().fromJson(json,Weather::class.java)


     Toast.makeText(this, "${weather.toString()}", Toast.LENGTH_SHORT).show()*/
}