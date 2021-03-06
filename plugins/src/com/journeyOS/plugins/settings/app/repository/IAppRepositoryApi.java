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

package com.journeyOS.plugins.settings.app.repository;

import android.os.Handler;

import com.journeyOS.core.api.ICoreApi;
import com.journeyOS.core.api.appprovider.App;

import java.util.List;

public interface IAppRepositoryApi extends ICoreApi {

    void initApps();

    Handler getAppWorkHandler();

    App getApp(String packageName);

    List<App> getAllApps();

    void insertApp(App app);

    void insertApp(List<App> apps);

    void updateApp(App app);

    void updateApp(List<App> apps);

    void deleteApp(App app);

    void deleteApp(List<App> apps);
}
