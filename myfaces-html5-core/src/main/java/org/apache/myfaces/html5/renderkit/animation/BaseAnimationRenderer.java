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

package org.apache.myfaces.html5.renderkit.animation;

import org.apache.myfaces.html5.component.animation.AbstractBaseAnimation;
import org.apache.myfaces.html5.renderkit.util.RendererUtils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;
import java.io.IOException;

public abstract class BaseAnimationRenderer extends Renderer {

    @Override
    public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {
        super.encodeBegin(facesContext, uiComponent);

        RendererUtils.checkParamValidity(facesContext, uiComponent, AbstractBaseAnimation.class);

        AbstractBaseAnimation component = (AbstractBaseAnimation) uiComponent;

        ResponseWriter writer = facesContext.getResponseWriter();
        writer.write(" " +  getKeyFrameBodyDefinition(facesContext, component) + " ");
    }

    protected abstract String getKeyFrameBodyDefinition(FacesContext facesContext, AbstractBaseAnimation component);

}
