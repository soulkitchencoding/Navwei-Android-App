/*
	SVG Kit for Android library
    Copyright (C) 2015 SCAND Ltd, svg@scand.com

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.scand.svg.css;

import com.scand.svg.css.util.SMap;

public class IdElementMatcher extends ElementMatcher {

	private String id;
	
	IdElementMatcher(IdSelector selector, String id) {
		super(selector);
		this.id = id;
	}
	
	public void popElement() {
	}

	public MatchResult pushElement(String ns, String name, SMap attrs) {
		Object id = attrs == null ? null : attrs.get("", "id");
		return id != null && id.toString().equals(this.id) ? MatchResult.ALWAYS : null;
	}

}
