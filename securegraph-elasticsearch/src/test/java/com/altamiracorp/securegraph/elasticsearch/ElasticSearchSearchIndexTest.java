package com.altamiracorp.securegraph.elasticsearch;

import com.altamiracorp.securegraph.Graph;
import com.altamiracorp.securegraph.elasticsearch.helpers.TestHelpers;
import com.altamiracorp.securegraph.test.GraphTestBase;
import org.junit.After;
import org.junit.Before;

public class ElasticSearchSearchIndexTest extends GraphTestBase {
    @Override
    protected Graph createGraph() {
        return TestHelpers.createGraph();
    }

    @Before
    @Override
    public void before() throws Exception {
        TestHelpers.before();
        super.before();
    }

    @After
    public void after() throws Exception {
        super.after();
        TestHelpers.after();
    }
}