/*
    GNU GENERAL LICENSE
    Copyright (C) 2006 The Lobo Project. Copyright (C) 2014 - 2016 Lobo Evolution

    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    verion 2 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    General License for more details.

    You should have received a copy of the GNU General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Contact info: lobochief@users.sourceforge.net; ivan.difrancesco@yahoo.it
 */
package org.lobobrowser.ua;

import org.lobobrowser.clientlet.ClientletResponse;

/**
 * An event containing information about navigation.
 */
public class NavigatorWindowEvent extends NavigatorResponseEvent {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /** The message. */
    private final String message;

    /**
     * Instantiates a new navigator window event.
     *
     * @param source
     *            the source
     * @param eventType
     *            the event type
     * @param clientletFrame
     *            the clientlet frame
     * @param response
     *            the response
     */
    public NavigatorWindowEvent(Object source, NavigatorEventType eventType,
            NavigatorFrame clientletFrame, ClientletResponse response) {
        super(source, eventType, clientletFrame, response, response
                .getRequestType());
        this.message = null;
    }

    /**
     * Instantiates a new navigator window event.
     *
     * @param source
     *            the source
     * @param eventType
     *            the event type
     * @param clientletFrame
     *            the clientlet frame
     * @param message
     *            the message
     * @param requestType
     *            the request type
     */
    public NavigatorWindowEvent(Object source, NavigatorEventType eventType,
            NavigatorFrame clientletFrame, String message,
            RequestType requestType) {
        super(source, eventType, clientletFrame, null, requestType);
        this.message = message;
    }

    /** Gets the message.
	 *
	 * @return the message
	 */
    public String getMessage() {
        return message;
    }
}