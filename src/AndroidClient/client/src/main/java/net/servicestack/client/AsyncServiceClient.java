package net.servicestack.client;

import java.net.HttpURLConnection;
import java.util.Map;

public interface AsyncServiceClient {
    public <T> void getAsync(IReturn<T> request, final AsyncResult<T> asyncResult);
    public <T> void getAsync(IReturn<T> request, final Map<String, String> queryParams, final AsyncResult<T> asyncResult);
    public <T> void getAsync(String path, final Class responseType, final AsyncResult<T> asyncResult);
    public void getAsync(String path, final AsyncResult<HttpURLConnection> asyncResult);

    public <T> void postAsync(IReturn<T> request, final AsyncResult<T> asyncResult);
    public <T> void postAsync(String path, final Object request, final Class responseType, final AsyncResult<T> asyncResult);
    public <T> void postAsync(String path, final byte[] requestBody, final String contentType, final Class responseType, final AsyncResult<T> asyncResult);
    public void postAsync(String path, final byte[] requestBody, final String contentType, final AsyncResult<HttpURLConnection> asyncResult);

    public <T> void putAsync(IReturn<T> request, final AsyncResult<T> asyncResult);
    public <T> void putAsync(String path, final Object request, final Class responseType, final AsyncResult<T> asyncResult);
    public <T> void putAsync(String path, final byte[] requestBody, final String contentType, final Class responseType, final AsyncResult<T> asyncResult);
    public void putAsync(String path, final byte[] requestBody, final String contentType, final AsyncResult<HttpURLConnection> asyncResult);

    public <T> void deleteAsync(IReturn<T> request, final AsyncResult<T> asyncResult);
    public <T> void deleteAsync(IReturn<T> request, final Map<String, String> queryParams, final AsyncResult<T> asyncResult);
    public <T> void deleteAsync(String path, final Class responseType, final AsyncResult<T> asyncResult);
    public void deleteAsync(String path, final AsyncResult<HttpURLConnection> asyncResult);
}
