/*
 * Copyright (c) 2011 Julien Nicoulaud <julien.nicoulaud@gmail.com>
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package net.nicoulaj.idea.markdown.lang;

import com.intellij.psi.tree.TokenSet;

/**
 * TODO Add Javadoc comment.
 *
 * @author Julien Nicoulaud <julien.nicoulaud@gmail.com>
 * @since 0.1
 */
public interface MarkdownTokenTypeSets extends MarkdownTokenTypes {

    /**
     * TODO Add Javadoc comment.
     */
    public static final TokenSet PLAIN_TEXT_SET = TokenSet.create(
            PLAIN_TEXT
    );

    /**
     * TODO Add Javadoc comment.
     */
    public static final TokenSet BOLD_TEXT_SET = TokenSet.create(
            BOLD_TEXT
    );

    /**
     * TODO Add Javadoc comment.
     */
    public static final TokenSet ITALIC_TEXT_SET = TokenSet.create(
            ITALIC_TEXT
    );

    /**
     * TODO Add Javadoc comment.
     */
    public static final TokenSet LINK_SET = TokenSet.create(
            LINK
    );

    /**
     * TODO Add Javadoc comment.
     */
    public static final TokenSet BAD_CHARACTER_SET = TokenSet.create(
            BAD_CHARACTER
    );
}