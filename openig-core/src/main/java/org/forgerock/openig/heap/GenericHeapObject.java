/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions Copyright [year] [name of copyright owner]".
 *
 * Copyright 2010-2011 ApexIdentity Inc.
 * Portions Copyright 2011-2015 ForgeRock AS.
 */

package org.forgerock.openig.heap;

import org.forgerock.openig.io.TemporaryStorage;
import org.forgerock.openig.log.Logger;
import org.forgerock.openig.log.NullLogSink;

/**
 * A generic base class for heap objects with handy injected heap objects. This
 * implementation provides reasonable safe defaults, to be overridden by the
 * concrete object's heaplet.
 */
public class GenericHeapObject {

    /** Provides methods for various logging activities. */
    protected Logger logger = new Logger(new NullLogSink(), Name.of(getClass()));

    /**
     * Allocates temporary buffers for caching streamed content during
     * processing.
     */
    protected TemporaryStorage storage = new TemporaryStorage();

    /**
     * Return the logger.
     * @return the logger
     */
    public Logger getLogger() {
        return logger;
    }

    /**
     * Sets the logger.
     * @param logger the logger to set.
     */
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    /**
     * Returns the storage.
     * @return the storage
     */
    public TemporaryStorage getStorage() {
        return storage;
    }

    /**
     * Sets the storage.
     * @param storage the storage to set.
     */
    public void setStorage(TemporaryStorage storage) {
        this.storage = storage;
    }
}
