/*
 * @(#) biz.fstechnology.micro.server.Service
 * Copyright (c) 2016 4S Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 */

package biz.fstechnology.micro.server;

import biz.fstechnology.micro.common.Request;
import biz.fstechnology.micro.common.Result;
import biz.fstechnology.micro.common.Version;

/**
 * TODO Type Description
 * 
 * @author Maruyama Takayuki
 * @since 2016/01/01
 */
public interface Service {

	void init() throws Exception;

	<T> Request<T> onPreProcessRequest(Request<T> request);

	<T, U> Result<U> processRequest(Request<T> request);

	<T, U> Result<U> onPostProcessRequest(Request<T> request, Result<U> result);

	boolean isValidVersion(Request<?> request);

	Version getVersion();

}