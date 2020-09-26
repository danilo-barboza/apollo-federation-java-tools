package com.apollo.federation.java.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphQLSchemaLoaderTest {

    @Test
    void shouldHaveExtendedDefinitionsInSdl() {
        assertNotNull(GraphQLSchemaLoader.load().getObjectType("User"));
    }
}