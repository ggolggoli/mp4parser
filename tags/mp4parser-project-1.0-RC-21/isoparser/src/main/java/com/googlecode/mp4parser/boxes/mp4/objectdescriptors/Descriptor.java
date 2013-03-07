/*
 * Copyright 2011 castLabs, Berlin
 *
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an AS IS BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.lang.annotation.*;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Created by IntelliJ IDEA.
 * User: mstattma
 * Date: 06.08.2010
 * Time: 06:54:58
 * To change this template use File | Settings | File Templates.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Descriptor {
    int[] tags();

    int objectTypeIndication() default -1;
}
