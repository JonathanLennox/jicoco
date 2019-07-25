/*
 * Copyright @ 2015 - present, 8x8 Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jitsi.cmd;

/**
 * An exception thrown when unrecoverable parsing error occurs.
 *
 * @author Pawel Domas
 */
public class ParseException
    extends Exception
{
    /**
     * Creates new instance of <tt>ParseException</tt>.
     * @param message parse exception message.
     */
    public ParseException(String message)
    {
        super(message);
    }
}
