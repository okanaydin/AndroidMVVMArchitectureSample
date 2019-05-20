package com.okanaydin.androidmvvmarchitecturesample.ui.post

import android.view.View
import androidx.lifecycle.MutableLiveData
import com.okanaydin.androidmvvmarchitecturesample.R
import com.okanaydin.androidmvvmarchitecturesample.base.BaseViewModel
import com.okanaydin.androidmvvmarchitecturesample.network.PostApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-05-20 - 01:59          │
└─────────────────────────────┘
 */

class PostListViewModel: BaseViewModel(){
    @Inject
    lateinit var postApi: PostApi

    val loadingVisibility: MutableLiveData<Int> = MutableLiveData()
    val errorMessage:MutableLiveData<Int> = MutableLiveData()
    val errorClickListener = View.OnClickListener { loadPosts() }

    private lateinit var subscription: Disposable

    init{
        loadPosts()
    }

    override fun onCleared() {
        super.onCleared()
        subscription.dispose()
    }

    private fun loadPosts(){
        subscription = postApi.getPosts()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { onRetrievePostListStart() }
            .doOnTerminate { onRetrievePostListFinish() }
            .subscribe(
                { onRetrievePostListSuccess() },
                { onRetrievePostListError() }
            )
    }

    private fun onRetrievePostListStart(){

        loadingVisibility.value = View.VISIBLE
        errorMessage.value = null

    }

    private fun onRetrievePostListFinish(){

        loadingVisibility.value = View.GONE

    }

    private fun onRetrievePostListSuccess(){

    }

    private fun onRetrievePostListError(){

        errorMessage.value = R.string.post_error

    }

}