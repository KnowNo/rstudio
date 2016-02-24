/*
 * DocumentEx.java
 *
 * Copyright (C) 2009-16 by RStudio, Inc.
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
package org.rstudio.core.client.dom;

import com.google.gwt.dom.client.Document;

public class DocumentEx extends Document
{
   protected DocumentEx()
   {
   }

   public final native String getReadyState() /*-{
      return this.readyState || null;
   }-*/;
   
   public static final String STATE_UNINITIALIZED = "uninitialized";
   public static final String STATE_LOADING       = "loading";
   public static final String STATE_LOADED        = "loaded";
   public static final String STATE_INTERACTIVE   = "interactive";
   public static final String STATE_COMPLETE      = "complete";
}
