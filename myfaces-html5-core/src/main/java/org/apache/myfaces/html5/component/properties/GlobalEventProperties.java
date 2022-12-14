/*
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
 */
package org.apache.myfaces.html5.component.properties;

import org.apache.myfaces.buildtools.maven2.plugin.builder.annotation.JSFProperty;

public interface GlobalEventProperties
{

    /**
     * HTML: Script to be invoked when the element is clicked.
     * 
     */
    @JSFProperty(clientEvent = "click")
    public String getOnclick();

    /**
     * HTML: Script to be invoked when the element is double-clicked.
     * 
     */
    @JSFProperty(clientEvent = "dblclick")
    public String getOndblclick();

    /**
     * HTML: Specifies a script to be invoked when the element loses focus.
     * 
     */
    @JSFProperty(clientEvent = "blur")
    public String getOnblur();

    /**
     * HTML: Specifies a script to be invoked when the element receives focus.
     * 
     */
    @JSFProperty(clientEvent = "focus")
    public String getOnfocus();

}
