/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flinkx.connector.elasticsearch7.index;

import org.apache.flink.streaming.connectors.elasticsearch.index.IndexGenerator;

import java.util.Objects;

/** Base class for {@link IndexGenerator}. */
public abstract class IndexGeneratorBase implements IndexGenerator {

    private static final long serialVersionUID = 1L;
    protected final String index;

    public IndexGeneratorBase(String index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o
                instanceof
                org.apache.flink.streaming.connectors.elasticsearch.index.IndexGeneratorBase)) {
            return false;
        }
        IndexGeneratorBase that = (IndexGeneratorBase) o;
        return index.equals(that.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
}
