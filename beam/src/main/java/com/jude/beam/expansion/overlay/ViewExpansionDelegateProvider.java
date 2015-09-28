package com.jude.beam.expansion.overlay;

import android.content.Context;
import android.widget.FrameLayout;

/**
 * Created by Mr.Jude on 2015/8/17.
 */
public abstract class ViewExpansionDelegateProvider {
    public abstract ViewExpansionDelegate createViewExpansionDelegate(Context context, FrameLayout container);

    public static ViewExpansionDelegateProvider DEFAULT = new ViewExpansionDelegateProvider() {
        @Override
        public ViewExpansionDelegate createViewExpansionDelegate(Context context, FrameLayout container) {
            return new DefaultViewExpansionDelegate(context,container);
        }
    };

}
