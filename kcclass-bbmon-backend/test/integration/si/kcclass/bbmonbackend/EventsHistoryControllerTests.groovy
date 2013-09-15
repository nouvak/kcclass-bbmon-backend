package si.kcclass.bbmonbackend



import java.io.File;

import grails.test.mixin.*
import groovy.sql.Sql;
import groovy.util.GroovyTestCase;

import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(EventsHistoryController)
class EventsHistoryControllerTests extends GroovyTestCase {
	
	File schemaDump
	Sql sql
	def dataSource

	public void setUp() {
		super.setUp()
		String sqlFilePath = servletContext.getRealPath("/data/veventhistory.sql")
		String sqlString = new File(sqlFilePath).text
		def sql = new Sql(dataSource)
		sql.execute(sqlString)
	}

    void testGetEventsHistory() {
		controller.getEventsHistory(14, 13, 14139, 2971)
		assert response.text == '[{"event_unixtime":1343912415,"status":1,"prev_status":null}]'
    }
}
