/**
 * Author: Andrei F.
 *
 * This file is part of the "Synapse" software and is licensed under
 * under the Microsoft Reference Source License (MS-RSL).
 *
 * Please see the attached LICENSE.txt for the full license.
 */

package com.af.synapse.elements;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;

import net.minidev.json.JSONObject;

/**
 * Created by Andrei on 30/08/13.
 */
abstract class ElementSkeleton {
    public JSONObject element;
    public Activity activity;
    public LinearLayout layout;

    abstract public View getView();
}
