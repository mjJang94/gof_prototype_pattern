package com.mj.gof_prototype_pattern

open class Car : Cloneable{

    private var carList : MutableList<String> ?= null

    constructor() {
        carList = ArrayList()
    }

    constructor(list: MutableList<String>) {
        this.carList = list
    }

    fun loadData() {
        carList?.add("accent")
        carList?.add("avante")
        carList?.add("sonata")
        carList?.add("grandeur")
    }

    fun getCarList() : MutableList<String>{
        return carList!!
    }

    @Throws(CloneNotSupportedException::class)
    public override fun clone(): Any {
        val temp: MutableList<String> = ArrayList()
        for (s in this.carList!!) {
            temp.add(s)
        }
        return Car(temp)
    }

}

