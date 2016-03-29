/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.storagegateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateTapeWithBarcodeRequest Marshaller
 */
public class CreateTapeWithBarcodeRequestMarshaller
        implements
        Marshaller<Request<CreateTapeWithBarcodeRequest>, CreateTapeWithBarcodeRequest> {

    public Request<CreateTapeWithBarcodeRequest> marshall(
            CreateTapeWithBarcodeRequest createTapeWithBarcodeRequest) {

        if (createTapeWithBarcodeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateTapeWithBarcodeRequest> request = new DefaultRequest<CreateTapeWithBarcodeRequest>(
                createTapeWithBarcodeRequest, "AWSStorageGateway");
        request.addHeader("X-Amz-Target",
                "StorageGateway_20130630.CreateTapeWithBarcode");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final SdkJsonGenerator jsonGenerator = new SdkJsonGenerator();

            jsonGenerator.writeStartObject();

            if (createTapeWithBarcodeRequest.getGatewayARN() != null) {
                jsonGenerator.writeFieldName("GatewayARN").writeValue(
                        createTapeWithBarcodeRequest.getGatewayARN());
            }
            if (createTapeWithBarcodeRequest.getTapeSizeInBytes() != null) {
                jsonGenerator.writeFieldName("TapeSizeInBytes").writeValue(
                        createTapeWithBarcodeRequest.getTapeSizeInBytes());
            }
            if (createTapeWithBarcodeRequest.getTapeBarcode() != null) {
                jsonGenerator.writeFieldName("TapeBarcode").writeValue(
                        createTapeWithBarcodeRequest.getTapeBarcode());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}