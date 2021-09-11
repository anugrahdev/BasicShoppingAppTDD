package com.anugrahdev.pltestingproject

object RegistrationUtil {

    fun validateLoginInput(
        username:String,
        password:String
    ): Boolean {
        return username.count() >= 8 && password.count() >= 8
    }

}
