/*
 * Copyright (c) 2018 anqi.huang@outlook.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.journeyOS.plugins.settings.ui.adapter;

import android.graphics.drawable.Drawable;

import com.journeyOS.base.adapter.BaseAdapterData;
import com.journeyOS.plugins.R;

public class AppInfoData implements BaseAdapterData {

    private Drawable mDrawable;
    private String mAppName;
    private String mPackageName;
    private Boolean mToogle;

    public AppInfoData(Drawable drawable, String appName, String packageName, Boolean toogle) {
        this.mDrawable = drawable;
        this.mAppName = appName;
        this.mPackageName = packageName;
        this.mToogle = toogle;
    }

    public Drawable getDrawable() {
        return mDrawable;
    }

    public void setDrawable(Drawable drawable) {
        this.mDrawable = drawable;
    }

    public String getAppName() {
        return mAppName;
    }

    public void setAppName(String appName) {
        this.mAppName = appName;
    }

    public String getPackageName() {
        return mPackageName;
    }

    public void setPackageName(String packageName) {
        this.mPackageName = packageName;
    }

    public Boolean getToogle() {
        return mToogle;
    }

    public void setToogle(Boolean toogle) {
        this.mToogle = toogle;
    }

    @Override
    public int getContentViewId() {
        return R.layout.app_item;
    }
}
