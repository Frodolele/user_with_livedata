package com.example.user_livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel: ViewModel() {

    var userList : MutableLiveData<List<User>> = MutableLiveData()
    // инициализируем список и заполняем его данными о пользователях
    init{
        userList.value = UserData.getUsers()
    }

    fun getListUsers() = userList

    // обновляем список (случай, когда нажимаем кнопку Refresh в menu)
    fun updateListUsers() {
        userList.value = UserData.getAnotherUsers()
    }

}