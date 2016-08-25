/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import retrofit2.Retrofit;
import fixtures.bodycomplex.Arrays;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.Validator;
import fixtures.bodycomplex.models.ArrayWrapper;
import fixtures.bodycomplex.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Arrays.
 */
public final class ArraysImpl implements Arrays {
    /** The Retrofit service to perform REST calls. */
    private ArraysService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Arrays.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ArraysImpl(Retrofit retrofit, AutoRestComplexTestServiceImpl client) {
        this.service = retrofit.create(ArraysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Arrays to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ArraysService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/array/valid")
        Observable<Response<ResponseBody>> getValid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/array/valid")
        Observable<Response<ResponseBody>> putValid(@Body ArrayWrapper complexBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/array/empty")
        Observable<Response<ResponseBody>> getEmpty();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/array/empty")
        Observable<Response<ResponseBody>> putEmpty(@Body ArrayWrapper complexBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/array/notprovided")
        Observable<Response<ResponseBody>> getNotProvided();

    }

    /**
     * Get complex types with array property.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ArrayWrapper> getValid() throws ErrorException, IOException {
        return getValidAsync().toBlocking().single();
    }

    /**
     * Get complex types with array property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<ArrayWrapper> getValidAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        return ServiceCall.create(getValidAsync(), serviceCallback);
    }

    /**
     * Get complex types with array property.
     *
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<ArrayWrapper>> getValidAsync() {
        return service.getValid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ArrayWrapper>>>() {
                @Override
                public Observable<ServiceResponse<ArrayWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ArrayWrapper> clientResponse = getValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ArrayWrapper> getValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<ArrayWrapper, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ArrayWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putValid(ArrayWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException {
        return putValidAsync(complexBody).toBlocking().single();
    }

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putValidAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putValidAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putValidAsync(ArrayWrapper complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types with array property which is empty.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ArrayWrapper> getEmpty() throws ErrorException, IOException {
        return getEmptyAsync().toBlocking().single();
    }

    /**
     * Get complex types with array property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<ArrayWrapper> getEmptyAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        return ServiceCall.create(getEmptyAsync(), serviceCallback);
    }

    /**
     * Get complex types with array property which is empty.
     *
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<ArrayWrapper>> getEmptyAsync() {
        return service.getEmpty()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ArrayWrapper>>>() {
                @Override
                public Observable<ServiceResponse<ArrayWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ArrayWrapper> clientResponse = getEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ArrayWrapper> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<ArrayWrapper, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ArrayWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putEmpty(ArrayWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException {
        return putEmptyAsync(complexBody).toBlocking().single();
    }

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putEmptyAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putEmptyAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putEmptyAsync(ArrayWrapper complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putEmpty(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ArrayWrapper> getNotProvided() throws ErrorException, IOException {
        return getNotProvidedAsync().toBlocking().single();
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<ArrayWrapper> getNotProvidedAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        return ServiceCall.create(getNotProvidedAsync(), serviceCallback);
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<ArrayWrapper>> getNotProvidedAsync() {
        return service.getNotProvided()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ArrayWrapper>>>() {
                @Override
                public Observable<ServiceResponse<ArrayWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ArrayWrapper> clientResponse = getNotProvidedDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ArrayWrapper> getNotProvidedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<ArrayWrapper, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ArrayWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
