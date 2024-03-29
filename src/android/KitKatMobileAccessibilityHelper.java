/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/

package Neux.cordova.AndroidFontSize;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.content.Context;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptioningChangeListener;

@TargetApi(19)
public class KitKatMobileAccessibilityHelper extends
        JellyBeanMobileAccessibilityHelper {
    private CaptioningManager mCaptioningManager;
    private CaptioningChangeListener mCaptioningChangeListener;
    private TouchExplorationStateChangeListener mTouchExplorationStateChangeListener;

    @Override
    public void initialize(AndroidFontSize mobileAccessibility) {
        super.initialize(mobileAccessibility);
        mCaptioningManager = (CaptioningManager) mobileAccessibility.cordova.getActivity().getSystemService(Context.CAPTIONING_SERVICE);
    }
}
