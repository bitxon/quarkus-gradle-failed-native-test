package bitxon.quarkus;

import bitxon.quarkus.ext.PostgresTestResource;
import io.quarkus.test.common.QuarkusTestResource;

@QuarkusTestResource(PostgresTestResource.class)
public class AbstractQuarkusTest {
}
