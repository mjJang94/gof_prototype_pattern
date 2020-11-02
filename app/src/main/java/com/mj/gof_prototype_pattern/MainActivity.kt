package com.mj.gof_prototype_pattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Car()
        car.loadData()

        val seoulBranchStore = car.clone() as Car
        val busanBranchStore = car.clone() as Car

        val seoulList= seoulBranchStore.getCarList()
        seoulList.add("EQUUS")


        val busanList = busanBranchStore.getCarList()
        busanList.remove("accent")

        println("car list : " + car.getCarList())
        println("seoul car list : " + seoulBranchStore.getCarList())
        println("busan car list : " + busanBranchStore.getCarList())
    }
}