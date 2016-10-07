/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2014, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */

package org.restcomm.connect.commons.configuration.sets.impl;

import org.restcomm.connect.commons.configuration.sets.RcmlServerConfigurationSet;
import org.restcomm.connect.commons.configuration.sources.ConfigurationSource;

/**
 * @author otsakir@gmail.com - Orestis Tsakiridis
 */
public class RcmlServerConfigurationSetImpl extends ConfigurationSet implements RcmlServerConfigurationSet {
    private String baseUrl;
    private Boolean notify;


    public RcmlServerConfigurationSetImpl(ConfigurationSource source) {
        super(source);
    }

    public RcmlServerConfigurationSetImpl(String baseUrl, Boolean notify) {
        super(null);
        this.baseUrl = baseUrl;
        this.notify = notify;
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

    @Override
    public Boolean getNotify() {
        return notify;
    }
}