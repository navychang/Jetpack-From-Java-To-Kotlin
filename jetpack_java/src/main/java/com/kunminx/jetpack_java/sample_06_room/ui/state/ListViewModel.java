/*
 * Copyright 2018-2020 KunMinX
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kunminx.jetpack_java.sample_06_room.ui.state;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kunminx.jetpack_java.common_data.bean.Moment;
import com.kunminx.jetpack_java.sample_03_viewmodel.domain.Request;
import com.kunminx.jetpack_java.sample_06_room.domain.MomentRequest;

import java.util.List;

/**
 * Create by KunMinX at 2020/5/30
 */
public class ListViewModel extends ViewModel implements Request.IMomentRequest {

    public final MutableLiveData<List<Moment>> list = new MutableLiveData<>();

    public final MutableLiveData<Boolean> autoScrollToTopWhenInsert = new MutableLiveData<>();

    private MomentRequest mMomentRequest = new MomentRequest();

    {
        autoScrollToTopWhenInsert.setValue(true);
    }

    @Override
    public LiveData<List<Moment>> getListMutableLiveData() {
        return mMomentRequest.getListMutableLiveData();
    }

    @Override
    public void requestList() {
        mMomentRequest.requestList();
    }
}