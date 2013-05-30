/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.overlord.sramp.integration.java.model;


/**
 * Information about the java model defined by the java deriver(s).
 *
 * @author eric.wittmann@redhat.com
 */
public class JavaModel {

    public static final String TYPE_JAVA_CLASS = "JavaClass";
    public static final String TYPE_JAVA_INTERFACE = "JavaInterface";
    public static final String TYPE_JAVA_ENUM = "JavaEnum";

    public static final String PROP_PACKAGE_NAME = "packageName";
    public static final String PROP_CLASS_NAME = "className";

}
