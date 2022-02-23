package com.ankit.loadnetworkimage.utility;

import com.ankit.loadnetworkimage.R;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.RequestOptions;

public class Utility {

    public static RequestOptions getGlideRequestOptions() {
        return new RequestOptions()
                .centerCrop()
                .error(R.drawable.image_error)
                .priority(Priority.HIGH);
    }
}
