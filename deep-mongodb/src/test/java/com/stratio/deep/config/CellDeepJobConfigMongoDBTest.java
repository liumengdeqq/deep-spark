package com.stratio.deep.config;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

import com.stratio.deep.commons.entity.Cells;
import com.stratio.deep.mongodb.config.MongoDeepJobConfig;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Created by rcrespo on 16/07/14.
 */
@Test
public class CellDeepJobConfigMongoDBTest {

    @Test
    public void createTest() {

        MongoDeepJobConfig<Cells> cellDeepJobConfigMongoDB = new MongoDeepJobConfig(Cells.class);

        assertNotNull(cellDeepJobConfigMongoDB);

        assertEquals(cellDeepJobConfigMongoDB.getEntityClass(), Cells.class);

    }

}
