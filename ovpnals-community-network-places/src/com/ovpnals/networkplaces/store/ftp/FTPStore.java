
				/*
 *  OpenVPN-ALS
 *
 *  Copyright (C) 2003-2006 3SP LTD. All Rights Reserved
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2 of
 *  the License, or (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public
 *  License along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
			
package com.ovpnals.networkplaces.store.ftp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ovpnals.networkplaces.AbstractNetworkPlaceMount;
import com.ovpnals.networkplaces.AbstractNetworkPlaceStore;
import com.ovpnals.policyframework.LaunchSession;


/**
 * <i>Network Place</i> store type that supports connections to FTP 
 * servers.
 */
public class FTPStore extends AbstractNetworkPlaceStore {
    final static Log log = LogFactory.getLog(FTPStore.class);
	/**
	 * FTP scheme name
	 */
	public final static String FTP_SCHEME = "ftp";
    
    /**
     * Constructor.
     */
    public FTPStore() {
        super(FTP_SCHEME, "UTF-8");
    }

    /* (non-Javadoc)
     * @see com.ovpnals.vfs.AbstractNetworkPlaceStore#createMount(com.ovpnals.policyframework.LaunchSession)
     */
    protected AbstractNetworkPlaceMount createMount(LaunchSession launchSession) throws Exception {
        return new FTPMount(launchSession, this);
    }
}