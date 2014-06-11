/*
 * PackratServerOperations.java
 *
 * Copyright (C) 2009-14 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.packrat.model;

import org.rstudio.studio.client.server.Void;
import org.rstudio.studio.client.server.ServerRequestCallback;
import org.rstudio.studio.client.workbench.views.buildtools.model.BuildServerOperations;

import com.google.gwt.core.client.JsArray;

public interface PackratServerOperations extends BuildServerOperations
{
   void getPackratPrerequisites(
         ServerRequestCallback<PackratPrerequisites> requestCallback);
   
   void installPackrat(
         ServerRequestCallback<Boolean> requestCallback);
   
   void getPackratContext(
         ServerRequestCallback<PackratContext> requestCallback);
   
   void getPackratStatus(String dir,
         ServerRequestCallback<JsArray<PackratStatus>> requestCallback);
   
   void packratBootstrap(String dir,
                         boolean enter,
                         ServerRequestCallback<Void> requestCallback);
   
   void getPackratRestoreActions(String dir,
         ServerRequestCallback<JsArray<PackratPackageAction>> requestCallback);

}
