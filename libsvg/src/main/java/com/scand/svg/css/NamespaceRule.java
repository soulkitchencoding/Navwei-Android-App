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

import java.io.PrintWriter;

public class NamespaceRule {

	String prefix;

	String ns;

	public NamespaceRule(String prefix, String ns) {
		this.prefix = prefix;
		this.ns = ns;
	}

	public void serialize(PrintWriter out) {
		out.print("@namespace ");
		if(prefix != null ) {
			out.print(prefix);
			out.print(" ");
		}
		out.print("\"");
		out.print(ns);
		out.println("\";");
	}

}
