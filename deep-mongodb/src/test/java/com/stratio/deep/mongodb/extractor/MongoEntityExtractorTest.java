/*
 * Copyright 2014, Stratio.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.stratio.deep.mongodb.extractor;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.rdd.RDD;
import org.bson.BSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.stratio.deep.commons.config.ExtractorConfig;
import com.stratio.deep.commons.extractor.utils.ExtractorConstants;
import com.stratio.deep.core.context.DeepSparkContext;
import com.stratio.deep.core.entity.BookEntity;
import com.stratio.deep.core.entity.CantoEntity;
import com.stratio.deep.core.entity.WordCount;
import com.stratio.deep.core.extractor.ExtractorEntityTest;
import com.stratio.deep.core.extractor.ExtractorTest;

import scala.Tuple2;

/**
 * Created by rcrespo on 18/06/14.
 */

@Test(suiteName = "mongoRddTests", groups = { "MongoEntityExtractorTest" }, dependsOnGroups = "MongoCellExtractorTest")
public class MongoEntityExtractorTest extends ExtractorEntityTest {

    private static final Logger LOG = LoggerFactory.getLogger(MongoEntityExtractorTest.class);

    public MongoEntityExtractorTest() {
        super(MongoEntityExtractor.class, "localhost:27890", null, false);
    }



}
