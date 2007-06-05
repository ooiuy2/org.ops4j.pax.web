/* Copyright 2007 Alin Dreghiciu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.web.service;

public class SysPropsHttpServiceConfiguration
    implements HttpServiceConfiguration
{

    private final static int DEFAULT_HTTP_PORT = 80;
    private final static int DEFAULT_HTTP_SECURE_PORT = 443;

    private int m_httpPort;
    private int m_httpSecurePort;

    private boolean m_httpEnabled = true;
    private boolean m_httpSecureEnabled = true;

    public SysPropsHttpServiceConfiguration()
    {
        m_httpPort = Integer.getInteger( "org.osgi.service.http.port", DEFAULT_HTTP_PORT);
        m_httpSecurePort = Integer.getInteger( "org.osgi.service.http.port.secure", DEFAULT_HTTP_SECURE_PORT);
    }

    public int getHttpPort()
    {
        return m_httpPort;
    }

    public boolean isHttpEnabled()
    {
        return m_httpEnabled;
    }

    public int getHttpSecurePort()
    {
        return m_httpSecurePort;
    }

    public boolean isHttpSecureEnabled()
    {
        return m_httpSecureEnabled;
    }

}
