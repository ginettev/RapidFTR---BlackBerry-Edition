
package com.rapidftr.services;

import com.sun.me.web.request.Response;

public interface ServiceCallback {
	void onRequestFailure(Object context, Exception exception);
	void onRequestSuccess(Object context, Response response);
}
