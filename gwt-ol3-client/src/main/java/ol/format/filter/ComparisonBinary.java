/*******************************************************************************
 * Copyright 2014, 2017 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol.format.filter;

import jsinterop.annotations.JsType;

/**
 * Base class for WFS GetFeature property binary comparison filters.
 * 
 * @author Tino Desjardins
 *
 */
@JsType(isNative = true)
public abstract class ComparisonBinary extends Comparison {

	/**
	 * 
	 * @param tagName The XML tag name for this filter.
	 * @param propertyName Name of the context property to compare.
	 * @param expression The value to compare.
	 */
	public ComparisonBinary(String tagName, String propertyName, String expression) {
		super(tagName, propertyName);
	}
	
	/**
     * 
     * @param tagName The XML tag name for this filter.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @param matchCase Case-sensitive?
     */
    public ComparisonBinary(String tagName, String propertyName, String expression, boolean matchCase) {
        super(tagName, propertyName);
    }
	
	/**
     * 
     * @param tagName The XML tag name for this filter.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     */
    public ComparisonBinary(String tagName, String propertyName, Number expression) {
        super(tagName, propertyName);
    }
    
    /**
     * 
     * @param tagName The XML tag name for this filter.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @param matchCase Case-sensitive?
     */
    public ComparisonBinary(String tagName, String propertyName, Number expression, boolean matchCase) {
        super(tagName, propertyName);
    }
	
}